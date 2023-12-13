
public class C08_Extend {

	/*
	 * 
	 * 클래스 상속
	 * 
	 * 이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법
	 * 
	 * 클래스를 물려받아 기능을 추가하거나 수정해서 사용할 수 있다
	 * 
	 * 기능을 고쳐서 사용하는 것을 Override 라고 한다
	 * 
	 * 상속을 받은 하위 클래스는 반드시 가장 먼저 상위 클래스의 생성자를 호출해야 한다
	 * 
	 * super
	 * 
	 * 하위 클래스로 생성된 인스턴스는 두 부분으로 분류할 수 있다
	 * 
	 * this는 해당 인스턴스의 현재 클래스를 의미
	 * 
	 * super는 해당 인스턴스의 상위 클래스를 의미
	 * 
	 * this()는 현재 클래스의 다른 생성자를 호출할 때 사용
	 * 
	 * super()는 현재 클래스의 상위 생성자를 호출할 때 사용
	 * 
	 */

	public static void main(String[] args) {

		Car c1 = new Car("레이", "기아", 200);
		Car c2 = new Car("아반떼", "현대", 300);
		DumpTruck d1 = new DumpTruck();

		d1.accelerate();
		d1.decelerate();
		d1.addCargo(10);
		d1.info();
		// c1.addCargo(0); 얘는 DumpTruck 클래스에 있는 메서드 못씀
		
		
	
	}

}

class Car {
	String name;
	String brand;
	int fuel;
	int speed;
	final int MAX_SPEED;
	int weight; 

// 생성자를 만들지 않으면 기본생성자가 있지만 생성자를 만들면 기본생성자가 없어짐
// 그래서 기본생성자를 따로 만들어주지 않으면 오류가 발생함
//	public Car() {
//		this.MAX_SPEED =0;
//	}

	public Car(String name, String brand, int MAX_SPEED) { // ctrl + space > 생성자 자동으로 만들어줌
		this.name = name;
		this.brand = brand;
		this.MAX_SPEED = MAX_SPEED;
	}

	void accelerate() {
		++speed;
	}

	void decelerate() {
		--speed;
	}
}

// Car 클래스를 상속받은 DumpTruck 클래스
class DumpTruck extends Car {

	int hp;
	int weight;
	final int MAX_WEIGHT;

	public DumpTruck() {
		super("덤프", "스카니아", 500); // 상위클래스의 생성자 가장 먼저 호출
		this.MAX_WEIGHT = 1;
	}

	public DumpTruck(String name, String brand, int MAX_SPEED, int MAX_WEIGHT) {
		super(name, brand, MAX_SPEED);
	//	public Car(String name, String brand, int MAX_SPEED) 여기서 3개만 설정했으므로 똑같이 해야함
		this.MAX_WEIGHT = 0; // final 설정해놔서 값 초기화해놔야함
		super.speed = 100;
	}

	void addCargo(int kg) {
		this.weight += kg;
	}

	void reduceCargo(int kg) {
		this.weight -= kg;
	}

	void removeCargo() {
		weight = 0;
	}
	
	void info() {
		System.out.println("현재 적재량 : " + this.weight); // DumpTruck 클래스의 필드
		System.out.println("현재 적재량 : " + super.weight); // Car 클래스의 필드
		// 현재 클래스는 Dump클래스이므로 this는 DumpTruck 클래스, super는 상위클래스인 Car 클래스
		// 클래스에 중복되는 이름은 this, super로 구별해서 사용가능함
		System.out.println("현재 속도 : " + this.speed); // 클래스 내에 speed 필드가 없으면 자동으로 상위클래스의 필드를 가져옴
		System.out.println("현재 속도 : " + super.speed); // super.weight는 없음 덤프트록에서 만든 필드라서
		System.out.println(name+brand+MAX_SPEED);
	}
	
}
