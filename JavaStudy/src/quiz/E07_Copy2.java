package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class E07_Copy2 {

	// 폴더 이름을 전달하면 해당 폴더 이름에 2를 붙인 새 폴더안에 모든 내용을 복사하는 메서드

	public static void duplicateFolder(String folderName) {

		File mainFolder = new File("C:/ds/JavaStudy/");
		for (File getFolder : mainFolder.listFiles()) {
			// System.out.println(getFolder);
			if (getFolder.isDirectory() && getFolder.getName().equals(folderName)) {
				System.out.println(getFolder);
				folderName = getFolder.getName();
				System.out.println(folderName);

				File dupleFolder = new File("C:/ds/JavaStudy/" + folderName + "2");
				System.out.println(dupleFolder);
				if (!dupleFolder.exists()) {
					dupleFolder.mkdirs();
				}
			}
		}
	}

	public static void duplicateFile(String folderName) {

		File mainFile = new File("C:/ds/JavaStudy/" + folderName + "/");

		for (File getAll : mainFile.listFiles()) {
			// System.out.println(getAll);
			String fileName = getAll.getName();

			File outFile2 = new File(mainFile + "2");
			File outFile = new File(mainFile + "2", fileName);
			// System.out.println(outFile2);

			if (!getAll.isDirectory()) {

				FileInputStream in = null;
				FileOutputStream out = null;

				try {
					in = new FileInputStream(getAll);
					out = new FileOutputStream(outFile);
				} catch (FileNotFoundException e) {
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
			} else if (getAll.isDirectory()) {
	//			 System.out.println(outFile);
				// System.out.println(getAll);

				if (!outFile.exists()) {
					outFile.mkdirs();
				}
				for (File getAll2 : getAll.listFiles()) {
					System.out.println(getAll2);
					
					try {
						FileReader in = new FileReader(getAll2);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

//				for(File getAll2 : getAll.listFiles()) {
//					
//				}

				// File outFile = new File(mainFile + "2", fileName);

			}
		}

	}

	public static void main(String[] args) {

		// duplicateFolder("myfiles");
	//	duplicateFile("myfiles");

	}

}
