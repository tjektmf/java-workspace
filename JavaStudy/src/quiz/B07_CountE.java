package quiz;

import java.util.Scanner;

public class B07_CountE {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력해 ");
		
		String text = sc.nextLine();
		
		int len = text.length();
		int countE = 0;
		// e E 69 101
		for ( int i = 0; i < len; i++) {
			if ( text.charAt(i) == 'E' || text.charAt(i) == 'e') {
				++countE;
			}
		}
		System.out.println(countE);
	}
}