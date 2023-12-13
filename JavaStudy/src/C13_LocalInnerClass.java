import myobj.SubLiberal;
import myobj.SubScience;
import myobj.Subject;

public class C13_LocalInnerClass {

	/*
	 * # 지역 내부 클래스
	 * 
	 * - 클래스는 메서드 내부에서도 선언할 수 있다
	 * 
	 * - 해당 메서드 밖에서는 사용할 수 없는 일시적인 클래스
	 * 
	 * # 익명 지역 내부 클래스
	 * 
	 * - 지역에서 클래스를 바로 상속받아 사용하는 방식
	 * 
	 * - 클래스 이름을 지정할 수 없기 때문에 익명 클래스라고 부른다
	 * 
	 * 
	 */

	public static void main(String[] args) {

		class Apple {

			int color = 1;
			int sweet;
			int price;

		}
		Apple a = new Apple();
		System.out.println(a.color);

		Subject s1 = new Subject();
		Subject s2 = new SubScience();
		// 클래스를 만들면서 상속 (클래스 이름을 지정할 수 없는 익명 클래스, 재사용 불가)
		Subject s3 = new Subject() {

			int c = 20;
			int java = 40;

			@Override
			public int getTotal() { // 필드나 메서드 이름을 잘지어야 나중에 쓰기편함

				return c + java;
			}

			@Override
			public void printScores() {
				System.out.println("성적 출력");
			}

		};
		Subject s4 = new SubLiberal() {
			public void printScores() {
				System.out.println("dddd");
			}
		};

		s2.printScores();
		s3.printScores();
		System.out.println(s3.getTotal());
		s4.printScores();
	}
}