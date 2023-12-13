package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 20;
		int c = 14;
		int d = -20;
		int e = 10;
		int f = Math.abs(d - e);
		int year = 604;
		
		boolean powerOn = false;
		
		
		// 블럭씌우고 Ctrl + / 하면 그부분 전부 주석처리
		// 절댓값 = absolute value > abs
		System.out.println("1 " + ( a > 10 && a < 20 ));
		System.out.println("2 " + ( b % 2 == 0 ));
		System.out.println("3 " + (c % 7 == 0 ));
		System.out.println("4 " + ( f == 30 ));
		System.out.println("5 " + (year % 400 == 0 || year % 4 == 0 && year % 100 != 0));
		// &&를 ||보다 무조건 먼저해서 위의 코드에서 ()를 굳이 안써도 상관없음
		System.out.println("6 " +  !powerOn);
		
		Scanner sc = new Scanner(System.in);

		
		String str = "yes";
		System.out.println("7 " + (str == "yes"));
		System.out.print("ㄹㅇ?? yes/no ");
		String userInput = sc.next();

		System.out.println("7+ " + userInput.equals("yes"));
		
		//문자열비교시 .equals() 메서드를 사용해야함
		// 모든 참조형 변수는 equals() 메서드를 통해 비교해야함
		//str yes는 이미 str에 저장해놓은 정해진 값
		//유저인풋은 뭐가 어케써질지 모르는 값이니까 equals()메서드를 통해 비교함
				
		
	}

}
