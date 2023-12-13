package quiz;

import java.util.Scanner;

public class B09_Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력ㄱㄱ:");
		int num = sc.nextInt();

		int primeCount = 0;
		boolean primeCheck = true; // 트루값나오면 소수임

		for (int i = 2; i <= num; i++) { // 1은 소수가 아니라서 1부터 시작할 필요가 없음
			primeCheck = true; // 초기값을 리셋해주는 작업이 필요함 >> 이게 중요 
			for (int j = 2; j < i; j++) { // i가 1과 i로 나누어지는걸 배제
				if (i % j == 0) {
					primeCheck = false; // 굳이 &=로 비교할필요 없고 한번이라도 false값이 나오면 break
					break; // 굳이 else if써서 primeCheck = true 작업을 할 필요가 없음
				} 

			}
			if (primeCheck) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i = 2; i <= num; i++) {
			primeCount = 0; // 초기값을 리셋해주는 작업이 필요함
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					++primeCount;
				}
			}
			if (primeCount == 1) {
				System.out.print(i + " ");
			}
		}
	}
}