package quiz;

import java.util.Scanner;

public class B04_MakeSeason {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 월임??? ");

		int month = sc.nextInt();

		if (month < 0 || month > 13) {
			System.out.println("모라구??");
		} else if (month < 3 || month > 11) {
			System.out.println("겨울임");
		} else if (month < 11 || month > 8) {
			System.out.println("가을임");
		} else if (month < 9 || month > 5) {
			System.out.println("여름임");
		} else if (month < 6 || month > 2) {
			System.out.println("봄임");
		}

		switch (month) {
		case 1:
			System.out.println("겨울ㅇㅇㅇㅇ");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄봄");
			break;
		case 5:
			System.out.println("봄봄봄");
			break;
		case 6:
			System.out.println("6월은 여름");
			break;
		case 7:
			System.out.println("7월은 여름");
			break;
		case 8:
			System.out.println("8월은 여름");
			break;
		case 9:
			System.out.println("9월은 가을");
			break;
		case 10:
			System.out.println("10월은 가울");
			break;
		case 11:
			System.out.println("11월은 가을");
			break;
		case 12:
			System.out.println("12월은 겨울");
			break;
		default:
			System.out.println("그런건없어");
		}
	}

}
