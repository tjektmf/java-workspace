package quiz;

import java.util.Scanner;

public class B07_pali2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단어 입력ㄱㄱㄱ ");

		String word = sc.next();

		int len = word.length();
		boolean right = true;

		for (int i = 0; i <= len / 2; i++) {
			if (word.charAt(i) != word.charAt(len - 1 - i)) {
				right &= false;
			}
		}

		if (right == true) {
			System.out.println("좌우대칭임");
		} else {
			System.out.println("좌우대칭아님");
		}

	}

}
