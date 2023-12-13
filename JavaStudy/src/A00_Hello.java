
public class A00_Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello, world");
		System.out.println(123141);
		System.out.println('ㄹ');
		System.out.println(1.2);
		System.out.println(true);
		System.out.println(false);
		System.out.println(1212121212121212L);
		System.out.println(12.12121212121212);
		System.out.println(12.12121212121212f);
		
		
		// System.out.println()
		// () 안에 전달한 데이터를 출력
		/*
		 * ()안에 전달할 수 있는 데이터의 종류(자바의 리터럴)
		 * 1. 그냥 숫자 (""없음) : 정수(Integer), 계산가능
		 * 2. "" 사이에 들어간 모든 문자 : 문자열(String), + 만 가능, - 불가능
		 * 3. ''사이에 들어간 단 하나의 문자 : 문자(Character), 계산가능
		 * 4. 소수 : 실수(Double), 계산가능
		 * 5. True or False : 참/거짓 데이터
		 * 6. 아주 큰 숫자 뒤에 L : 큰 정수(Long), 계산가능, 소문자가능
		 * 7. 소수 뒤에 F : 짧은 실수(Float), 계산가능, 소문자가능

		
		 */
		// 숫자끼리 +, -, *, / 등 계산그낭함
		
		System.out.println(25*4);
		System.out.println(91/3); // 정수끼리 계산하면 정수인 몫만 구하고 나머지 버림
		System.out.println(91/3.0); // 좀더 정확한 값을 구함
		System.out.println(3333333333L/1234.333);
		System.out.println(3333333333l/1234.333); // L안붙이면 인트 범위를 넘었다고 오류뜸
		
		
		
		// 문자열은 다른 타입과 +를 통해 이어붙이기 가능
		System.out.println("Apple" + "Pen");
		System.out.println("Apple : " + 1 + "개");
		System.out.println("오늘? " + true);
		System.out.println("오늘? " + false);
		System.out.println("오늘 먹은거 : " + 2500 + 2000 + 2000 + "원"); // 숫자먼저 계산해줘야함
		System.out.println("오늘 먹은거 : " + (2500 + 2000 + 2000) + "원"); // 괄호쓰면 해결됨
		System.out.println("오늘 먹은거 : " + 2500 * 3 * 3 + "원"); // 곱셈은 그냥 하면 되는듯
		
		
		// 윈도우 - 쇼뷰 - 패키지 익스플로러 하면 좌측 팝업 다시 생김
	}
}
