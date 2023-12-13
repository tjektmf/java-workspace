
public class C14_InstanceLifeCycle {

	/*
	 * # 인스턴스 생명 주기
	 * 
	 * - 하나의 인스턴트가 생성될 때 실행되는 코드 순서
	 * 
	 * 1. 스태틱 영역 (최초의 클래스 호출 시 딱 한 번 실행)
	 * 
	 * 2. 인스턴스 영역 (새 인스턴스 생성할 때 마다 실행)
	 * 
	 * 3. 생성자 영역 (새 인스턴트 생성할 때 마다 실행)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		LifeCycleTest test = new LifeCycleTest();
		System.out.println(test.num);
		new LifeCycleTest();
		new LifeCycleTest();
		System.out.println(test.num);
		// 스태틱은 처음 한번만 실행

	}

}

class LifeCycleTest {

	// 스태틱 영역

	static int num = 10;
	static int[] numarr = { 1, 2, 3, 4, 5 };

	// 스태틱 블로ㅓㄱ
	static {
		for (int i = 0; i < 10; i++) {
			System.out.println("static block : " + i);
			num = 100;
		}
	}
	
	// 인스턴스 영역
	String text = "hello";
	
	// 인스턴스 영역
	{
		System.out.println("go to hell");
	}
	
	public LifeCycleTest() {
		System.out.println("생성자 실행되;ㅁ");
		num--;
	}
	// 코드 실행 순서 >> 스태틱 - 인스턴스 - 생성자 
	// num > 10 > 100 > 99



}
