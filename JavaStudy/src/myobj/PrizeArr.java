package myobj;

public class PrizeArr {

	int total = 20;
	int[] goodsArr = new int[total];
	int dice;

//	public int[] fullArr() {
//		for (int i = 0; i < 100; i++) {
//			goodsArr[i] = 0;
//		}
//		return goodsArr;
//	}

	public int[] fullArr() {
		for (int i = 0; i < this.total; i++) {
			goodsArr[i] = 0;
		}
		return goodsArr;
	}

	public int[] thx1st() {
		for (int i = 0; i < PrizeGoods.prize1st; i++) {
			dice = (int) (Math.random() * this.total);
			if (goodsArr[dice] == 0) {
				goodsArr[dice] = 1;
			} else {
				i--;
			}
		}
		return goodsArr;
	}

	public int[] thx2nd() {
		for (int i = 0; i < PrizeGoods.prize2nd; i++) {
			dice = (int) (Math.random() * this.total);
			if (goodsArr[dice] == 0) {
				goodsArr[dice] = 2;
			} else {
				i--;
			}
		}
		return goodsArr;
	}

	public int[] thx3rd() {
		for (int i = 0; i < PrizeGoods.prize3rd; i++) {
			dice = (int) (Math.random() * this.total);
			if (goodsArr[dice] == 0) {
				goodsArr[dice] = 3;
			} else {
				i--;
			}
		}
		return goodsArr;
	}

	public int[] thx4th() {
		for (int i = 0; i < PrizeGoods.prize4th; i++) {
			dice = (int) (Math.random() * this.total);
			if (goodsArr[dice] == 0) {
				goodsArr[dice] = 4;
			} else {
				i--;
			}
		}
		return goodsArr;
	}

	public int[] thxArr() {
		thx1st();
		thx2nd();
		thx3rd();
		thx4th();
		return goodsArr;

	}
}
