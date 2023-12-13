package ans;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_EncryptFile {

	final private static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !@#$%^&*()_-_=+\\/?.,<>";
	final private static int CAESAR_LENGTH = CAESAR_CHARSET.length();

	public static int encrypt(int ch, int key) {

		// indexOf 로 위치찾아서 매개변수 key만큼 위치옮김 idx index
		int idx = CAESAR_CHARSET.indexOf(ch);

		// idx가 -1나오면 시저셋에 포함되지않은 ch이므로
		if (idx == -1) {
			return ch;
		} else {
			return CAESAR_CHARSET.charAt((idx + key) % CAESAR_LENGTH);
		}
	}

	public static char[] encrypt(char[] text, int key, int len) {

		for (int i = 0; i < len; i++) {
			text[i] = (char) encrypt(text[i], key);
		}
		return text;
	}

	public static int getRandomKey() {
		return (int) (Math.random() * (CAESAR_LENGTH - 1) + 1); // 길이 그대로 사용해서 0나오면 암호화가 안됨
	}

	public static int encryptTextFile1(String path) {
		File srcFile = new File(path);
		String srcFileName = srcFile.getName();
		File targetFile = new File(srcFile.getParentFile(),
				srcFileName.substring(0, srcFileName.lastIndexOf('.')) + "encrypted.enc"); // (경로, 파일이름)
		// "".substring(beginIndex, endIndex) : A <= x < B 를 반환함
		// "".indexOf("str") : 문자열에서 원하는 문자열의 위치를 찾아 반환, 만약 못찾으면 -1을 리턴

		int key = getRandomKey();

		// try ()안에 넣었을때 in에 빨간밑줄이 나오는 이유는 ()안에 in.close()가 포함되어있기 때문 close에 대한 예외처리를
		// 해줘야함
		// try 안에 두줄되면 ; 써줘야함 한줄이면 상관없음
		try (FileReader in = new FileReader(srcFile); FileWriter out = new FileWriter(targetFile);) {

			int ch;
			while ((ch = in.read()) != -1) {
				out.write(encrypt(ch, key));
			}
			return key;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		}
	}

	public static int encryptTextFile2(String path) {
		File srcFile = new File(path);
		String srcFileName = srcFile.getName();
		File targetFile = new File(srcFile.getParentFile(),
				srcFileName.substring(0, srcFileName.lastIndexOf('.')) + "encrypted2.enc"); // (경로, 파일이름)

		int key = getRandomKey();

		// try ()안에 넣었을때 in에 빨간밑줄이 나오는 이유는 ()안에 in.close()가 포함되어있기 때문 close에 대한 예외처리를
		// 해줘야함
		// try 안에 두줄되면 ; 써줘야함 한줄이면 상관없음
		try (FileReader in = new FileReader(srcFile); FileWriter out = new FileWriter(targetFile);) {

			char[] buff = new char[1024]; // int ch는 한개씩 char[]는 1024개씩
			int len;
			while ((len = in.read(buff)) != -1) {
				for (int i = 0; i < len; i++) {
					encrypt(buff[i], key);
				}
				out.write(buff);
			}

			return key;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		}
	}

	public static int encryptTextFile3(String path) {
		File srcFile = new File(path);
		String srcFileName = srcFile.getName();
		File targetFile = new File(srcFile.getParentFile(),
				srcFileName.substring(0, srcFileName.lastIndexOf('.')) + "encrypted3.enc"); // (경로, 파일이름)

		int key = getRandomKey();

		// try ()안에 넣었을때 in에 빨간밑줄이 나오는 이유는 ()안에 in.close()가 포함되어있기 때문 close에 대한 예외처리를
		// 해줘야함
		// try 안에 두줄되면 ; 써줘야함 한줄이면 상관없음
		try (FileReader fin = new FileReader(srcFile);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(targetFile);
				BufferedWriter out = new BufferedWriter(fout);) {

			int ch;
			while((ch=in.read())!=-1) {
				out.write(encrypt(ch, key));
				
			}

			return key;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		}
	}

	public static void main(String[] args) {

		double before = System.nanoTime();
		encryptTextFile1("myfiles/frankenstein.txt");
		double after = System.nanoTime();
		System.out.printf("time1: %.3f초\n", (after - before) / Math.pow(10, 9));

		before = System.nanoTime();
		encryptTextFile2("myfiles/frankenstein.txt");
		after = System.nanoTime();
		System.out.printf("time2: %.3f초\n", (after - before) / Math.pow(10, 9));
		
		before = System.nanoTime();
		encryptTextFile3("myfiles/frankenstein.txt");
		after = System.nanoTime();
		System.out.printf("time3: %.3f초\n", (after - before) / Math.pow(10, 9));
		

	}

}
