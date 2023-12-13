package myobj;

public class Phone {

	public boolean apple;
	public int newNum;
	public String phoneType;
	public boolean secondHand;
	public int phonePrice = (int) (Math.random() * 1000000);

	public Phone() {
	}

	public Phone(String phoneType, int newNum) { // 위에 ()에 들어있는 매개변수 종류들은 다 적어줘야함
		this.phoneType = phoneType;
		this.newNum = newNum;
		this.secondHand = true; // secondHand 값은 트루를 기본값으로 가져감

	}

	public void phoneName() {
		System.out.println(this.phoneType + this.newNum);
	}

	public void phoneCheck() {

		if (apple) {
			phoneType = "iPhone";
			newNum = 14;
			System.out.println(phoneType + newNum + " *");
		} else {

			System.out.println(phoneType + newNum + " *");
		}
	}

	public void total() {
		System.out.printf("%s%d (%s) %d %s\n", phoneType, newNum, secondHand ? "중고" : "신품", phonePrice, "원");
	}

}
