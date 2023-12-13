package myobj.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {

	Scanner sc = new Scanner(System.in);
	LottoNumber winNum = new LottoNumber(true);

	// 사용금액, 당첨횟수, 손익

	int[] prizeCount = new int[6];
	long[] prizeAmount = { 0, 100000000, 80000000, 1500000, 50000, 5000 };


	

	public LottoNumber getLottoNumberManual() {
		int count = 0;
		int[] nums = new int[6];

		while (count < 6) { // 1부터 나오게 설정함, 사용자 입장에서 편함
			System.out.printf("%d번째 숫자를 입력해주세요 : ", count + 1);
			int num = sc.nextInt();

			if (num < 1 || num > 45) {
				System.out.println("1~45 사이를 골라");
				continue;
			}
			boolean duplicate = false;
			for (int i = 0; i < count; i++) {
				if (nums[i] == num) {
					System.out.println("중복값있음 다시 ㄱㄱ");
					duplicate = true;
					break;
				}
			}
			if (duplicate) { // 위에 duplicate=true 에서 continue를 해버리면 for문이 재껴짐 for문 나와서 해야함
				continue;
			} // 검사를 통과한 숫자를 nums 배열에 넣음
			nums[count++] = num;
		}
		// 중복없는 1~45사이의 int[] 를 전달해 인스턴스를 생성 후 리턴
		return new LottoNumber(nums); //
	}

	public void printGameInfo() {
		int spent = 0;
		long prize = 0;
//		prize += prizeCount[1] * 100000000L;
//		prize += prizeCount[2] * 8000000L;
//		prize += prizeCount[3] * 150000L;
//		prize += prizeCount[4] * 50000L;
//		prize += prizeCount[5] * 5000L;

		for (int i = 0; i < prizeCount.length; i++) {
			spent += prizeCount[i] * 1000;
			prize += prizeCount[i] * prizeAmount[i];
		}
		System.out.printf("총 사용 금액 : %d\n", spent);
		System.out.printf("손익 : %d 원\n", prize - spent);
		System.out.println("당첨 이력");
		for (int i = 1; i < prizeCount.length; i++) {
			System.out.printf("%d동 : %d회\n", i, prizeCount[i]);
		}
		System.out.println("###################");
		
	}

	public void play() {
		while (true) {
			System.out.println("1. 자동 구매");
			System.out.println("2. 수동 구매");
			System.out.println("3. 현재까지의 이력");
			System.out.println("4. 게임 종료");
			System.out.println(">> ");
			int userSelect = sc.nextInt(); // 1234로 고르니 int 쓴듯

			int result = -1;
			switch (userSelect) {
			case 1:
				result = new LottoNumber(false).check(winNum);
				break;
			case 2:
				result = getLottoNumberManual().check(winNum);
				break;
			case 3:
				printGameInfo();
				break;
			case 4:
				System.out.println("ㅅㄱ링");
				return;
			default:
				// case default가 아니라 그냥 default 임
				break;
			}
			if (result != -1) {

				++prizeCount[result];
				System.out.println("당첨번호" + Arrays.toString(winNum.numbers));
				
				if(result ==0) {
					System.out.println("당첨안댐");
				}else {
					System.out.printf("%d등 당첨\n", result);
					
				}
			}
		}

	}

}
