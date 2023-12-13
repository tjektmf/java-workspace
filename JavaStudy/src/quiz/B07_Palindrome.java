package quiz;

import java.util.Scanner;

public class B07_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단어를 입력하셍 ");

		String word = sc.next();

		int same = 0;
		int diff32 = 0;

		for (int i = 0; i < (word.length() - 1) / 2; i++) {

			if (Math.abs((int) word.charAt(i) - (int) word.charAt(word.length() - 1 - i)) == 32) {
				same += 1;
				diff32 += 1;
			} else if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				same += 1;
			} else {
				same += 0;
			}
		}
		if (same != (word.length() - 1) / 2) {
			System.out.println("좌우대칭아님");
		} else if (same == (word.length() - 1) / 2 && diff32 == 0) {
			System.out.println("좌우대칭임");
		} else if (same == (word.length() - 1) / 2 && diff32 != 0) {
			System.out.println("대소문자는 다른데 좌우대칭임");
		}
	}
}
