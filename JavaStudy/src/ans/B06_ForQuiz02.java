package ans;

import java.util.Scanner;

public class B06_ForQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 ");
		int lastNum = sc.nextInt();

		if (lastNum >= 0) {
			for (int i = 0, cnt = 0; i <= lastNum; ++i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}

		} else {
			for ( int i = 0, cnt = 0; i >= lastNum; --i) {
				if ( i % 5 == 0) {
					System.out.print(i + " ");
					if ( ++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}

	}
}