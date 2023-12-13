
public class B03_If {
	
	public static void main(String[] args) {
		
		/*
		 * 	if문
		 * 	()안의 값이 true면 {}안의 코드를 실행하는 문법
		 * 	()안의 값이 false면 {}안의 코드를 무시함

		 * 	else if문
		 * 	여러번 사용이 가능하지만 단독으로 사용이 불가
		 * 	if문이 false값을 가질 때 실행됨
		 * 
		 * 	else
		 * 	위에 있는 if문 else if문이 모두 실행되지 않은 경우
		 * 	{}의 내용을 실행함 단독사용불가, 마지막에 한번만 사용가능
		 * 	else가 붙어있으면 해당 if문은 무조건 실행(모든값이 아닐경우 실행되므로)
		 */
		
		System.out.println("프로그램 시작");
		
		int a = -33;
		if (a > 10) {
			System.out.println("if문의 {}가 실행됨");
		} else if (a % 2 == 0) {
			System.out.println("a가 10보다 작으면서 짝수임");
		} else if( a > -30) {
			System.out.println("a가 10보다 작고 -30보다는 큰 홀수");
		} else {
			System.out.println("모든 조건이 맞지 않음");
		}
		
		// Ctrl + Shift + F : 들여쓰기를 맞춰줌
		// 블록지정 후 Ctrl + I : 지정한 부분 들여쓰기 맞춤
		
		char appleGrade = 'C';
		int price;
		
		if (appleGrade == 'A') {
			price = 1200;
		} else if (appleGrade == 'B') {
			price = 800;
		} else if (appleGrade == 'C') {
			price = 600;
		} else {
			price = 0;
		}
		System.out.println(price);
		// if문의 기본 형식 if (dd) {dd;}
		
		System.out.println("프로그램 끝");
		

	}

}
