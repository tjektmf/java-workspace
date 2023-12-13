package quiz;

import java.util.Scanner;

public class B10_Prime2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 ㄱㄱㄱ  ");

		int num = sc.nextInt();
		int i = 2;
		// boolean 활용
		System.out.println(" boolean 활용");
		while (i <= num) {

			boolean primeTrue = true;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					primeTrue = false;
					break;
				}
				j++;
			}
			if (primeTrue) {
				System.out.print(i + " ");

			}
			i++;

		}
		System.out.println("\n 단순계산");
		
		// 단순 계산
		int a = 2;
		while (a <= num) {
			int b = 2;
			int primeCount = 0;
			while (b < a) {
				if (a % b == 0) {
					primeCount++;
					break;
				}
				b++;
			}
			if (primeCount == 0) {
				System.out.print(a + " ");
			}
			a++;
		}

	}

}
