package quiz;

import java.util.Arrays;

public class B14_Lotto {

	public static void main(String[] args) {

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
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums[%d] : %d\n", i, winNums[i]);
		}

		int[] userNums = new int[6];
		int buyCount = 0;

		while (true) {
			i = 0;
			len = userNums.length;
			while (i < len) {
				userNums[i] = (int) (Math.random() * 45 + 1);
				int j = 0;
				boolean duplicate = false;
				while (j < i) {
					if (userNums[j] == userNums[i]) {
						duplicate = true;
						break;
					}
					++j;
				}
				if (!duplicate) {
					++i;
				}
			}
			// System.out.println("새번호 생성");
			++buyCount;
			// 자동번호 하나마다 모든당첨번호를 모두 검사함
			boolean hasBonusNum = false;
			int winCount = 0;
			for (int userIndex = 0; userIndex < userNums.length; userIndex++) {

				for (int winIndex = 0; winIndex < winNums.length; winIndex++) {
					if (userNums[userIndex] == winNums[winIndex]) {
						if (winIndex == 6) {
							hasBonusNum = true;
						}
						++winCount;
					}

				}

			} // 위의 코드까지는 뽑은번호와 당첨번호를 비교함
				// 아래코드는 그 비교한걸 바탕으로 1등인지 2등인지 처음부터 다시할지를 결정함
			if (winCount == 6) {
				// 쉽게 배열출력
				System.out.printf("%s vs %s\n", Arrays.toString(winNums), Arrays.toString(userNums));
				if (hasBonusNum) {
					System.out.println("2등" + buyCount);
				} else {
					System.out.println("1등 " + buyCount);
					break;
				}
			}
		}
		System.out.println("종료함");
	}
}
