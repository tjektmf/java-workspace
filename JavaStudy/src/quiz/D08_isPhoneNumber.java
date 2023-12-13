package quiz;

import java.util.Scanner;

public class D08_isPhoneNumber {

	/*
	 * $ 사용자로부터 입력받은 문자열이 유효한 번호인지 검사하는 매서드
	 * 
	 */
	public static void main(String[] args) {

		check();
	}

	static String phoneNumber = "";
	static String onlyNumber = "";

	public static String input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("폰번호 입력 :  ");
		phoneNumber = sc.next();
		return phoneNumber;
	}

	public static String onlyNumber() {
		int len = phoneNumber.length();
		for (int i = 0; i < len; i++) {
			if (phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9') {
				onlyNumber += phoneNumber.charAt(i);
			}
		}
		// System.out.println(onlyNumber);
		return onlyNumber;
	}

	// 11자리, 010으로 시작, 번호로 이루어짐

	public static void check() {

		input();
		onlyNumber();

		int onlyNumberSize = onlyNumber.length();
		for (int i = 0; i < onlyNumberSize; i++) {
			if (!(onlyNumber.length() == 11 && onlyNumber.substring(0, 3).equals("010"))) {
				System.out.println("번호아닌듯?");
				return;
			}
		}
		System.out.println("유효한 번호임");
	}
}