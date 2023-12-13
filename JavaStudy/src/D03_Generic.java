
public class D03_Generic {

	/*
	 * # Generic
	 * 
	 * 클래스를 정의할 때 나중에 타입을 지정할 수 있도록 설계해두는것
	 * 
	 * 해당 클래스의 인스턴스 생성시 제네릭의 타입을 결정할 수 있다
	 * 
	 * 제네릭에는 기본타입 사용불가(int, char, short 불가능 대신 Integer, Character, Short로 사용가능 앞이 대문자임
	 * 
	 * 제네릭은 한 클래스에 여러개 설정할 수 있다
	 * 
	 * 제네릭이 있는 클래스에 제네릭 타입을 설정하지 않으면 Object 타입으로 설정된다
	 * 
	 */

	public static void main(String[] args) {

		// 클래스를 정의할 때 타입을 정하지 않고 인스턴스 생성시 결정
		Fish<Integer> f1 = new Fish<>();
		Fish<String> f2 = new Fish<>();

		f1.a = 10;
		f1.b = new Integer[10];
		
		f2.a = "fish";
		f2.b = new String[5];
		
		Whale<Fish, Integer> w1 = new Whale<>(); // 
		
		w1.food = new Fish<>();
		w1.drink = 123;

	}
}

class Fish<T> {
	T a;
	T[] b;
	
	T swim() {
		return a;
	}
}

class Whale<T, E>{ // T와 E를 나중에 정해줘야함
	T food;
	E drink;
}