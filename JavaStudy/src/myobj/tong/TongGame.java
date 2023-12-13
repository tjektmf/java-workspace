package myobj.tong;

import java.util.Arrays;
import java.util.Scanner;

public class TongGame {
	Scanner sc = new Scanner(System.in);

	public int[] trapSet() { // 20개중 꽝 4개를 정함 // 1~20 에서 4개

		int[] trap = new int[4];
		for (int i = 0; i < trap.length; i++) {
			trap[i] = (int) ((Math.random() * 20) + 1);
			for (int j = 0; j < i; j++) {
				if (trap[i] == trap[j]) {
					--i;
					break;
				}
			}
		}
		return trap;
	}

	public int sting(Scanner sc) {
// 찌르는 홈(숫자)
//		int shot = sting(sc);
//		if (shot > 0 && shot < 21) {
//			return shot;
//		} else {
//			return 0;
//		}
		return sc.nextInt();
	}

	public void play() {

		System.out.println("20자리중 4자리가 랜덤으로 정해짐");
		int[] rightSting = trapSet(); // 여기서 정해짐
		System.out.println(Arrays.toString(rightSting)); // 정답보여주고

		int countSting = 0;
		int hiddenSting = 0;
		int yourSting = 0;
		int[] doubleSting = new int[20];
		boolean tryCheck = true;
		String scar = "";

		while (hiddenSting != 1) {
			System.out.println("마 함찔러바라 (1~20)");

			while (tryCheck) { // 찌른데 또찔렀는지 체크
				yourSting = sting(sc); // 여기서 찌름

				for (int i = 0; i < countSting + 1; i++) {
					if (countSting != 0 && doubleSting[i] == yourSting) {
						System.out.println("찌른데 또찌르게? 다시 ㄱ");
						// System.out.println(Arrays.toString(doubleSting));
						System.out.println("니가 찌른곳 : " + scar);
						tryCheck = true;
						break;
					} else {
						tryCheck = false;
					}
				}
				doubleSting[countSting] = yourSting;
			}

			tryCheck = true;
			// System.out.println(Arrays.toString(doubleSting));

			if (yourSting > 21 || yourSting < 1) {
				System.out.println("제대로 찔러");
				// yourSting = sting(sc);
			} else {
				++countSting;
				for (int i = 0; i < 4; i++) {
					if (rightSting[i] == yourSting) {
						++hiddenSting;
						break;
					}
				}
				scar += yourSting;
				scar += " ";
				System.out.println("니가 찌른곳 : " + scar);
				if (hiddenSting == 0) {
					System.out.println("올ㅋ 다시골라봐");
				} else {
					System.out.println("끅 주금 " + countSting + "번 찌름");
				}
			}
		}
	}
}
