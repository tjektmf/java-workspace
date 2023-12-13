
public class C10_Object {

	public static void main(String[] args) {

		/*
		 * # Object class
		 * 
		 * 모든 자바 클래스들의 최상위 클래스로 모든 클래스는 Object를 상속받아 만들어짐
		 * 
		 * Object class의 메서드는 모든 클래스에 존재하며 해당 클래스에 맞는 형태로 override하여 사용하게끔 설계됨
		 * 
		 * # Object.toString()
		 * 
		 * 해당 객체를 문자열로 표현하면 어떤 모양인가 를 정의하는 메서드
		 * 
		 * 자바의 모든 객체는 toString()을 통해 문자열로 표현될 수 있다
		 * 
		 * Object class에 정의되어 있는 toString() 메서드의 원형은 해당 클래스의 이름과 메모리상 주소를 출력함
		 * 
		 * print()등 다양한 메서드에서 객체의 toString()을 활용한다
		 * 
		 * # Object.equals()
		 * 
		 * 해당 객체로 만들어진 두 인스턴스가 같은지를 판단하는 기준을 정의하는 메서드
		 * 
		 * 매개변수로 전달받은 인스턴스와 this를 비교하여 결과를 리턴한다
		 * 
		 * Object class에 정의되어 있는 equals()의 원형은 동일한 인스턴스인지 비교함
		 * 
		 * # Object.hashCode()
		 * 
		 * 해당 인스턴스의 지문 역할을 하는 값을 생성하는 메서드
		 * 
		 * Object class의 기본 동작은 해당 인스턴스의 주소값을 리턴
		 * 
		 * # hash 알고리즘
		 * 
		 * 같은 값을 넣으면 예측하기 힘든 일정한 값이 나와야함
		 * 
		 * 다른 값을 넣었을 때 같은 값이 나오면 안됨
		 * 
		 * 해시알고리즘으로 얻어낸 결과값으로 원래 값을 유추하기 어려워야함
		 */

		Snack s1 = new Snack("빅파이", 2000);
		Snack s2 = new Snack("빅파이", 2000);
		Snack s3 = new Snack("몽쉘", 3000);
		System.out.println(s1); // Snack@75a1cd57 이런식으로 출력됨
		System.out.println();
		s1.info();
		s1.toString();

		String snackStr = s1.toString();
		System.out.println();
		System.out.println(snackStr);
		// print() 메서드들은 해당 객체의 toString() 결과를 콘솔에 출력하는 메서드임
		// 모든 객체는 toString()을 가질 수밖에 없음

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equal(s2)); // true
		System.out.println(s1.equal(s3)); // false
		//
		Object o1 = 123;
		Object o2 = "123";
		Object o3 = new DumpTruck();

	}
}

class Snack {
	String name;
	int price;

	public Snack() {
		name = "기본"; // 매개변수가 없으니 걍 this. 없이 필드그대로 써도댐
		price = 500;
	}

	public Snack(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.println("과자 이름 : " + name);
		System.out.println("과자 가격 : " + price);
	}

	// 이 객체를 문자열로 표현
	@Override
	public String toString() { // 설정해두면 print()에서 얘네를 가져감

		return "[" + name + " / 가격:" + price + "]";
	}

	@Override
	public boolean equals(Object obj) { // 기본적으로 같다는걸 확인시키는건데 그 같다라는 조건을 내가정할수있음
		Snack s1 = this;
		Snack s2 = (Snack) obj; // 오브젝트값을 받아야하므로 다운캐스팅을 해서 비교해야함
		return s1.price == s2.price && s1.name.equals(s2.name);
	}

	public boolean equal(Snack snack) { // 걍 equals 안쓰고 새로만들면 Snack타입 받을수있음
		Snack s1 = this;
		return s1.price == snack.price && s1.name.equals(snack.name);
	}

}