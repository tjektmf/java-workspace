package quiz;

import java.util.HashSet;

public class D02_CollectAllCards {

	public static void main(String[] args) {

		/*
		 * 카드를 랜덤으로 생성하여 HashSet에 모든 종류의 카드를 추가해보세요
		 * 
		 * 카드는 색상, 모양이 있음 색은 빨파초노 / 모양은 동그라이 세모 별
		 */

		Card card1 = new Card();

		card1.run();

	}

}

class Card {
	String color;
	String shape;
	int colorCount;
	int shapeCount;

	public Card() {

	}

	public String cardColor(int colorNum) {
		switch (colorNum) {
		case 0:
			return "빨강";
		case 1:
			return "파랑";
		case 2:
			return "초록";
		case 3:
			return "노랑";
		default:
			return "dd";

		}
	}

	public String cardShape(int shapeNum) {
		switch (shapeNum) {
		case 0:
			return "동그라미";
		case 1:
			return "세모";
		case 2:
			return "별";
		default:
			return "dd";
		}

	}
	
	
	public void run() {
		HashSet<String> card = new HashSet<>();

		while (card.size() < 12) {
			card.add(cardShape((int) (Math.random() * 3)) + cardColor((int) (Math.random() * 4)));
			System.out.println(card);
			colorCount++;
		}
		System.out.println("총 생성 횟수 : " + colorCount);
		System.out.println("card.size() : " + card.size());
	}
}
