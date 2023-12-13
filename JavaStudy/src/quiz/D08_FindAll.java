package quiz;

import java.util.Scanner;

public class D08_FindAll {

	public static void main(String[] args) {

		// 문자열과 찾을 문자를 전달하면 해당 문자의 모든 위치를 출력해주는 메서드

		whereYouAt();
		where('a');
		findAll(text, 'a');

	}

	static String text = "apple/banana/orange/grape/gul/pineapple/watermalon";

	public static void whereYouAt() {

		Scanner sc = new Scanner(System.in);
		String pick = sc.next();
		System.out.println("문자 하나 입력");
		System.out.println(text.indexOf(pick));

		for (int i = 1; text.indexOf(pick) + i + 1 <= text.length(); i++) {
			if (pick.equals(text.substring(text.indexOf(pick) + i, text.indexOf(pick) + i + 1))) {
				System.out.println(text.indexOf(pick) + i);
			}
		}
	}

	public static void where(char tex) {
		// System.out.println(text.indexOf('p', 3));
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == tex) {
				System.out.println(text.indexOf(tex, i));
			}
		}
	}

	public static void findAll(String text, char ch) {

		int foundIndex = -1;
		int i = 0;
		while ((foundIndex = text.indexOf(ch, foundIndex + 1)) != -1) {
			System.out.printf("%d번째 %c의 위치 : %d\n", i++, ch, foundIndex);
		}
	}
}
