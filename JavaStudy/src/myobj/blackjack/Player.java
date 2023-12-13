package myobj.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {

	List<Card> hands = new ArrayList<>();
	private String name;
	private int money;

	public Player(String name) {
		this(name, 2500);
	}

	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void hide(int index) {
		hands.get(index).toBackSide();
	}

	public void open(int index) {
		hands.get(index).toFrontSide();
	}

	@Override
	public String toString() {
		return String.format("%s [보유금액 : %d억]", name, money);
	}

	public void addCard(Card card) {
		hands.add(card);
	}

	public int getHandValue() {
		int value = 0;
		for (int i = 0; i < hands.size(); i++) {
			Card c = hands.get(i);
			value += c.getRankValue();
		}

		int aCount = Collections.frequency(hands, Card.SPADE_ACE);
		while (value > 21 && aCount > 0) {
			value -= 10;
			aCount--;
		}
		return (value > 21 ? -1 : value);
	}

	public void showHands() {
		System.out.println(hands);
	}

	public void addMoney(int money) {
		this.money += money;
	}

	public void loseMoney(int money) {
		this.money -= money;
	}
}
