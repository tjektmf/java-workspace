package ans;

import java.util.Scanner;

import myobj.tong.TongGame2;

public class C06_TongGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			TongGame2 start = new TongGame2();
			start.play();
			System.out.println("N 누르면 끝남 ");

			if (sc.next().charAt(0) == 'N') {
				break;
			}
		}
		System.out.println("끝");

	}

}
