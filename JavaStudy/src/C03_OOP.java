

public class C03_OOP {

	/*
	 * 객체 지향 프로그래밍(Object Oriented Programming)
	 * 
	 * 변수와 함수들을 하나의 개념으로 묶어서 생각하는 프로그래밍 방식
	 * 
	 * 변수와 함수들을 무분별하게 사용하면 여러 문제점들이 발생함
	 * 
	 * 문제점들을 줄이기 위해 현실에 존재하는 하나의 개념(객체)으로 묶어서 생각하기 시작
	 * 
	 * 변수는 주로 객체의 현재 상태를 나타내며 함수는 여러 기능을 나타냄
	 * 
	 * 함수는 해당 객체의 현재 상태를 변화시키며 그 함수를 메서드라고 부름
	 * 
	 * ex) 책
	 * 
	 * 책의 현재 상태(변수) : 현재 보고 있는 페이지, 제목, 작가, 낙서의 위치
	 * 
	 * 책의 기능(메서드) : 페이지를 앞으로 넘김, 뒤로 넘김, 새로운 낙서 추가 등 책의 현재 상태를 변화시키는 것들
	 * 
	 * 클래스(class)
	 * 
	 * 객체를 프로그래밍 언어로 표현하는 문법, 해당 객체의 설계도 역할을 함 클래스를 정의한 시점에는 실제 객체가 존재하지 않음 클래스를 통해
	 * 만들어내는 실제 객체를 인스턴스(instance)라고 부르며 생성시 new를 사용한다
	 * 
	 * 
	 */

	public static void main(String[] args) { // main 쓰고 ctrl + space 하면 자동완성 튀어나옴
		// book 클래스의 인스턴스를 3개 생성함
		book b1 = new book();
		book b2 = new book();
		book b3 = new book();
		int a = 0;
		// 생성된 인스턴스에 .을 사용해서 해당 클래스의 변수와 메서드를 사용할 수 있다
		b1.maxPage = 100;
		b1.currentPage = 22;

		b2.maxPage = 120;
		b2.currentPage = 33;
		b2.secondHand = true;

		System.out.printf("책1 : %d, %d (%s)\n", b1.maxPage, b1.currentPage, b1.secondHand ? "중고" : "신품");
		System.out.printf("책2 : %d, %d (%s)\n", b2.maxPage, b2.currentPage, b2.secondHand ? "중고" : "신품");
		System.out.printf("책3 : %d, %d (%s)\n", b3.maxPage, b3.currentPage, b3.secondHand ? "중고" : "신품");
		System.out.println();

		// 클래스에 정의한 메서드(함수)로 각 인스턴스를 변화시킬 수 있음
		for (int i = 0; i < 5; i++) {

			b1.nextPage();
			b2.prevPage();

		}

		System.out.printf("책1 : %d, %d (%s)\n", b1.maxPage, b1.currentPage, b1.secondHand ? "중고" : "신품");
		System.out.printf("책2 : %d, %d (%s)\n", b2.maxPage, b2.currentPage, b2.secondHand ? "중고" : "신품");
		System.out.printf("책3 : %d, %d (%s)\n", b3.maxPage, b3.currentPage, b3.secondHand ? "중고" : "신품");
		System.out.println();

		b1.printBookInfo();
		b2.printBookInfo();
		b3.printBookInfo();
		System.out.println();

		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();

		p1.apple = false;
		p2.apple = true;

		p1.newNum = 4;
		p2.newNum = 14;
		p3.newNum = 21;
		p1.secondHand = true;
		p2.secondHand = false;

		p1.phoneType = "fold";
		p3.phoneType = "galaxyS";
		
		p1.phonePrice = (int)(Math.random() * 1000000);
		p2.phonePrice = (int)(Math.random() * 1000000);
		p3.phonePrice = (int)(Math.random() * 1000000);
		// int로 랜덤정수 타입변환시 범위설정에 주의 잘못정하면 0~0

		System.out.printf("폰1 %s %d %s\n", p1.phoneType, p1.newNum, p1.apple ? "아이폰" : "삼성");
		System.out.printf("폰2 %s %d %s\n", p2.phoneType, p2.newNum, p2.apple ? "아이폰" : "삼성");
		System.out.printf("폰3 %s %d %s\n", p3.phoneType, p3.newNum, p3.apple ? "아이폰" : "삼성");

		p1.phoneName();
		p2.phoneName();
		p3.phoneName();

		p1.phoneCheck();
		p2.phoneCheck();
		p3.phoneCheck();

		p1.total();
		p2.total();
		p3.total();
		System.out.println((int)(Math.random() * 1000000));

	}

}

// 책 클래스(설계도)
class book {
	// 두 가지의 변수(현재상태, 필드, 인스턴스 변수, 멤버 변수)를 가짐
	int maxPage;
	int currentPage;
	boolean secondHand;
	String[] contents;
	// 클래스의 인스턴스 변수는 배열처럼 자동으로 초기화가 되어있다
	// int = 0, double float = 0.0, boolean = false

	// 클래스 내부의 함수(메서드)
	// 주로 현재 인스턴스(this)의 상태를 변화시키는 역할(초록색)
	void nextPage() {
		if (maxPage > currentPage) {
			++this.currentPage; // this를 안쓰면 그냥 this가 생략된거임
		} else {
			System.out.println("맨끝임");
		}
	}

	void prevPage() {
		if (currentPage > 0) {
			--this.currentPage;
		} else {
			System.out.println("맨앞임");

		}
	}

	void printBookInfo() {
		System.out.printf("현재 책 상태 %d / %d (%s)\n", this.currentPage, this.maxPage, this.secondHand ? "중고" : "신품");
	}
}

/*
 * 실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후 해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상태를 출력해보세요
 * 인스턴스 3개 이상, 필드 3개 이상, 메서드 2ㄱ 이상, 책은 ㄴㄴ
 */

class Phone {

	boolean apple;
	int newNum;
	String phoneType;
	boolean secondHand;
	int phonePrice;

	void phoneName() {
		System.out.println(this.phoneType + this.newNum);
	}

	void phoneCheck() {

		if (apple) {
			phoneType = "iPhone";
			newNum = 14;
			System.out.println(phoneType + newNum + " *");
		} else {

			System.out.println(phoneType + newNum + " *");
		}
	}


	void total() {
		System.out.printf("%s%d (%s) %d %s\n", phoneType, newNum, secondHand ? "중고" : "신품", phonePrice, "원");
	}

}

class Vehicle {
	String name;
	int fuel;
	int price;

	String getGrade() {
		if (price > 10000000) {
			return "럭셔리카";
		} else if (price > 80000000) {
			return "덜 럭셔리카";
		} else {
			return "덜덜 럭셔리카";
		}

	}
}

class gun{
	String name;
	int damage;
}
