package myobj.prizedraw;

public class DrawMachine {

	private Prize[] prizes;
	private Prize[] pickBox = new Prize[100];

	public DrawMachine() {
		prizes = new Prize[3];

		prizes[0] = new Prize("물휴지", 200, 0.5);
		prizes[1] = new Prize("초콜레", 100, 0.2);
		prizes[2] = new Prize("비틀즈", 50, 0.2);

		// prizes에 들어있는 상품으로 확률을 만듬
		int index = 0;
		for (int i = 0; i < prizes.length; i++) {
			double per = prizes[i].getChance() * 100;
			for (int j = 0; j < per; j++) {
				pickBox[index++] = prizes[i];
			}

		}

	}

	private void initpickBox() {
		int index = 0;
		for (int i = 0; i < prizes.length; i++) {
			double per = prizes[i].getChance() * 100;
			for (int j = 0; j < per; j++) {
				pickBox[index++] = prizes[i];
			}
		}
	}

	public Prize draw() {

		Prize present = pickBox[(int) (Math.random() * 100)];
		if (present == null) {
			return new Prize("꽝", 0, 0);
		} else {
			if (present.getQty() == 0) {
				return new Prize("상품 소진", 0, 00);
			}
			present.minusQty();
			return present;
		}
	}

	public DrawMachine(Prize[] prizes) {
		this.prizes = prizes;
		initpickBox();
	}
}
