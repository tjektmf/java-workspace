package ans;

import java.util.Scanner;

public class B04_MakeSeason {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("월? ");
		int month = sc.nextInt();

		switch (month) {
		case 12, 1, 2:
			System.out.println("겨울");
			break;
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("ㄴㄴ");
			break;

		}

		if (month < 1 || month > 12) {
			System.out.println("ㄴㄴㄴ");
		} else if (month >= 11 || month <= 2) {
			System.out.println("winter");
		} else if (month >= 9) {
			System.out.println("Fall");
		} else if (month >= 6) {
			System.out.println("Summer");
		} else {
			System.out.println("Spring");
		}
	}

}
