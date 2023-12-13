import java.util.Arrays;

public class C07_ReferencesType {

	/*
	 * - 기본형 데이터 타입
	 * 
	 * byte, short, int, char, long, double, boolean 등 소문자로 시작함
	 * 
	 * 기본형 데이터 타입 변수에는 실제 값이 저장되며 . 을 통해 사용할 수 없다
	 * 
	 * - 참조형 데이터 타입
	 * 
	 * String, 배열, 클래스(내가 만든 타입)
	 * 
	 * 인스턴스에 위치(주소값)가 저장되므로 . 을 통해 저장된 주소를 찾아가서 사용가능
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// 기본형 데이터 타입
		int a = 10;
		int b = a;

		b = 13;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// 참조형 데이터 타입, 내가만든 card타입
		Card c1 = new Card('H', 10);
		Card c2 = c1; // 얕은 복사(주소값만 복사)

		Card c3 = new Card(c1.shape, c1.num); // 깊은 복사(동일한 인스턴스를 만들어냄)

		c2.num = 3;

		System.out.println("c1 : " + c1.shape + c1.num);
		System.out.println("c2 : " + c2.shape + c2.num);
		System.out.println("c3 : " + c3.shape + c3.num);

		int a1 = 10;

		plus(a1);
		System.out.println(a1);
		Card c4 = new Card('C', 200);

		System.out.println(c4.num);
		changeNum(c4);
		System.out.println(c4.num); // 메서드 실행 전후로 값이 200에서 1로 바뀜

		int[] nums = { 10, 11, 12, 13, 14 };
		
		System.out.println(Arrays.toString(nums));
		changeElement(nums); // 메서드 실행 전후로 값이 바뀜 배열도 참조형 타입임
		System.out.println(Arrays.toString(nums));
	
		int aa = 10;
		System.out.println(aa);
		really(aa); // 메서드 실행 전후로 값이 안바뀜
		System.out.println(aa);
//		System.out.println(really(aa));
	}
	public static void really(int a) {
		a +=10;
	}

	public static void changeElement(int[] arr) {
		arr[0] = arr[0] * 2;
		arr[1] = arr[1] * 5;

	}

	public static void changeNum(Card c) {
		c.num = 1;
		System.out.println("바뀐 카드 : " + c.num);
	}

	public static void plus(int num) {
		num += 3;
		System.out.println("num + 3 = " + num);
	}

}
