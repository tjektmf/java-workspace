package myobj;

public class PrizeGoods extends PrizeRank {

	public void lucky() {

		switch (winner()) {

		case 1:
			System.out.println("ㅊㅋㅊㅋ1등");
			prize1st--;
			break;
		case 2:
			System.out.println("ㅊㅋㅊㅋ2등");
			prize2nd--;
			break;
		case 3:
			System.out.println("3등");
			prize3rd--;
			break;
		case 4:
			System.out.println("4등");
			prize4th--;
			break;
		case 6:
			System.out.println("1등인데 재고없음 꽝");
			break;
		case 7:
			System.out.println("2등인데 재고없음 꽝");
			break;
		case 8:
			System.out.println("3등인데 재고없음 꽝");
			break;
		case 9:
			System.out.println("4등인데 재고없음 꽝");
			break;
		default:
			System.out.println("꽝");
			break;
		}
		

	}
	
	// 상품 개수
	static int prize1st = 1;
	static int prize2nd = 3;
	static int prize3rd = 5;
	static int prize4th = 10;

	

}
