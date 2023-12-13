
public class C16_AbstractClass {

	/*
	 * # 추상 클래스 (abstract class)
	 * 
	 * - 추상 메서드를 가지고 있는 클래스
	 * 
	 * - 미구현 메서드가 있어서 인스턴스 생성이 불가
	 * 
	 * # 추상 메서드
	 * 
	 * - 선언만 해놓고 구현은 아직 하지 않은 메서드로 상속받은 쪽에서 구현하면 됨
	 * 
	 */

	public static void main(String[] args) {

		// new Tree();

	}
}

// abstract method를 포함하고 있다는 뜻 (abstract class)
abstract class Tree {

	String name = "나무";

	public void breath() {
		System.out.println("ㅇㅇ");
	}

	// 나중에 받아서 쓸 때 구현해서 사용 (abstract method)
	abstract public void harvest();

	abstract public void fruit();

}

// abstract method 를 구현하지 않으면 빨간줄로 알려줌
class OrangeTree extends Tree {
	@Override
	public void fruit() {

	}

	@Override
	public void harvest() {

	}
}

// abstract 또 사용가능
abstract class AppleTree extends Tree{
	
}

class GreenAppleTree extends AppleTree{
	@Override
	public void fruit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		
	}
}