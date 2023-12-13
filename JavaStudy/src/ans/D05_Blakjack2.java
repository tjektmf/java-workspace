package ans;

import java.util.Scanner;

import myobj.blackjack.Card;
import myobj.blackjack.CardDeck;
import myobj.blackjack.Player;

public class D05_Blakjack2 {

	public static void main(String[] args) {

		CardDeck deck = Card.getDeck(3);

		Player player = new Player("철수");
		Player dealer = new Player("딜러");

		Scanner sc = new Scanner(System.in);

		player.addCard(deck.draw());
		dealer.addCard(deck.draw());
		player.addCard(deck.draw());
		dealer.addCard(deck.draw());
		dealer.hide(0);

		while (true) {
			System.out.println(player);
			System.out.println("-- 플레이어 -- ");
			player.showHands();
			System.out.println("플레이어 패 : " + player.getHandValue());
			System.out.println("-- 딜러 -- ");
			dealer.showHands();

			System.out.print("\n1. Hit\t2. Stand\n>>");
			int select = sc.nextInt();

			if (select == 1) {
				player.addCard(deck.draw());
				int value = player.getHandValue();
				if (value == -1 || value == 21) {
					break;
				}
			} else if (select == 2) {
				break;
			} else {
				System.out.println("warning pls select 1 or 2 ");
			}

		}

		int playerHandValue = player.getHandValue();
		if (playerHandValue == -1) {
			System.out.println("플레이어 버스트, 딜러 승리");
			return;
		}

		int v;
		while ((v = dealer.getHandValue()) < 17 && v != -1) {
			dealer.addCard(deck.draw());
		}

		dealer.open(0);

		int dealerHandValue = dealer.getHandValue();

		System.out.println("== 결과 ==");
		player.showHands();
		System.out.println("플레이어 패의 가치 : " + player.getHandValue());
		dealer.showHands();
		System.out.println("딜러 패의 가치 : " + dealer.getHandValue());

	//	System.out.printf("%s의 승리\n", playerHandValue > dealerHandValue ? "플레이어" : "딜러");
		
		if(dealerHandValue==-1) {
			System.out.println("딜러 버스트, 플레이어 승리");
		}

		if (playerHandValue == dealerHandValue) {
			System.out.println("무승부");
		} else if (playerHandValue > dealerHandValue) {
			System.out.println("플레이어 승리");
		} else if (playerHandValue < dealerHandValue) {
			System.out.println("딜러 승리");
		}

	}
}
