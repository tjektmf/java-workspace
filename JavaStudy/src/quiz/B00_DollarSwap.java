package quiz;

import java.util.Scanner;

public class B00_DollarSwap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("얼마있어?  ");
		// 1000원 = 0.75달러
		
		String won = "원";
		double koreaWon = sc.nextDouble();
		
		
		double wondollarRate = 0.00075;
		double usaDollar = koreaWon * wondollarRate;
		
		System.out.print("그건 ");
		System.out.printf("%.2f", usaDollar);
		System.out.print("$야\n");
		System.out.println("그건 " + usaDollar + "$야");
		
		
	}

}
