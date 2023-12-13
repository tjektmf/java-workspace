
public class C17_Interface {

	/*
	 * 
	 * # 인터페이스 (interface)
	 * 
	 * - 추상 클래스처럼 내부에 추상 메서드를 지닐 수 있다
	 * 
	 * - 추상 메서드로 규격을 만들어 놓고 해당 규격을 상속받는 클래스들을 규격에 소속하게 만들어줌
	 * 
	 * - 추상 클래스는 한 클래스에 하나만 상속가능하지만 인터페이스는 한 클래스에 여러개 구현가능함
	 * 
	 * - 해당 클래스에 다형성을 추가하는 용도
	 * 
	 * - 추상 클래스에는 인스턴스 영역이 존재하지만 인터페이스에는 인스턴스 영역이 없다
	 * 
	 */

	public static void main(String[] args) {

		Human minso = new Human("alstn");
		Bear bear = new Bear("반달");
		Bear bear2 = new Bear("불");

		Stuff stuff = new Stuff("돌");

		minso.throwing(stuff);
		bear.bite(stuff);
		bear2.scratch(stuff);
		
		// 인터페이스 타입으로 업캐스팅 가능
		Swimmer swimmer1 = minso;
		Swimmer swimmer2 = bear;
		
		System.out.println(swimmer1 instanceof Bear);
		System.out.println(swimmer2 instanceof Bear);
		
		
	}

}

// 인터페이스 내부의 메서드는 모두 추상 메서드임
// 인터페이스 내부의 변수는 모두 static 변수임 (인스턴스 추가불가)
interface Runner {
	abstract void run(); // abstract 안써도됨

}

interface Swimmer {
	void swim();

	void fastswim();
}

class Human implements Runner, Swimmer { // 클래스는 두개못붙임 인터페이스가 더 편한듯

	String name;

	public Human(String name) {
		this.name = name;
	}

	void throwing(Stuff stuff) {
		System.out.println(name + "이 " + stuff + "을 던짐");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fastswim() {
		// TODO Auto-generated method stub

	}
}

class Stuff implements Runner, Swimmer{
	String name;

	public Stuff(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastswim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Bear implements Runner, Swimmer{
	String name;

	public Bear(String name) {
		this.name = name;
	}

	void bite(Stuff stuff) {
		System.out.printf("\"%s\"곰은 %s을 물어\n", name, stuff);
	}

	void scratch(Stuff stuff) {
		System.out.printf("\"%s\"곰은 %s을 샥\n", name, stuff);

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastswim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
