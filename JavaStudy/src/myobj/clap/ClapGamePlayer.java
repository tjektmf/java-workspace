package myobj.clap;

import java.util.Scanner;

public class ClapGamePlayer {

	String name;

	public ClapGamePlayer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String auto(String answerStr) { // String 이라는 클래스에 저장되어 있는 변수이므로 여기저기 사용가능
		int ran = (int) (Math.random() * 10);
		// 75퍼 정답, 25퍼 오답
		if (ran == 0) {
			return "몰루";
		} else {
			return answerStr;
		}
	}

	public String manual(Scanner sc) {
		// 직접 정답을 입력해서 리턴
		return sc.nextLine();
	}

}
