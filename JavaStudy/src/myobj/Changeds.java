package myobj;

import java.util.Arrays;

public class Changeds {

	int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

	public void print() {
		System.out.println("  1 2 3 4");
		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < 4; j++) {
				switch (board[i][j]) {
				case 0:
					System.out.print("□");
					break;
				case 1:
					System.out.print("■");
					break;
				}
				System.out.print(' ');
			}
			System.out.println();
		}

	}

	public void color(String numnum) {
		int[] num = colorArr(numnum);
		int num1 = num[0];
		int num2 = num[1];
		System.out.println(Arrays.toString(num));
		if (numnum.length() > 3 || numnum.length() < 0) {
			System.out.println("범위 초과");
			return;
		} else {
			board[num1][num2] = 1;
		}

	}

	public int[] colorArr(String numnum) {

		return new int[] { numnum.charAt(0) - '1', numnum.charAt(1) - '1' };
	}

}
