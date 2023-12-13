package ans;

import java.util.HashSet;

public class D02_CollectAllCards {

	static class Card {

		static String[] colors = { "red", "blue", "green", "yellow" };
		static String[] shapes = { "ㅇ", "ㄴ", "ㅁ" };

		String color;
		String shape;

		public Card() {
			color = colors[(int) (Math.random() * colors.length)];
			shape = shapes[(int) (Math.random() * shapes.length)];
		}

		public String toString() {
			return color + " " + shape + "\n"; // toString 활용
		}

		public boolean equals(Object obj) {
			return this.hashCode() == obj.hashCode();
		}

		public int hashCode() {
			return (color + shape).hashCode();
		}
	}

	public static void main(String[] args) {
		HashSet<Card> cards = new HashSet<>(); // Card 타입을 사용가능함
		// 해당 클래스의 equals 메서드 결과가 일치하면 중복값으로 판단해 set에 추가하지않음
		int count = 0;
		while (cards.size() < 12) {
			cards.add(new Card());
			System.out.println(++count + "번째 카드를 추가함");
		}
		System.out.println(cards);
		System.out.println(count);

	}
}
