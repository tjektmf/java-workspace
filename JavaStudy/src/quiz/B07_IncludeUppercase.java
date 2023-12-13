package quiz;

import java.util.Scanner;

public class B07_IncludeUppercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단어입력해  ");

		String word = sc.next();

		int len = word.length();
		int upperCheck = 0;
		boolean finalCheck = true;

		for (int i = 0; i < len; i++) {
			// 대ㅔ문자 65~90
			if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
				++upperCheck;
				finalCheck &= false;
			}
		}
		if (upperCheck == 0) {
			System.out.println("대문자없음");
		} else {
			System.out.println("대문자있음");
		}
		if (finalCheck) {
			System.out.println("대문자없음 boolean");
		} else {
			System.out.println("대문자있음 boolean");
		}

	}

}
