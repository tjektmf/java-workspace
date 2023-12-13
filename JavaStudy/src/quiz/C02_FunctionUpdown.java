package quiz;

import java.util.Random;
import java.util.Scanner;

public class C02_FunctionUpdown {

	
	// 클래스 내에서 함수들사이 자유롭게 변수 주고 받을 수 있음
	// 랜덤정수 하나 만들어서 변수에 넣어놓으면 다른 함수로 가져다 쓸 수 있음 {}넘어가도 상관없음

	public static int getUserGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ㄱㄱㄱㄱ : ");
		return sc.nextInt(); // 이게 그냥 메인에서 int getUserGuess = sc.nextInt();랑 같은기능임 
	}

	public static int getWinNum(int start, int end) {
		return (int) (Math.random() * (end - start + 1) + start);
	} // 이것도 start값이랑 end값 두개 받고 if문같은거로 그안에서 랜덤정수하나 뽑아내는 거랑 같음
	// int getWinNum = (int) (Math.random() * (end - start + 1) + start); 이거랑 그냥 같은기능임
	// 변수 이름을 a b c 이런거로 쓰니 받아들이기 힘든거임 변수이름 신경써야댐

	public static int checkWin(int userGuess, int winNum) { // userGuess winNum 둘다 메인에서 선언한 변수임
		if (userGuess == winNum) {
			return 2;
		} else if (userGuess > winNum) {
			return 1;
		} else if (userGuess < winNum) {
			return 0;
		} else {
			return -1;
		}
	}

//	public static int begin(char go) {
//		
//	}
	public static void main(String[] args) {
		// 범위를 정해주면 랜덤으로 정답을 하나 생성해 받아오는 기능
		int winNum = getWinNum(1, 100);
		int chance = 5;
//		System.out.print("Y or N  ");
//		char ch = sc.next(); // 메인에 스캐너가 없어서 이것도 안됨
		
		

		while (chance>0) { // 무한반복은 for 보다 while 이 편함
			// 사용자로부터 입력을 하나 받아오는 기능
			int userGuess = getUserGuess(); // 여기서 while문에 의해 반복해서 입력을 받음 
			int result = checkWin(userGuess, winNum);

			switch (result) {
			case 0:
				System.out.printf("up / 남은기회 %d / %d\n", --chance, winNum);
				break;
			case 1:
				System.out.printf("down / 남은기회 %d / %d\n", --chance, winNum);
				break;
			case 2:
				System.out.println("right");
				return; // main에서 return을 하는 것은 프로그램의 종료를 의미함
			case -1:
				System.out.println("오류발생");
				return;
			default:
				System.out.println("몬가이상함");
				return;
			}
		}
		System.out.printf("정답은 %d 임니다\n", winNum);
	}
}
