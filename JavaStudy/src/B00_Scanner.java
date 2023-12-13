import java.util.Scanner; // java패키지 안에 util패키지 안에 Scanner클래스
// 패키지는 전부 소문자 클래스는 첫글자만 대문자

import quiz.A00_Rabbit;


public class B00_Scanner {
	
	
	/*
	 * 	import ??
	 * 
	 * 	다른 패키지에 있는 클래스를 사용할 수 있게 하는 문법
	 * 	같은 패키지에 있는 클래스는 import 없이 사용 가능
	 * 	
	 * 	java.util.Scanner 클래스
	 * 
	 *  입력을 받을 수 있는 기능
	 *  새 스캐너를 생성할 때 어느곳으로부터 입력받을지 설정
	 *  (System은 현재 컴퓨터의 콘솔을 의미함)
	 *  System.out : 콘솔로 데이터를 내보내는 통로 시스템에서 나감
	 *  System.in : 콘솔로부터 데이터를 받아오는 통로 시스템으로 들어감
	 * 
	 */
	
	public static void main(String[] args) {
		
//		A00_Hello.main(null); // 같은 디폴트패키지에 있어서 그냥 가져올 수 있음
//		A00_Rabbit.main(null);// quiz 패키지에 있기 때문에 사용하려면 import가 필요
		
		Scanner sc = new Scanner(System.in); // Ctrl + Shift + o : 자동 import 단축키
		
		// 새 스캐너를 생성 (입력 통로 설정)
		
		System.out.print("ㄴㅇㄹㅇㄴㄹ> ");
		// 입력 안내 문구 출력 (print를 사용해야 옆에 입력 가능 ln으로 하면 아랫줄에 써야해서 별로임)
		
		int num = sc.nextInt();
		// nextInt() : 다음으로 입력받는 숫자 하나를 꺼내는 스캐너의 기능
		
		System.out.println("입력숫자 : " + num);
		System.out.println("입력숫자 x3 : " + num*3);
		System.out.println("두번째로 입력 : " +sc.nextInt());
		System.out.println("세번째로 입력 : ? " +sc.nextInt());
		
		
		/*
		 * 	스캐너의 대표적인 기능
		 * 	1. next타입() 메서드 - nextInt(), nextDouble(), nextLong().. nextFloat() 등
		 * 
		 * 	사용자가 콘솔에 입력하는 여러 값들 중 하나만 꺼낸 후 원하는 타입으로 변환하여 가져오는 기능	
		 * 	사용자는 공백을 사용해 한번에 여러값을 입력할 수 있다 
		 * 	공백, \t, \n 을 통해 각 값을 구분 <<
		 * 	만약 입력 통로에 남아있는 값이 없다면 프로그램을 멈추고 다음 입력을 기다림
		 * 
		 * 	2. next() 메서드
		 * 
		 * 	통로에 있는 값 하나를 무조건 문자열로 꺼낸다 / next()는 문자열을 꺼냄
		 * 	공백, \t, \n을 통해 각 값을 구문함
		 * 	통로에 남아있는 값이 없다면 다음 입력을 기다림

		 *  3. nextLine() 메서드
		 *  
		 *  통로에 있는 값을 모두 문자열로 꺼낸다(즉 한 줄을 입력받음)
		 *  \n만으로 값을 구분하기 때문에 모든 값을 꺼냄 <<
		 *  통로에 남아있는 값이 없다면 다음 입력을 기다림
		 *  
		 * 
		 */
		
	}

}
