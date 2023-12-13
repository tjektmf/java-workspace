package quiz;

import java.util.Scanner;

public class B06_ForQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int maxNum = sc.nextInt();
		int i = 0;
		int b = 0;

		for (i = 1; i <= Math.abs(maxNum); i++) {
			if ((i % 5 == 0) && (maxNum > 0)) {
				System.out.print(i + " ");
				++b;
				if (b % 10 == 0) {
					System.out.print("\n");
				}
			} else if ((i % 5 == 0) && (maxNum < 0)) {
				System.out.print("-" + i + " ");
				++b;
				if (b % 10 == 0) {
					System.out.print("\n");
				}
			}
		}
		if (maxNum == 0) {
			System.out.println("0");

		}
	}
}
