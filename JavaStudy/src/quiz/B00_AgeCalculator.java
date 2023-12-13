package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {
	
	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		
		System.out.print("생년 월 일  ?  ");
		
		int year = age.nextInt();
		
		System.out.print("그럼 넌 ");
		System.out.print(2024-year);
		System.out.print("살이야\n");
		
		System.out.print("생일은 " + (age.nextInt()) + "월 " + (age.nextInt()) + "일");
		
		

	
		
		
		
		
	}

}
