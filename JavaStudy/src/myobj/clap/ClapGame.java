package myobj.clap;

import java.util.Arrays;
import java.util.Scanner;

public class ClapGame {

	final int[] CLAP_NUMBERS;

	// String[] players = {"플레이어", "컴퓨터"};
	ClapGamePlayer[] players = { new ClapGamePlayer("플레이어"), new ClapGamePlayer("컴퓨터") };
	// ClapGamePlayer 타입이고 String 타입도 클래스임 색깔이 파란색임 int는 갈색
	// String도 new를 쓰는게 맞지만 하도 자주쓰니 그냥 안써도 된다고 특혜를 줌

	public ClapGame() { // 게임 기본규칙
		CLAP_NUMBERS = new int[] { 3, 6, 9 };
	}

	// ... 매개변수는 생성자에는 사용할 수 없음
	public ClapGame(int[] clapNums) { // 게임 규칙 수정기능 예를 들면 369말고 247에서 박수
		CLAP_NUMBERS = clapNums;

	}

	// 숫자 정답을 받으면 문자열 369 정답을 리턴하느 메서드
	public String getAnswerString(int answer) {

		String answerStr = "";
		int original = answer;
		while (answer > 0) {

			int digit = answer % 10;
			for (int i = 0; i < CLAP_NUMBERS.length; i++) {// 걍 문자열 비교해서 같으면 문자열에 이어붙이는거임
				if (digit == CLAP_NUMBERS[i]) { // 
					answerStr += "ㅉ";
					break;// 이 경우 문자열에 ㅉ
				}
			}
			answer /= 10; // 10으로 나눈다음 위로 올라가서 10으로 나눈 나머지를 구하면 그땐 십의 자리 숫자를 얻을 수 있음
			// 그러다 다 나눠지고 일의자리 숫자만 남으면 1/10 = 0임, 0되면 while문 밖으로 나감

		} // 문자열에 ㅉ이 하나도 추가안되면 그자리에 그냥 answer를 넣음
		if (answerStr.length() == 0) {
			answerStr += original;
		}

		return answerStr;
	}

	// 정답 문자열과 사용자가 입력한 문자열을 비교하여 정답인지 알려주는 메소드
	public boolean checkAnswer(String answerStr, String userAnswer) {

		boolean isClapAnswer = answerStr.charAt(0) > '9'; // 9보다만 크면 ㅉ 짝 둘다 포함되고 숫자는 포함안됨

		if (isClapAnswer) {
			if(userAnswer.length() != answerStr.length()) { // ㅉ이 정답일때 ㅉㅉ도 정답처리되는 경우에 추가한 코드
				return false;
			}
			for (int i = 0; i < answerStr.length(); i++) {

				char ch = userAnswer.charAt(i);
				if (ch != '짝' && ch != 'ㅉ') {
					return false;
				}
			}
			return true; // 걍 먼저 써서 빨간줄 지움
		} else {
			return userAnswer.equals(answerStr);
		}

	}

	public void play() {
		System.out.printf("%s에 박수쳐 \n", Arrays.toString(CLAP_NUMBERS));

		int turn = (int) (Math.random() * 2); // 0 또는 1
		System.out.printf("%s 먼저 시작\n", players[turn].getName());
		// players는 배열임 플레이어와 컴퓨터 두개의 배열이라 [start]를 씀
		// getName을 사용하는 이유는 이용자의 임의수정을 방지하기 위함, 그냥 name써도 결과같음, 읽기전용 느낌
		Scanner sc = new Scanner(System.in);

		int answer = 1;

		while (true) {
			ClapGamePlayer player = players[turn];

			String answerStr = getAnswerString(answer++);
			System.out.println("이번 정답 " + answerStr);
			String name = player.getName();
			String userAnswer;

			System.out.printf("%s -> ", name);
			if (name.equals("플레이어")) {
				userAnswer = player.manual(sc);
			} else {
				userAnswer = player.auto(answerStr);
				System.out.println(userAnswer);
			}
			// answerStr == userAnswer 비교, ㅉ 짝 둘다 정답으로 인정
			boolean correct = checkAnswer(answerStr, userAnswer);

			if (!correct) {
				System.out.printf("%s의 패배\n", player.getName());
				break;
			}

			turn = (turn + 1) % players.length; // 1%2 == 1, 2%2 == 0 으로 turn에 0 1 두 값이 돌아가면ㅅ ㅓ나옴
			// 만약 세명이었으면 1%3, 2%3, 3%3 해서 123 순서로 할수있는듯
			// players.length가 플레이어 수임

		}
	}
}
