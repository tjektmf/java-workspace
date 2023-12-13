import java.util.Random; // Ctrl + Shift + O 하기싫으면 이거 직접 쳐도됨
import java.util.Scanner;

public class B12_Random {

	public static void main(String[] args) {

		/*
		 * 무작위 숫자 생성
		 * 
		 * 1. java.util.Random 클래스 사용
		 * 
		 * 2. Math.random() 메서드 사용
		 */

		Random ran = new Random(); // 스캐너쓰듯이
		Scanner sc = new Scanner(System.in);
		

		int num1 = ran.nextInt(); // 따로 설정안하면 int타입 전범위 0부터 n-1 값까지 나옴
		int num2 = ran.nextInt(9); // 0~9
		int num3 = ran.nextInt(100); // 0~100
		int num4 = ran.nextInt(201) + 100; // 201넣으면 0~200이고 100더하면 100~300
		int num5 = ran.nextInt(81) - 50; // -50 ~ +30

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		// Math.random() : 0 <= x < 1 범위의 랜덤 실수를 생성하는 메서드
		for (int i = 0; i < 5; i++) { // 얘도 위랑 같이 0포함 n은 미포함
			
			// 50~70
			System.out.println((int) (Math.random() * 21 + 50));

		}

		/*
		 * Math.random()으로 원하는 범위의 랜덤숫자 만들기 step 1) 0 < = x < 1
		 * 
		 * 1. 경우의 수 의 개수를 곱한다 bound 역할 step2) 0*21 <= x < 1*21
		 * 
		 * 2. 곱한 결과를 int로 변환 ( 소숫점 아래 삭제) step3) (int) Math.floor는 소숫점버림, Math.random은 더블타입임
		 * 
		 * 3. 더하거나 빼서 원하는 범위를 만듬 step4) 50 <= x < 71
		 * 
		 * 
		 */

		// 100~127
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 28 + 100));
		}

	}
}
