package quiz;

import java.util.Random;

public class B12_Count369 {

	public static void main(String[] args) { // 0~9 3

		Random ran = new Random();

		int game = ran.nextInt(401) + 100;

		int game1 = (game / 100);
		int game2 = ((game % 100) / 10);
		int game3 = ((game % 100) % 10);
		int clap1 = 0;
		int clap2 = 0;
		int clap3 = 0;

		System.out.println(game);

		for (int i = 0; i <= game1; i++) {
			if ((i % 3 == 0) && game1 != 0) {
				clap1++;
			}
		}
		for (int j = 0; j <= game2; j++) {
			if (j % 3 == 0 && game2 != 0) {
				clap2++;
			}
		}
		for (int k = 0; k <= game3; k++) {
			if (k % 3 == 0 && game3 != 0) {
				clap3++;
			}
		}

		System.out.println((clap1 * 100) + (clap2 * 10) + clap3);


	}
}