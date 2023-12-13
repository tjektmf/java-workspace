package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 몇 개 살래? ");
		double apple = sc.nextDouble();
		System.out.println("그럼 바구니는 " + (int)((Math.ceil(apple/10))) + "개 필요해");
		
		
		System.out.print("바나나는 몇 개 살래? ");
		int banana = sc.nextInt();
		
		if (banana <= 0) { 
			System.out.println("외않사?"); // 입력값체크, 제일먼저 하는게 좋음
		} else if (banana % 10 == 0) {
			System.out.println("그럼 바구니는 " + (banana/10) + "개 필요해 ");
		} else if (banana >=1) {
			System.out.println("그럼 바구니는 " + ((Math.ceil(banana/10)+1)) + "개 필요해 ");
		}		
		//	수식은 변수를 활용해서 최대한 중복사용을 줄이는게 
		//	코드간소화에도 유리하고 다른사람이 알아보기도 편함
		//	블록지정하고 Ctrl + / 하면 전부 주석
		
	}

}
