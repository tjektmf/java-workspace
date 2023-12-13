package myobj;

public class PrizeGoods2 extends PrizeArr {

	public void unlucky() {
		
		switch (fire()) {

		case 1:
			System.out.println("ㅊㅋㅊㅋ1등");
			PrizeGoods.prize1st--;
			break;
		case 2:
			System.out.println("ㅊㅋㅊㅋ2등");
			PrizeGoods.prize2nd--;
			break;
		case 3:
			System.out.println("3등");
			PrizeGoods.prize3rd--;
			break;
		case 4:
			System.out.println("4등");
			PrizeGoods.prize4th--;
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

	public int fire() {
		
		int destiny = 0;
		destiny = (int) (Math.random() * total);
		if (goodsArr[destiny] == 1) {
			if (PrizeGoods.prize1st != 0) {
				
				return 1;
			} else {
				return 6;
			}
		} else if (goodsArr[destiny] == 2) {
			if (PrizeGoods.prize2nd != 0) {
				
				return 2;
			} else {
				return 7;
			}
		} else if (goodsArr[destiny] == 3) {
			if (PrizeGoods.prize3rd != 0) {
				
				return 3;
			} else {
				return 8;
			}
		} else if (goodsArr[destiny] == 4) {
			if (PrizeGoods.prize4th != 0) {
			
				return 4;
			} else {
				return 9;
			}
		} else {
			return 5;
		}
	}

}
