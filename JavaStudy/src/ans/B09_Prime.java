package ans;

import java.util.Scanner;

public class B09_Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(">>  ");
		int num = sc.nextInt();
		
		//	i 소수 검사
		//	약수가 2개인지
		//	2부터 i-1에 약수가 존재하면 소수아님
		// 	2부터 루트i까지 약수가 존재하면 소수아님 < 속도는 좀 빨라지긴함
		// 	Math.sqrt(i) << 이게 루트i
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			int count = 0;

			// 이번 숫자 i에 대한 약수의 개수 검사
			for (int chk = 1; chk <= i; chk++) {
				if (i % chk == 0) {
					++count;
//					System.out.printf("%d는 %d로 나누어떨어짐 [약수의 개수 : %d개]\n", i, chk, count);
//				}
				}
//			// 검사가 끝났을때 약수의 개수가 2개면 소수
//			System.out.printf("%d는 소수ㅠ임?? %s\n", i, count==2);
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}

	}
}