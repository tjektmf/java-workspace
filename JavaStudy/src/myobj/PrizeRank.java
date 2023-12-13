package myobj;

public class PrizeRank {

	public int coin() {
		return (int) (Math.random() * 101);
	}

	public int winner() {
		if (coin() > 96) {
			if (PrizeGoods.prize1st != 0) {
				return 1;
			} else {
				return 6;
			}
		} else if (coin() > 90) {
			if (PrizeGoods.prize2nd != 0) {
				return 2;
			} else {
				return 7;
			}
		} else if (coin() > 80) {
			if (PrizeGoods.prize3rd != 0) {
				return 3;
			} else {
				return 8;
			}

		} else if (coin() > 50) {
			if (PrizeGoods.prize1st != 0) {
				return 4;
			} else {
				return 9;
			}
		} else {
			return 5;
		}
	}

}
