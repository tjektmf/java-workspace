package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Calendar;

public class E09_EncryptFile {

	/*
	 * $ 시저 암호
	 * 
	 * - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘
	 * 
	 * - 키값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고 암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화가 된다
	 * 
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'"
	 * 
	 * Hello!! 를 오른쪽으로 10만큼 밀면 RovvyCC가 됨 > 암호화 다시 왼쪽으로 10만큼 밀면 원래의 평문이 됨 > 복호화
	 * 
	 */

	/*
	 * frankenstein.txt를 시저암호를 사용해 frankenstein_encrypted.enc를 생성
	 * 
	 * 1. byte 방식으로 한글자씩 암호화 속도
	 * 
	 * 2. char 방식으로
	 * 
	 * 3. char[]
	 * 
	 * 4. 버퍼를 추가하여
	 * 
	 */

	final public static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'\"";

	public static String encrypt(String text, int key) {

		StringBuilder sb = new StringBuilder();
		int lenOfCharset = CAESAR_CHARSET.length();
		int len = text.length();

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int cipherIndex = (index + key) % lenOfCharset;
				sb.append(CAESAR_CHARSET.charAt(cipherIndex));
			} else
				sb.append(ch);
		}

		return sb.toString();
	}

	public static String decrypt(String text, int key) {

		StringBuilder sb = new StringBuilder();
		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int plainIndex = (index - key) % lenOfCharset;

				if (plainIndex < 0) {
					// key 값을 뺀 결과가 0보다 작으면
					sb.append(CAESAR_CHARSET.charAt(lenOfCharset + plainIndex));

				} else {
					// key 값을 뺀 결과가 0보다 크면 그대로 사용
					sb.append(CAESAR_CHARSET.charAt(plainIndex));
				}

			} else {
				sb.append(ch);
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		Calendar now2 = Calendar.getInstance();
		
		load();
		

	}

	public static void load() {

		File f1 = new File("C:/ds/JavaStudy/myfiles/frankenstein.txt");

		try (FileReader in = new FileReader(f1);
				FileWriter out = new FileWriter("myfiles/frankenstein_encrypted.enc");
						) {

			StringBuilder sb = new StringBuilder();
			char[] buff = new char[1024];
			int len;
			while ((len = in.read()) != -1) {
		//		System.out.print((char) len);
		//		System.out.print(encrypt(""+(char)len, 50));
				out.write(encrypt(""+(char)len, 50));
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
