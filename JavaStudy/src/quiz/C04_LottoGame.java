package quiz;

import java.util.Scanner;

public class C04_LottoGame {

	// 당첨 번호는 7개, 당첨되면 다음번호로 넘어감
	// 플레이어는 번호 6개를 입력해 숫자를 맞춰야함
	// 1등 7번째를 제외한 6개 10억
	// 2등 마지막 7번째를 포함한 6개 8천만
	// 3등 7번째를 제외한 5개 150만
	// 4등 7번째를 제외한 4개 5만
	// 5등 7번째를 제외한 3개 5천
	// 플레이어가 게[임을 종료할때까지 계속됨
	// 1 자동구매
	// 2 수동구매
	// 3 현재까지의 이력 ( 사용금액, 당첨 횟수, 손익 계산)
	// 4 게임 종료

	public static int fact() { // 자동인지 수동인지 플레이어가 선택

		Scanner sc = new Scanner(System.in);
		System.out.print("자동임? Y/N  ");
		String factos = sc.next();
		if ("Y".equals(factos) || "y".equals(factos)) {
			return 1;
		} else if ("N".equals(factos) || "n".equals(factos)) {
			return 0;
		} else {
			return 2;
		}
	}

	public static int[] pickNum() { // 수동의 경우 플레이어가 6개의 번호를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력 ");
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static int[] randomNum() { // 자동의 경우 랜덤으로 6개의 번호를 선택
		int[] ranNums = new int[6];
		int i = 0;
		int len = ranNums.length;

		while (i < len) {
			ranNums[i] = (int) (Math.random() * 45 + 1);
			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (ranNums[j] == ranNums[i]) {
					duplicate = true;
					break;
				}
				j++;
			}
			if (!duplicate) {
				++i;
			}
		}
		return ranNums;
	}

	public static int[] answerNum() { // 로또번호 7개 랜덤으로 선택

		int[] winNums = new int[7];
		int i = 0;
		int len = winNums.length;

		while (i < len) {
			winNums[i] = (int) (Math.random() * 45 + 1);
			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
				}
				j++;
			}
			if (!duplicate) {
				++i;
			}
		}
		return winNums;
	}

	public static void main(String[] args) {

		int[] winner = new int[5];
		int[] bank = new int[5];

		int buyCount = 0;
		int prize1 = 0;
		int prize2 = 0;
		int prize3 = 0;
		int prize4 = 0;
		int prize5 = 0;
		int autoCheck = 2;
		int overAll = 0;

		while (autoCheck == 2) {
			autoCheck = fact(); // 자동인지 수동인지 일단 선택
			if (autoCheck == 1) {
				System.out.println("자동 선택");
			} else if (autoCheck == 0) {
				System.out.println("수동 선택");
			} else {
				System.out.println("다시입력해");
			}
		}

		// 위에서 자동인지 수동인지 선택했으니 그걸 바탕으로 진행
		switch (autoCheck) {
		case 0:
			overAll = 0; // 수동
			break;
		case 1:
			overAll = 1; // 자동
			break;
		}

		if (overAll == 1) { // 자동이면

			int[] ans = answerNum(); // 랜덤 6개 번호
			int anslen = ans.length;

			while (prize1 == 0) {
				int[] ran = randomNum();
				int ranlen = ran.length;
				++buyCount;

				int winCount = 0;
				boolean bonus = false;

				// System.out.println(Arrays.toString(ans));
				// System.out.println(Arrays.toString(pick));
				// System.out.println(Arrays.toString(ran));

				for (int i = 0; i < ranlen; i++) {
					for (int j = 0; j < anslen; j++) {
						if (ran[i] == ans[j]) {
							++winCount;
						}
						if (ran[i] == ans[6]) {
							bonus = true;
						}

					}
				}
				if (winCount == 6 && bonus == false) {
					System.out.println("1등");
					prize1 += 1;
					break;
				} else if (winCount == 6 && bonus == true) {
					System.out.println("2등");
					prize2 += 1;
				} else if (winCount == 5 && bonus == false) {
					System.out.println("3등");
					prize3 += 1;
				} else if (winCount == 4 && bonus == false) {
					System.out.println("4등");
					prize4 += 1;
				} else if (winCount == 3 && bonus == false) {
					System.out.println("5등");
					prize5 += 1;
				}

			}
			System.out.println("구매한 횟수 : " + buyCount);
			winner[0] = prize1;
			winner[1] = prize2;
			winner[2] = prize3;
			winner[3] = prize4;
			winner[4] = prize5;
			bank[0] = winner[0] * 1000000;
			bank[1] = winner[1] * 80000;
			bank[2] = winner[2] * 1500;
			bank[3] = winner[3] * 50;
			bank[4] = winner[4] * 5;
			int prizeSum = 0;
			for (int i = 0; i < 5; i++) {
				prizeSum += bank[i];
			}
			System.out.printf("사용금액 : %d000원\n", buyCount);
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d등 횟수 : %d 회\n", i + 1, winner[i]);
			}
			System.out.println("당첨금 총액 : " + prizeSum + "000원");
			System.out.printf("이득 : %d000원\n", prizeSum - buyCount);

			// 여기까지 자동

		} else if (overAll == 0) { // 수동이면
			int[] ans = answerNum(); // 랜덤 6개 번호
			int anslen = ans.length;

			while (prize1 == 0) {
				int[] pick = pickNum(); // 6개번호 직접 선택
				int picklen = pick.length;

				++buyCount;

				int winCount = 0;
				boolean bonus = false;

				// System.out.println(Arrays.toString(ans));
				// System.out.println(Arrays.toString(pick));
				// System.out.println(Arrays.toString(ran));

				for (int i = 0; i < picklen; i++) {
					for (int j = 0; j < anslen; j++) {
						if (pick[i] == ans[j]) {
							++winCount;
						}
						if (pick[i] == ans[6]) {
							bonus = true;
						}

					}
				}
				if (winCount == 6 && bonus == false) {
					System.out.println("1등");
					prize1 += 1;
					break;
				} else if (winCount == 6 && bonus == true) {
					System.out.println("2등");
					prize2 += 1;
				} else if (winCount == 5 && bonus == false) {
					System.out.println("3등");
					prize3 += 1;
				} else if (winCount == 4 && bonus == false) {
					System.out.println("4등");
					prize4 += 1;
				} else if (winCount == 3 && bonus == false) {
					System.out.println("5등");
					prize5 += 1;
				} else {
					System.out.println("꽝");
					System.out.println(buyCount + "번 시도");
				}

			}
			System.out.println("구매한 횟수 : " + buyCount);
			winner[0] = prize1;
			winner[1] = prize2;
			winner[2] = prize3;
			winner[3] = prize4;
			winner[4] = prize5;
			bank[0] = winner[0] * 1000000;
			bank[1] = winner[1] * 80000;
			bank[2] = winner[2] * 1500;
			bank[3] = winner[3] * 50;
			bank[4] = winner[4] * 5;
			int prizeSum = 0;
			for (int i = 0; i < 5; i++) {
				prizeSum += bank[i];
			}
			System.out.printf("사용금액 : %d000원\n", buyCount);
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d등 횟수 : %d 회\n", i + 1, winner[i]);
			}
			System.out.println("당첨금 총액 : " + prizeSum + "000원");
			System.out.printf("이득 : %d000원\n", prizeSum - buyCount);
		}
	}
}