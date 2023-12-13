package quiz;

import myobj.Jackjack;

public class Blackjack {
	
	/*
	 	j q k 는 전부 10 a는 11로 쓰다가 버스트시 1로 바뀜
	 	
	 	딜러규칙 가진 카드의 합이 16이하면 뽑음 17이상이면 스답
	 	
	 	플레이어 stand 선택시 카드오픈, hit 선택시 카드한장뽑음 
	 	
	 	가진 카드 가치의 합이 21을 초과하면 버스트, a없이 버스트면 즉시 패배
	 	21이면 블랙잭(더이상 못뽑음 hit불가능 바로 딜러가 카드뽑음)

	 */
	
	public static void main(String[] args) {
		
		Jackjack go = new Jackjack();
		go.cardNumber();
		go.cardShape();
		go.cardSet();
		
		go.openningCard();
		go.realGame();
	
		
		
	}

}
