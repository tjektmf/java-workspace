package myobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jackjack {

	Scanner sc = new Scanner(System.in);

	List<String> shapeList = new ArrayList<>();
	List<String> numberList = new ArrayList<>();
	List<String> setList = new ArrayList<>();
	List<String> myList = new ArrayList<>();
	List<String> dealerList = new ArrayList<>();

	public List<String> cardShape() {
		Collections.addAll(shapeList, "스페이드", "하트", "클로버", "다이아");
		return shapeList;
	}

	public List<String> cardNumber() {
		Collections.addAll(numberList, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
		return numberList;
	}

	public List<String> cardSet() {

		for (int i = 0; i < shapeList.size(); i++) {
			for (int j = 0; j < numberList.size(); j++) {
				setList.add(numberList.get(j) + shapeList.get(i));
			}
		}
		Collections.shuffle(setList);
		return setList;
	}

	public int myTurn() {

		hint();
		System.out.print("오레노턴 HIT OR STAND (1 or 2)  :  ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("내 선택은 HIT 현재 카드의 합 : " + point(myList));
			return 1;
		case 2:
			System.out.println("내 선택은 STAND 현재 카드의 합 : " + point(myList));
			return 2;
		}
		return 0;
	}

	public void openningCard() {
		System.out.println("나한장 딜러한장 나한장 딜러한장 두장씩 뽑음");
		myList.add(setList.get(0));
		setList.remove(0);
		dealerList.add(setList.get(0));
		setList.remove(0);
		myList.add(setList.get(0));
		setList.remove(0);
		dealerList.add(setList.get(0));
		setList.remove(0);

		System.out.println("내가 받은 카드 두장 : " + myList.get(0) + " " + myList.get(1));
		System.out.println("딜러가 받은 카드 두장 : " + dealerList.get(0) + " XXX");
		System.out.println("내 카드의 합 : " + point(myList));
		System.out.println("딜러 카드의 합 : " + point(dealerList));
	}

	public int point(List<String> list) {
		int sumPoint = 0;
		boolean aceCard = false;
		int aceStack = 0;

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i).charAt(0)) {
			case '1':
				sumPoint += 10;
				break;
			case '2':
				sumPoint += 2;
				break;
			case '3':
				sumPoint += 3;
				break;
			case '4':
				sumPoint += 4;
				break;
			case '5':
				sumPoint += 5;
				break;
			case '6':
				sumPoint += 6;
				break;
			case '7':
				sumPoint += 7;
				break;
			case '8':
				sumPoint += 8;
				break;
			case '9':
				sumPoint += 9;
				break;
			case 'A':
				sumPoint += 11;
				aceCard = true;
				aceStack++;
				break;
			default:
				sumPoint += 10;
				break;
			}
		}
		if (sumPoint > 21 && aceCard) {
			sumPoint -= aceStack * 10;
		}
		return sumPoint;
	}

	public int dealerScore() {

		int draw = 1;
		while (point(dealerList) <= 16) {
			dealerList.add(setList.get(0));
			setList.remove(0);
			System.out.println("딜러의 카드합이 16보다 작아서 " + draw++ + " 번 더 뽑았고 그 합은 " + point(dealerList));
		}
		return point(dealerList);
	}

	public void gameSet() {
		if (point(myList) > 21) {
			System.out.println("ㅠㅠ 나 21초과 졌따");
			System.out.printf("나 : %d / 딜러 : %d \n", point(myList), point(dealerList));
			return;
		} else if (point(dealerList) > 21) {
			System.out.println("ㅋㅋ 딜러 21초과 내가이김");
			System.out.printf("나 : %d / 딜러 : %d \n", point(myList), point(dealerList));
			return;
		}
		if (point(myList) == 21) {
			System.out.println("블랙잭, 내가이김 ㅅㄱ링");
		} else if (point(myList) > point(dealerList)) {
			System.out.println("점수차이로 이김");
		} else if (point(myList) == point(dealerList)) {
			System.out.println("비김 묻고 따블로 ㄱㄱㄱ");
		} else if (point(dealerList) == 21) {
			System.out.println("ㄷㄷ 딜러가 블랙잭");
		} else {
			System.out.println("졌땅");
		}

		System.out.printf("나 : %d / 딜러 : %d \n", point(myList), point(dealerList));
	}

	public int myScore() {
		myList.add(setList.get(0));
		setList.remove(0);
		return point(myList);
	}

	public void hint() {
		System.out.println("특별히 다음카드 보여줌ㅋㅋ");
		System.out.println(setList.get(0));
	}

	public void realGame() {
		while (point(myList) < 21) {
			int yourPick = myTurn();
			if (yourPick == 1) {
				myScore();
				System.out.println("HIT 후 카드의 합 : " + point(myList));
			} else {
				break;
			}
		}
		if (point(myList) > 21) {
			System.out.println("==================");
			gameSet();
			return;
		}
		dealerScore();
		System.out.println("==================");
		gameSet();
	}
}
