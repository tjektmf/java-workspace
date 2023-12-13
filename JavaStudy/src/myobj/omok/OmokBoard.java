package myobj.omok;

import java.util.Arrays;

public class OmokBoard {

	final static int MAX_WIDTH = 15;
	final static int MAX_HEIGHT = 15;

	int[][] board = { { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 }, { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
			{ 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8 } };

	// 돌을 제대로 놨는지 성공여부 반환해야하므로 boolean타입을 이용
	public boolean put(String coordStr, boolean isBlack) {

		int[] coords = getCoordArray(coordStr);

		int col = coords[0]; // b5를 입력받으면 b-a 해서 1나옴 마찬가지로 a-a는 0으로 처음자리 차지함
		int row = coords[1];

		if (coordStr.length() == 2) {
			row = coordStr.charAt(1) - '0' - 1; // 문자열로 받았으므로 그 문자열에서 숫자만큼 차이나는 문자열을 빼줘야 정수값을 얻음
		} else if (coordStr.length() == 3) {
			row = 10 + (coordStr.charAt(2) - '0') - 1;
		} else {
			System.out.println("에러 길이가 이상함");
			return false; // 메서드를 여기서 종료
		}

		if (row >= MAX_HEIGHT || col >= MAX_WIDTH) {
			System.out.println("에러 범위 너무큼");
			return false;
		} else if (board[row][col] == 9 || board[row][col] == 10) {
			System.out.println("에러 이미 돌있음");
			return false;
		}

		if (isBlack) {
			board[row][col] = 9;
		} else {
			board[row][col] = 10;
		}
		return true;

	}

	private int[] getCoordArray(String coordStr) {
		return new int[] { coordStr.charAt(0) - 'a',
				coordStr.length() == 2 ? coordStr.charAt(1) - '0' - 1 : 10 + (coordStr.charAt(2) - '0') - 1
				// coordStr.charAt(0) - 'a'

		};
	}

	public boolean winCheck(String coordStr, boolean isBlack) {

		int[] coords = getCoordArray(coordStr);
		System.out.println(Arrays.toString(coords));
		System.out.println("체크드가자");
		int row = coords[0];
		int col = coords[1];
		int color = isBlack ? 9 : 10;
		System.out.println("색깔 " + color);

		// 연속된 같은색의 돌의 개수를 센다

		// 1. 가로

		// 1-1 현재위치에서 왼쪽으로 가면서 셈
		int horizonCount = 0;

		for (int i = col - 1; i >= 0; i--) {
			if (board[row][i] == color) { //
				horizonCount++;
			} else {
				break;
			}
		}

		// 1-2 오른쪽으로
		for (int i = col; i < MAX_WIDTH; i++) {
			if (board[row][i] == color) { //
				horizonCount++;
			} else {
				break;
			}
		}

		// 2. 세로
		int verticalCount = 0;

		// 2-1 현재위치에서 아래쪽으로 가면서 셈
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == color) { //
				verticalCount++;

			} else {
				break;
			}
		}

		// 2-2 위쪽으로
		for (int i = row; i < MAX_HEIGHT; i++) {
			if (board[i][col] == color) { //
				verticalCount++;
			} else {
				break;
			}
		}

		// 3. 왼위에서 오아가는 대각선

		// 3-1 현위치에서 왼쪽위
		int count3 = 0;
		for (int c = col - 1, r = row - 1; c >= 0 && r >= 0; c--, r--) {
			if (board[r][c] == color) {
				count3++;
			} else {
				break;
			}

		}
		// 3-2 현위치에서 오른쪽아래
		for (int c = col, r = row; c < MAX_WIDTH && r < MAX_HEIGHT; c++, r++) {
			if (board[r][c] == color) {
				count3++;
			} else {
				break;
			}

		}

		// 4. 왼아에서 오위가는 대각선

		// 4-1 현위치에서 왼쪽아래

		int count4 = 0;
		for (int c = col - 1, r = row + 1; c >= 0 && r < MAX_HEIGHT; c--, r++) {
			if (board[r][c] == color) {
				count4++;
			} else {
				break;
			}

		}

		// 4-2 현위치에서 오른쪽 위

		for (int c = col, r = row; c < MAX_WIDTH && r >= 0; c++, r--) {
			if (board[r][c] == color) {
				count4++;
			} else {
				break;
			}

		}

		//

		System.out.println(horizonCount + " / " + verticalCount + " / " + count3 + " / " + count4 );
		return (horizonCount == 5 || verticalCount == 5 || count3 == 5 || count4 == 5); // 오목이면 true 오목이 아니면 false 가 나옴
	}

	public void print() {
		System.out.println("   a  b  c  d  e  f  g  h  i  j  k  l  m  n  o");
		for (int i = 0; i < MAX_HEIGHT; i++) {

			System.out.printf("%-2d ", (i + 1)); // 편의성 패치
			for (int j = 0; j < MAX_WIDTH; j++) {
				switch (board[i][j]) {
				case 0:
					System.out.print('┌');
					break;
				case 1:
					System.out.print('┬');
					break;
				case 2:
					System.out.print('┐');
					break;
				case 3:
					System.out.print('├');
					break;
				case 4:
					System.out.print('┼');
					break;
				case 5:
					System.out.print('┤');
					break;
				case 6:
					System.out.print('└');
					break;
				case 7:
					System.out.print('┴');
					break;
				case 8:
					System.out.print('┘');
					break;
				case 9:
					System.out.print('○');
					break;
				case 10:
					System.out.print('●');
					break;
				}
				System.out.print(' ');
				System.out.print(' ');

			}
			System.out.print('\n');
		}
	}

}
