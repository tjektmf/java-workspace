
public class B06_For {
	
	public static void main(String[] args) {
		
		/*	반복문 (Loop)
		 * 
		 * 	- for, while, forEach, do-while(x)
		 * 	- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
		 * 
		 * 	for문
		 * 
		 * 	for ( a; b; c){d}
		 * 	a : 초기값 : for문을 처음 실행하면 딱 한번 실행되는 곳
		 * 	b : 반복조건 : true인 경우 {}를 실행, false인 경우 {}를 실행하지 않고 종료
		 *  c : 증감 : {}의 코드가 실행되면(b가 true) 실행됨
		 * 	d : b값이 참인 동안 반복실행할 코드
		 * 
		 */
		
		for (int i = 0; i < 5; ++i) { // ++i i++ 상관없음
			System.out.println("ㅎㅇ" + ++i);
	
		}
		
		/*
		 * 	1. 가장 기본적인 for문
		 * 	
		 * 	초기값에 0을 주고, 조건에 반복하고 싶은 횟수를 적는 방식
		 * 	증가는 1씩
		 * 
		 */
		
		for (int a = 0; a < 20; ++a ) { // 초기값이 1이 아닌 0으로 하는게 더 편하도록 시스템이 맞춰져있음
			System.out.println(a + "번"); // 받아들이는게 좋음
		}
		
		
		/*
		 *  2. 초기값, 조건, 증감값을 자유롭게 설정한 for문
		 *  for문을 자유롭게 변경하여 용도에 맞게 사용
		 *  조건 자리에는 다양한 비교 연산을 넣을 수 있다
		 *  증감값 자리에 다양한 연산을 사용 가능
		 */
		for (int i = 1000; i >= 500; i -= 5) {
			System.out.println(i);
		}
		
		for ( int i = 1; i < 1000; i *= 7) {
			System.out.println(i);
		}
		
		// 모든 byte타입의 값을 출력
		
	
		for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; ) { //!=를 이용해 멈출 수도 있음
			System.out.println(++i); // System.out.println(++i); 이런 느낌으로 해도됨
		}
		
		/*
		 * 	3. 각 자리에 값을 생략한 for문
		 * 	모든 자리에 값을 넣지 않아도 for문 사용 가능
		 * 	조건을 생략하면 무한반복, 생략된 조건은 true라고 판단하기 때문
		 * 	값을 생략하더라도 ;는 반드시 넣어야함 ex) for ( ; ; ){} 
		 * 	
		 */
	}
}
