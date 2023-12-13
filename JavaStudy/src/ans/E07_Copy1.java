package ans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E07_Copy1 {

	public static void main(String[] args) {
		copyTextFilesOnly("./myfiles/", "./mytxts/");
		copyImageFilesOnly("./myfiles/","./myimages/");

	}

	public static void copyTextFilesOnly(String src, String dst) {

		File srcDir = new File(src);
		File dstDir = new File(dst);

		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue; // 폴더는 확장자가 없음
			}
			System.out.println(srcFile); // 파일경로를 다 불러옴
			System.out.println(srcFile.getName()); // 파일이름만 불러옴
			String fileName = srcFile.getName();
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			// "".substring(index) : 인덱스부터 끝까지 문자열 리턴
			// "".IndexOf("str") : 해당 문자열의 위치 반환, last붙이면 뒤에서부터 찾음
			System.out.printf("파일 이름은 %s, 확장자는 %s\n", fileName, ext);

			if (ext.equals(".txt")) {

				// 부모 디렉토리, 파일이름
				File dstFile = new File(dstDir, fileName);

				FileReader in = null;
				FileWriter out = null;
				try {
					in = new FileReader(srcFile); // read write 동시에 해도됨
					out = new FileWriter(dstFile);

					char[] buff = new char[1024];
					int len;

					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						if (out != null) {
							out.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static Set<String> IMAGE_EXTENSIONS = new HashSet<>();

	static {
		IMAGE_EXTENSIONS.add("jpg");
		IMAGE_EXTENSIONS.add("png");
		IMAGE_EXTENSIONS.add("bmp");

	}

	public static void copyImageFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);

		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue; // 폴더는 확장자가 없음, 아래 indexOf에서 -1이 리턴되면 substring에서 오류발생
			}
			System.out.println(srcFile); // 파일경로를 다 불러옴
			System.out.println(srcFile.getName()); // 파일이름만 불러옴
			String fileName = srcFile.getName();
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			// "".substring(index) : 인덱스부터 끝까지 문자열 리턴
			// "".IndexOf("str") : 해당 문자열의 위치 반환, last붙이면 뒤에서부터 찾음
			System.out.printf("파일 이름은 %s, 확장자는 %s\n", fileName, ext);

			if (IMAGE_EXTENSIONS.contains(ext)) {
				File dstFile = new File(dstDir, fileName);
				FileInputStream in = null;
				FileOutputStream out = null;
				try {
					in = new FileInputStream(srcFile);
					out = new FileOutputStream(dstFile);
					
					out.write(in.readAllBytes()); // allBytes로 읽어온걸 다시 써서 내보냄 한줄로가능
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					if (out != null) {
						out.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}
}
