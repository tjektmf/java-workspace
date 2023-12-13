package quiz;

import java.util.Scanner;

public class B06_CheckDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int numLong = sc.nextInt();
		int absNum = Math.abs(numLong);

		if (numLong != 0) {

			for (int i = 1, num = 0; i <= absNum; i *= 10) {
				++num;
				if (absNum / i < 10) {
					System.out.println("그건 " + num + "자리");
				}

			}
		} else {
			System.out.println("0");

		}

	}

}
