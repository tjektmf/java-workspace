package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E07_Copy1 {

	// 1. myfiles의 파일들 중 .txt 파일들을 mytxts 폴더에 복사

	// 2. myfiles의 파일들 중 그림 파일들을 myimages 폴더에 복사

	public static void main(String[] args) {

		File f1 = new File("C:/ds/JavaStudy/myfiles/");
		File f2 = new File("C:/ds/JavaStudy/myfiles/mytxts/");
		File f3 = new File("C:/ds/JavaStudy/myfiles/myimages/");

		System.out.println(f2.mkdir());
		System.out.println(f3.mkdir());
		int txt = 1;
		int img = 1;
		File[] files1 = f1.listFiles();
		byte[] b = new byte[50000];
		for (File f : files1) {
			System.out.println(f);
			if (f.toString().contains(".txt")) { // "".endsWith(CharSeq) : 이거쓰면 더 확실하게 가능
				try {
					FileInputStream in = new FileInputStream(f);
					b = in.readAllBytes();
					in.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					FileOutputStream out = new FileOutputStream("C:/ds/JavaStudy/myfiles/mytxts/txt" + txt++ +".txt");

					
					out.write(b);
					out.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (f.toString().contains("jpg")) { // "".endsWith(CharSeq) : 이거쓰면 더 확실하게 가능

				try {
					FileInputStream in = new FileInputStream(f);

					b = in.readAllBytes();
					in.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					FileOutputStream out = new FileOutputStream("C:/ds/JavaStudy/myfiles/myimages/img" + img++ + ".jpg");

					out.write(b);
					out.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

//		byte[] arr = new byte[5000];
//		for (File f : files1) {
//			if(f.toString().contains("txt")) {
//				
//				try {
//					FileInputStream in = new FileInputStream(f);
//					arr=in.readAllBytes();
//					in.close();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				try {
//					FileOutputStream out = new FileOutputStream("C:/ds/JavaStudy/myfiles/mytxts/");
//					out.write(arr);
//					out.close();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} else if(f.toString().contains("jpg")) {
//				try {
//					FileInputStream in = new FileInputStream(f);
//					arr=in.readAllBytes();
//					in.close();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				try {
//					FileOutputStream out = new FileOutputStream("C:/ds/JavaStudy/myfiles/myimages/");
//					out.write(arr);
//					out.close();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} 
//			System.out.println(f);
//		}

//		try {
//			FileInputStream in = new FileInputStream("C:/ds/JavaStudy/myfiles/");
//			
//			if()
//			in.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		

	}

}
