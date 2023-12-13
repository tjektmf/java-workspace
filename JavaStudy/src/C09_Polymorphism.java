
public class C09_Polymorphism {

	/*
	 * 객체의 다형성
	 * 
	 * 객체가 다양한 형태를 지니는 성질
	 * 
	 * 사과는 사과면서 과일임
	 * 
	 * 
	 * 업 캐스팅
	 * 
	 * - 하위 타입이 상위 타입이 되는 것 (사과가 과일이 됨) 
	 * 
	 * - 하위 타입 인스턴스는 이미 내부에 상위 타입의 모든 것을 지니고 있으므로 상위 타입으로 타입 캐스팅 가능 
	 *
	 * - 업캐스팅된 하위 타입의 인스턴스는 원래 가지고 있떤 하위 클래스의 기능들을 사용할 수 없다
	 * 
	 * 다운 캐스팅
	 * 
	 * - 상위 타입을 하위 타입으로 만듬
	 * 
	 * - 일반적으로 상위 타입은 하위 타입이 될 수 없음
	 * 
	 * - 원래 하위 타입이었다가 업캐스팅 된 인스턴스의 경우 다시 원래의 타입으로 다운캐스팅 가능
	 * 
	 * instanceof 연산자
	 * 
	 * - 해당 인스턴스가 특정 클래스의 인스턴스인지 검사해주는 비교연산자
	 * 
	 * - 
	 * 
	 */

	public static void main(String[] args) {

		// Car c1 = (Car)(new DumpTruck()); // 덤프트럭을 카타입으로 캐스팅함 카타입이 상위클래스이므로 문제없음 업캐스팅

		DumpTruck d1 = new DumpTruck();
		d1.addCargo(100);

		Car c1 = (Car) (d1); // 원래는 덤프트럭인데 업캐스팅되면 더이상 트럭기능 사용불가 카 클래스 메서드만 사용가능

		Liquid l1 = new Liquid();
		Liquid w1 = new Water();
		Soju s1 = new Soju();
		Milk m1 = new Milk();
		
		// 업 캐스팅은 굳이 안적어도 됨 자연스러운 타입 캐스팅
		// 예를들면 int = (int)byte 이런건 자연스러움
		
		//override된 메서드는 하위클래스에 구현된 대로 사용가능
		l1.drink();
		w1.drink();
		s1.drink();
		m1.drink();
		
	//	DumpTruck d2 = new Car("자동차", "현대", 200);
		
		Car c2 = new DumpTruck();
		DumpTruck d2 = (DumpTruck)c2;
		
		Car c3 = new Car("삼성", "삼셩", 12);
	//	c2는 원래 트럭인스턴스였기 때문에 원래대로 돌아갈 수 있음 이 경우에만 다운 캐스팅 가능
		System.out.println(c1 instanceof DumpTruck);
		System.out.println(c1 instanceof Car);
		System.out.println(c3 instanceof Car);
		System.out.println(c3 instanceof DumpTruck); // false 나옴

	}

}

class Liquid {
	void drink() {
		System.out.println("뭔가 마심");
	}
}

// 위랑 똑같음 override 메서드 덮어쓰기
class Water extends Liquid {
	@Override // 써두면 오타났을때 확인가능 
	void drink() {
		System.out.println("물마심");
	}
}

class Soju extends Liquid {
	void drink() {
		System.out.println("술마심");
	}
}

class Milk extends Liquid {
	
}