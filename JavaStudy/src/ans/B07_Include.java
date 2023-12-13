package ans;

import java.util.Scanner;

public class B07_Include {

	public static void main(String[] args) {

		System.out.print("단어 입력 ");

		String word = new Scanner(System.in).next();

		// 한글자씩 보면서 대문자가 있을 때 표시
		boolean 대문자있다 = false;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				대문자있다 = true;
				break; // 해당 값을 찾으면 반복문을 즉시 종료함
			}
		}
		System.out.println(대문자있다);

	}

}
