package ans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E07_Copy2 {

	public static void copyDirectory(String path) {
		copyDirectory(new File(path), new File(path+2));
	}
	
	public static void copyDirectory(File srcDir, File dstDir) {
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				copyDirectory(srcFile, new File(dstDir, srcFile.getName()));
			} else {
				copyFile(srcFile, new File(dstDir, srcFile.getName()));
			}
		}
	}

	public static void copyFile(File srcFile, File dstFile) {

		// try문의 ()안에서 선언한 객체는 try문의 범위를 벗어나면 자동으로 close() 메서드를 실행
		// finally문에서 사용한 close() 싹지워서 깔끔해짐

		try (FileInputStream in = new FileInputStream(srcFile); FileOutputStream out = new FileOutputStream(dstFile);) {

			out.write(in.readAllBytes()); // allBytes로 읽어온걸 다시 써서 내보냄 한줄로가능
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		copyDirectory("myfiles");
	}

}
