package quiz;

public class B14_zzz {
	public static void main(String[] args) {

		int[] winNums = new int[7];
		int[] winNums2 = new int[6];

		int sameCount = 0;
		int bonus = 0;
		int money = 0;

		int i = 0;
		int len = winNums.length;
		int len2 = winNums2.length;
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
				i++;
			}
		}
		for (i = 0; i < len; i++) {
			System.out.printf("winNums[%d] : %d\n", i, winNums[i]);
		} 
		// 여기까지 중복없는 7개 뽑음

		boolean check = false;
		int a = 0;

		while (a < len2) {
			winNums2[a] = (int) (Math.random() * 45 + 1);
			int b = 0;
			while (b < a) {
				if (winNums2[a] == winNums2[b]) {
					check = true;
					break;
				}
				b++;
			}
			a++;
		}
		for( int vc = 0; vc<len2 ; vc++) {
			System.out.printf("winNums2[%d] : %d\n", vc, winNums2[vc]);
		}
		// 여기까지 중복없는 6개 뽑음
		int aa = 0;
		for (int c = 0; c < len; c++) {
			for (int d = 0; d < len2; d++) {
				if (winNums[len - 1] == winNums2[d]) {
					bonus++;
				} else if (winNums[c] == winNums2[d]) {
					sameCount++;
				}
				if (sameCount == 6 && bonus == 0) {
					System.out.println("1등");
					break; // 여기까지 1등체크 아니면 다시뽑아야함
				} else {
					while (aa < len2) {
						winNums2[aa] = (int) (Math.random() * 45 + 1);
						int b = 0;
						while (b < aa) {
							if (winNums2[aa] == winNums2[b]) {
								check = true;
								break;
							}
							b++;
						}
						aa++;
					}
				}
				if (sameCount == 6 && bonus == 1) {
					System.out.println("2등");
				}
			}
		}
		System.out.println(money);
	}
} //


// 1~45사이 숫자뽑기
// 중복있는지 확인 후 중복있으면 다시뽑기
// 1등당첨까지 번호 자동생성 몇번만에 당첨됐는지 확인(중복없는 6개숫자)
//1등에 당첨되는동안 2등에 당첨된 번호 출력
