
public class C15_Final {

	/*
	 * 
	 * # final
	 * 
	 * - 변수 앞에 final을 붙이면 이후 변경할 수 없는 값이 됨 Const.
	 * 
	 * - 매서드 앞에 final을 붙이면 오버라이드가 금지됨
	 * 
	 * - 클래스 앞에 final을 붙이면 해당 클래스는 상속이 금지됨
	 */

	public static void main(String[] args) {

		// 변수 선언 시 앞에 final 붙이면 변경 불가능
		final int a;
		a = 99;
		
		UndergroundUnit lurk = new UndergroundUnit();
		lurk.borrow();
		lurk.hit();
	}
}

class Unit {

	int hp;
	int attack;

	public void hit() {
		System.out.println(attack + " 의 공격력으로 때림");
	}

	// 메서드에 final 붙이면 오버라이드 금지
	final public void gotHit(int attack) {
		hp = hp - attack;
	}
}

//class에 final 붙이면 상속불가
final class UndergroundUnit extends Unit {
	boolean borrow = false;

	void borrow() {
		borrow = true;
	}

	void unborrow() {
		borrow = false;
	}

	@Override
	public void hit() {

		if (borrow) {
			System.out.println("땅속임 퓨슈슈슉");
		} else {
			System.out.println("땅위임 ㅌㅌㅌ");
		}
	}
}
