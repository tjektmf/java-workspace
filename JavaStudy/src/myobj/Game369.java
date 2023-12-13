package myobj;

import java.util.Scanner;

public class Game369 {

	Scanner sc = new Scanner(System.in);

	public int coinFlip() {
		return (int) Math.round(Math.random());
	}

	public int turn() {
		if (coinFlip() == 1) { // 0이면 너먼저 1이면 나먼저
			return 1; // 나먼저
		} else {
			return 0; // 너먼저
		}
	}

	public int comTurn() {
		int right = 0;
		right = (int) (Math.random() * 4);
		if (right == 0 || right == 1 || right == 2) {
			return 1;
		} else {
			return 0;
		}

	}

	int userAns = 0;
	String userAns2 = "";
	int gameNum = 1;

	public int myTurn(int userAns) {
		String text = "" + userAns;
		int count22 = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				++count22;
			}
		}
		if (count22 == 1) {
			return 1; // 1일때 박수
		} else {
			return 0; // 0일때 숫자
		}
	}

	public int myTurn2(String userAns) {
		String user = userAns;
		if (user == "짝") {
			return 1;
		} else {
			return 0;
		}
	}

	boolean gameSet = false;

	public void game() {
		System.out.println("동전던지기");
		coinFlip();
		System.out.println("앞면뒷면");
		turn();
		int showTime = turn();
		while (!gameSet) {
			if (showTime == 1) { // 1이면 나먼저
				System.out.println("니차례  / " + gameNum);
				String user2 = sc.next();
				if (myTurn(gameNum) == 1 && "짝".equals(user2)) { // 마이턴1이면 박수
					++gameNum;
					--showTime;
					System.out.println("박수");
				} else if (myTurn(gameNum) == 0) { // 마이턴 0이면 숫자
					++gameNum;
					--showTime;
					System.out.println("숫자");
				} else {
					System.out.println("니가짐ㅅㄱ");
					gameSet = true;
					break;
				}

			} else {// turn() == 0 컴터먼저

				if (comTurn() == 0) {
					System.out.println("컴터 실수로 니가이김 / " + gameNum);
					gameSet = true;
					break;
				} else {
					int clap22 = 0;
					String text = "" + gameNum;
					for (int i = 0; i < text.length(); i++) {
						char ch = text.charAt(i);
						if (ch == '3' || ch == '6' || ch == '9') {

							++clap22;
						}
					}
					if (clap22 != 0) {
						System.out.println("컴터 : 짝 / " + gameNum);
						++gameNum;
						++showTime;

					} else {
						System.out.println("컴터 : " + gameNum);
						++gameNum;
						++showTime;
					}
				}
			}
		}
	}
}
