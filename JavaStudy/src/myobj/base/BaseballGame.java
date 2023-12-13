package myobj.base;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	Scanner sc = new Scanner(System.in);
	int[] answers; //
	int chance = 9;

	boolean DEBUG_MODE = true;

	public BaseballGame() {
		answers = new int[4];
		initAnswer();
	}

	public void initAnswer() {
		for (int i = 0; i < answers.length; i++) {
			answers[i] = (int) (Math.random() * 10);

			for (int j = 0; j < i; j++) {
				if (answers[j] == answers[i]) {
					--i;
				}
			}
		}
	}

	public void play() {
		while (chance > 0) {
			if (DEBUG_MODE) {
				System.out.println(Arrays.toString(answers));
			}
			System.out.println(" 남은 기회 " + chance);
			System.out.println(" >> ");
			String userGuess = sc.next();
			// 사용자가 입력한 userGuess와 정답인 answers를 비교
			PitchResult result = checkPitch(userGuess);
			System.out.printf("%s : %ds %db \n", result.getGuess(), result.getStrike(), result.getBall());

			if (result.getStrike() == 4) {
				System.out.println("승리");
				break;
			}
			--chance;
		}
	}

	// 체크결과 리턴해야 하는 값이 여러개면
	// 데이터를 클래스로 묶어 전달하는 방식 고려
	public PitchResult checkPitch(String userGuess) {

		char[] guess = userGuess.toCharArray();
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; i < guess.length; j++) {
				if (answers[i] == (guess[j] - '0')) {
					if (i == j) {
						++strike;
					} else {
						++ball;
					}
					break;
				}
			}
		}
		PitchResult result = new PitchResult(userGuess, strike, ball);
		return result;
	}
}