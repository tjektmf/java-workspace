package quiz;

import java.util.Scanner;

public class C17_5mok {

	// 오목

	public static void main(String[] args) {

		// 1. 판그리기 ㅂ 한자 활용

		// 2. 돌놓기
		char[][] omok = { { '┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤' },
				{ '└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘' } };

		Scanner sc = new Scanner(System.in);

		boolean gameSet = false;

		System.out.print("오목할래? Y/N ");

		String gameStart = "";
		int axisX = 0;
		int axisY = 0;
		int player = 1;
		boolean rulebreak = true;
		boolean winCheck = true;
		boolean winCheck2 = true;
		boolean winCheck3 = true;
		boolean winCheck4 = true;
		boolean omokCheck = false;
		boolean range = true;
		boolean fullCheck = true;
		boolean resetChance = true;
		String reset = "";

		gameStart = sc.next();

		int resetStack = 1;

		if (gameStart.equals("Y") || (gameStart.equals("y"))) {
			gameSet = true;
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					System.out.printf("%c ", omok[i][j]);
				}
				System.out.println();
			}
		}

		while (gameSet) {
			while (range) {
				System.out.println("어디 할래? " + player + "p차례");
				System.out.println("\t( -y , -x )\t");
				System.out.println("1p는 흑, 2p는 백");
				axisX = sc.nextInt();
				axisY = sc.nextInt();
				if (axisX >= 0 && axisX <= 10) {
					if (axisY >= 0 && axisY <= 10) {
						range = false;
					}
				} else {
					System.out.println("제발 범위좀");
				}
			}
			range = true;

			while (rulebreak) {
				if (player == 1) {
					if (omok[axisX][axisY] != '●' && omok[axisX][axisY] != '○') {
						omok[axisX][axisY] = '●'; // 1p가 흑, 선공
						player++;
						rulebreak = false;
					} else {
						System.out.println("거긴 안대 다른곳ㄱㄱ");
						System.out.println("\t( -y , -x )\t");
						axisX = sc.nextInt();
						axisY = sc.nextInt();
						rulebreak = true;
					}
				} else if (player == 2) {
					if (omok[axisX][axisY] != '●' && omok[axisX][axisY] != '○') {
						omok[axisX][axisY] = '○'; // 2p가 백, 후공
						player--;
						rulebreak = false;
					} else {
						System.out.println("거긴 안대 다른곳ㄱㄱ");
						System.out.println("\t( -y , -x )\t");
						axisX = sc.nextInt();
						axisY = sc.nextInt();
						rulebreak = true;
					}
				}

				if (true) {

				}
			}
			rulebreak = true;

			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					System.out.printf("%c ", omok[i][j]);
				}
				System.out.println();
			}

			winCheck = true;
			winCheck2 = true;
			winCheck3 = true;
			winCheck4 = true;
			fullCheck = true;
			while (fullCheck) {
				while (winCheck) { // 가로 직선체크

					if ((axisY >= 2 && axisY <= 5) && (omok[axisX][axisY] == omok[axisX][axisY + 1]
							&& omok[axisX][axisY] == omok[axisX][axisY + 2])) {

						if (omok[axisX][axisY] == omok[axisX][axisY + 3]
								&& omok[axisX][axisY] == omok[axisX][axisY + 4]) {

							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY + 3]
								&& omok[axisX][axisY] == omok[axisX][axisY - 1]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX][axisY - 1]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck = false; // 승리여부 체크끝났으니 밖으로
						}
					} else if ((axisY >= 3 && axisY <= 6) && (omok[axisX][axisY] == omok[axisX][axisY + 1]
							&& omok[axisX][axisY] == omok[axisX][axisY - 1])) { // -1 0 1 같음
						if (omok[axisX][axisY] == omok[axisX][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX][axisY + 3]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX][axisY - 2]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX][axisY - 3]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck = false; // 승리여부 체크끝났으니 밖으로
						}

					} else if ((axisY >= 4 && axisY <= 7) && (omok[axisX][axisY] == omok[axisX][axisY - 2]
							&& omok[axisX][axisY] == omok[axisX][axisY - 1])) { // -2 -1 0 같음
						if (omok[axisX][axisY] == omok[axisX][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX][axisY + 1]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY + 1]
								&& omok[axisX][axisY] == omok[axisX][axisY - 3]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX][axisY - 4]
								&& omok[axisX][axisY] == omok[axisX][axisY - 3]) {
							System.out.println("5줄");
							winCheck = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck = false; // 승리여부 체크끝났으니 밖으로
						}
					} else {
						winCheck = false; // 승리여부 체크끝났으니 밖으로
					}
				}

				// ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
				while (winCheck2) { // 세로 직선체크

					if ((axisX >= 2 && axisX <= 5) && (omok[axisX][axisY] == omok[axisX + 1][axisY]
							&& omok[axisX][axisY] == omok[axisX + 2][axisY])) {

						if (omok[axisX][axisY] == omok[axisX + 3][axisY]
								&& omok[axisX][axisY] == omok[axisX + 4][axisY]) {

							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 3][axisY]
								&& omok[axisX][axisY] == omok[axisX - 1][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 2][axisY]
								&& omok[axisX][axisY] == omok[axisX - 1][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck2 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else if ((axisX >= 3 && axisX <= 6) && (omok[axisX][axisY] == omok[axisX + 1][axisY]
							&& omok[axisX][axisY] == omok[axisX - 1][axisY])) { // -1 0 1 같음
						if (omok[axisX][axisY] == omok[axisX + 2][axisY]
								&& omok[axisX][axisY] == omok[axisX + 3][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY]
								&& omok[axisX][axisY] == omok[axisX - 2][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 2][axisY]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck2 = false; // 승리여부 체크끝났으니 밖으로
						}

					} else if ((axisX >= 4 && axisX <= 7) && (omok[axisX][axisY] == omok[axisX - 2][axisY]
							&& omok[axisX][axisY] == omok[axisX - 1][axisY])) { // -2 -1 0 같음
						if (omok[axisX][axisY] == omok[axisX + 2][axisY]
								&& omok[axisX][axisY] == omok[axisX + 1][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 1][axisY]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 4][axisY]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY]) {
							System.out.println("5줄");
							winCheck2 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck2 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else {
						winCheck2 = false; // 승리여부 체크끝났으니 밖으로
					}
				}

				// 세로 직선 끝 ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
				// 세로 직선 끝 ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
				// 세로 직선 끝 ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ

				while (winCheck3) { // 대각선 1

					if ((axisX >= 2 && axisX <= 5) && (axisY >= 4 && axisY <= 7)
							&& (omok[axisX][axisY] == omok[axisX + 1][axisY - 1]
									&& omok[axisX][axisY] == omok[axisX + 2][axisY - 2])) {

						if (omok[axisX][axisY] == omok[axisX + 3][axisY - 3]
								&& omok[axisX][axisY] == omok[axisX + 4][axisY - 4]) {

							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 3][axisY - 3]
								&& omok[axisX][axisY] == omok[axisX - 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX - 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck3 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else if ((axisX >= 3 && axisX <= 6) && (axisY >= 3 && axisY <= 6)
							&& (omok[axisX][axisY] == omok[axisX + 1][axisY - 1]
									&& omok[axisX][axisY] == omok[axisX - 1][axisY + 1])) { // -1 0 1 같음
						if (omok[axisX][axisY] == omok[axisX + 2][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX + 3][axisY - 3]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX - 2][axisY + 2]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY + 3]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck3 = false; // 승리여부 체크끝났으니 밖으로
						}

					} else if ((axisX >= 4 && axisX <= 7) && (axisY >= 2 && axisY <= 5)
							&& (omok[axisX][axisY] == omok[axisX - 2][axisY + 2]
									&& omok[axisX][axisY] == omok[axisX + 1][axisY - 1])) { // -2 -1 0 같음
						if (omok[axisX][axisY] == omok[axisX - 3][axisY + 3]
								&& omok[axisX][axisY] == omok[axisX - 4][axisY + 4]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY + 3]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX + 3][axisY - 3]) {
							System.out.println("5줄");
							winCheck3 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck3 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else {
						winCheck3 = false; // 승리여부 체크끝났으니 밖으로
					}

				}

				// 대각선 1 끝 ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ

				while (winCheck4) { // 대각선 2

					if ((axisX >= 2 && axisX <= 5) && (axisY >= 0 && axisY <= 5)
							&& (omok[axisX][axisY] == omok[axisX + 1][axisY + 1]
									&& omok[axisX][axisY] == omok[axisX + 2][axisY + 2])) {

						if (omok[axisX][axisY] == omok[axisX + 3][axisY + 3]
								&& omok[axisX][axisY] == omok[axisX + 4][axisY + 4]) {

							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 3][axisY + 3]
								&& omok[axisX][axisY] == omok[axisX + 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX + 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck4 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else if ((axisX >= 3 && axisX <= 6) && (axisY >= 3 && axisY <= 6)
							&& (omok[axisX][axisY] == omok[axisX + 1][axisY + 1]
									&& omok[axisX][axisY] == omok[axisX - 1][axisY - 1])) { // -1 0 1 같음
						if (omok[axisX][axisY] == omok[axisX + 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX + 3][axisY + 3]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX - 2][axisY - 2]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 2][axisY - 2]
								&& omok[axisX][axisY] == omok[axisX - 3][axisY - 3]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck4 = false; // 승리여부 체크끝났으니 밖으로
						}

					} else if ((axisX >= 4 && axisX <= 7) && (axisY >= 4 && axisY <= 7)
							&& (omok[axisX][axisY] == omok[axisX - 2][axisY - 2]
									&& omok[axisX][axisY] == omok[axisX - 1][axisY - 1])) { // -2 -1 0 같음
						if (omok[axisX][axisY] == omok[axisX - 3][axisY - 3]
								&& omok[axisX][axisY] == omok[axisX - 4][axisY - 4]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX - 3][axisY - 3] // ㅇㅇㅇㅇㅇㅇ
								&& omok[axisX][axisY] == omok[axisX + 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else if (omok[axisX][axisY] == omok[axisX + 2][axisY + 2]
								&& omok[axisX][axisY] == omok[axisX + 1][axisY + 1]) {
							System.out.println("5줄");
							winCheck4 = false;
							gameSet = false; // 오목됨
							omokCheck = true;
						} else {
							winCheck4 = false; // 승리여부 체크끝났으니 밖으로
						}
					} else {
						winCheck4 = false; // 승리여부 체크끝났으니 밖으로
					}

				}

				while (resetChance) {
					System.out.println("무르기 가능 횟수 " + resetStack + "회 (\"ff\"를 입력)");
					System.out.println("안할거면 press any key");
					reset = sc.next();
					if (reset.equals("ff") && resetStack != 0) {

						rulebreak = false;
						omok[axisX][axisY] = '╋'; // 테두리 일일이 바꾸는거 넘귀찬

						if (player == 1) {
							player++;
						} else {
							player--;
						}
						resetStack--;
						resetChance = false;

					} else {
						resetChance = false;
					}
				}
				resetChance = true;

				if (omokCheck) {
					System.out.println("게임끝ㅊㅋㅊㅋ");
					// while문 끝남
					gameSet = false;

				} // fullCheck 끝남
				fullCheck = false;
			}
		}
	}
}
