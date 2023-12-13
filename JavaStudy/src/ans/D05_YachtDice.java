package ans;

import java.util.Arrays;

import myobj.yacht.YachtDice;

public class D05_YachtDice {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			YachtDice dice1 = new YachtDice();

			System.out.println(dice1);
			dice1.showAvailableRanks();
			System.out.println();
		}
	}

}
