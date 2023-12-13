package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_UpdownGame {

	public static void main(String[] agrs) {

		Random ran = new Random();

		int gameAns = ran.nextInt(100) + 1; // +1없으면 0에서 99해서 총 100개임
		System.out.println(gameAns);
		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 100에서 골라 ");

		int chance = 0;
		for (int i = 0; i < 5; i++) {
			int yourAns = sc.nextInt();

			if (yourAns < 0 || yourAns > 100) {
				System.out.println("범위맞게 다시ㄱㄱㄱ");
				i--;
				System.out.println("기회 " + (4 - i) + "번 남음");
			} else if (yourAns < gameAns) {
				System.out.println("UP 한번더?");
				System.out.println("기회 " + (4 - i) + "번 남음");
				chance++;
			} else if (yourAns > gameAns) {
				System.out.println("DOWN 한번더?");
				System.out.println("기회 " + (4 - i) + "번 남음");
				chance++;

			} else {
				System.out.println("니가이김ㅅㄱ");
				System.out.println(chance + 1 + "번 만에 맞췄네");
				break;

			}

		}
		if (chance == 5) {
			System.out.println("정답은 " + gameAns + "임ㅅㄱ");
		}
	}

}
