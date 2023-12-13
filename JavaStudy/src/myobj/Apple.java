package myobj;

public class Apple {

	// 사과의 속성(인스턴스 변수, 멤버, 필드, 상태)
	public int price;
	public int sweet;
	public double weight;
	public String color = "Pink";

	// 사과의 생성자 (이 클래스의 인스턴스를 생성할 때 호출해야 하는 것)
	// 생성자 오버로딩을 통해 하나의 클래스에 여러 생성자를 보유할 수 있다
	public Apple() {
	}

	public Apple(int price) { // 가격만 받아서 채우고 나머지는 기본값을 사용
		this.price = price;
		this.sweet = 99999;
		this.weight = 9999.0;
		this.color = "빨강999";
	}
	public Apple(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
		this.weight = 5555.0;
		this.color = "노랑555";
	}

	public Apple(int price, int sweet, double weight, String color) {
		// 인스턴스 생성과 동시에 필드값을 초기화
		// 메서드의 매개변수 이름과 필드명이 같으면 this를 통해 명확하게 구분
		// 이경우엔 반드시 사용

		this.price = price;
		this.sweet = sweet;
		this.weight = weight;
		this.color = color;

	}

	// 사과의 메서드 (인스턴스 변수를 변화시키거나 꺼내서 활용)
	public void info() {
		System.out.printf("%d원 / 당도 %d / 무게 : %.2f %s\n", price, sweet, weight, color);
	}

}
