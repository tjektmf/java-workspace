package ans;

import java.util.Scanner;

public class B06_CheckDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 ");
		
		int digit = 0;
		
		for (int num = sc.nextInt(); num > 0; num /= 10 ) {
			System.out.printf("%d번째 나누기 : %d\n", digit++, num);
		}
		System.out.println(digit + "자리");
		
		// 숫자를 10씩 크게 만들면서 10을 몇 번 곱했는지 세서 알아내기

//		int digit = 0;
//		for ( int compare = 1; compare <= num; compare *= 10) {
//			System.out.println("compare: " + compare);
//			++digit;
//		}
//		System.out.println(digit + "자리 숫지ㄹ자임");
	}

}
