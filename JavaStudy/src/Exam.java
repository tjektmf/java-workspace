import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Exam {
	static ArrayList<Integer> plzMoney = new ArrayList<Integer>();

	public static List go() {
		HashSet<Integer> lottoNum = new HashSet<Integer>();
		for (int i = 0; i < 100; i++) {
			if (lottoNum.size() < 6) {
				lottoNum.add((int) (Math.random() * 45) + 1);
			}

		}
		ArrayList<Integer> myNum = new ArrayList<Integer>(lottoNum);
		// System.out.println("리스트 생성 : " + myNum);
		plzMoney.addAll(myNum);
		return plzMoney;
	}

	public static void main(String[] args) {

		HashSet<Integer> answerNum = new HashSet<Integer>();
		for (int i = 0; i < 1000; i++) {
			if (answerNum.size() < 7) {
				answerNum.add((int) (Math.random() * 45) + 1);
			}

		}
		ArrayList<Integer> answerNum2 = new ArrayList<Integer>(answerNum);
		System.out.println(answerNum2);

		Scanner sc = new Scanner(System.in);
		System.out.println("몇번돌릴지 입력");
		int shot;
		shot = sc.nextInt();
		int gameCount = 0;
		int hitCount = 0;
		int firstPrize = 0;
		int secondPrize = 0;
		int thirdPrize = 0;
		int fourthPrize = 0;
		int fifthPrize = 0;
		boolean second = false;
		for (int i = 0; i < shot; i++) {
			gameCount++;
			plzMoney.removeAll(plzMoney);
			go();
			System.out.println(plzMoney);
			for (int k = 0; k < 7; k++) {
				for (int j = 0; j < 6; j++) {
					if (plzMoney.get(j) == answerNum2.get(k)) {
						hitCount++;
					}
					if (plzMoney.get(j) == answerNum2.get(6)) {
						second = true;
					}
				}
			}
			System.out.println(hitCount);
			if (hitCount == 6 && !second) {
				System.out.println("1등");
				firstPrize++;
			} else if (hitCount == 6 && second) {
				System.out.println("2등");
				secondPrize++;
			} else if (hitCount == 5) {
				System.out.println("3등");
				thirdPrize++;
			} else if (hitCount == 4) {
				System.out.println("4등");
				fourthPrize++;
			} else if (hitCount == 3) {
				System.out.println("5등");
				fifthPrize++;
			} else {
				// System.out.println("돈날림");
			}
			second = false;
			hitCount = 0;

		}

		System.out.printf("1등 : %d\t2등 : %d\t3등 : %d\t4등 : %d\t5등 : %d\t\n", firstPrize, secondPrize, thirdPrize,
				fourthPrize, fifthPrize);
		System.out.println("총 게임 횟수 : " + gameCount);
	}
}
