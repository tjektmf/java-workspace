package quiz;

import java.util.Scanner;

public class B00_Coffee {
	
	public static void main(String[] args) {
		
		Scanner coffee = new Scanner(System.in);
		
		System.out.print("아메리카노 몇 잔?  ");
		
		int ameriCano = coffee.nextInt();
		
		System.out.print("라떼는? ");
		
		int cafeLatte = coffee.nextInt();
		
		System.out.print("모카는? ");

		
		int cafeMocha = coffee.nextInt();
		
		System.out.println("아메리카노 " + ameriCano + "잔, 카페라떼 " + cafeLatte 
								+ "잔, 카페모카 " + cafeMocha + "잔을 주문하셨군요");
		
		System.out.println("총 " + (ameriCano * 1600 + cafeLatte * 2700 + cafeMocha * 3300) 
									+ "원 입니다 고갱님");
		// 커피가격을 상수로 빼면 더 깔끔하게 가능하고 나중에 가격변동시 수정도 편함
		
		
		/* String format = "아메리카노 - %d잔\n"
							+ "카페라떼 - %d잔\n"
							+ "카페모카 - %d잔\n"
							+ "---------------\n"
							+ "총합\t%d원\n;
		System.out.printf(format, 아아, 라떼, 모카, 총가격);
		첫번째 콤마앞에 형식을 만들어주고 두번째 값부터 형식에 차례대로 집어넣음
		
		*/
	}

}
