package quiz;

import java.util.Random;

public class B12_TempPassword {

	public static void main(String[] args) {
		char a = 66;
		for (int i = 0; i < 4; i++) {
			// 65~90
			// System.out.print( (int) (Math.random() * 26 + 65));
			char b = (char) (int) (Math.random() * 26 + 65);

			System.out.print(b);

		}

		System.out.println();

		Random ran = new Random();

		int num = ran.nextInt(); // int 전범위

		for (int i = 0; i < 4; i++) {
			int num2 = ran.nextInt(26) + 65; // 이문장이 for문 밖에있으면 같은거로 4개나옴
			System.out.print((char) num2);

		}
	}
}