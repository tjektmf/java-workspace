package quiz;

import java.util.Scanner;

public class B08_Numeric {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력ㄱㄱㄱ  ");

		String text = sc.nextLine();

		int len = text.length();
		int i = 0;
		boolean trueCheck = true; // 모두숫자일때 트루

		for (i = 0; i < len; i++) {

			if (text.charAt(i) < '0' || text.charAt(i) > '9') { // 숫자가 아닌게 참이면, 즉 숫자가 아니면
				System.out.println("모두 숫자는 아님");
				trueCheck &= false;
				break;
			} else if ( i == len-1) {
				System.out.println("모두 숫자임");				
			}
		}
		if (trueCheck) {
			System.out.println("모두 숫자임");
		}	
	}
}
