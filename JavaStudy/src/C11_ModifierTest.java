
public class C11_ModifierTest {

	// static 변수의 접근 제어자
	public static int si1 = 10;
	protected static int si2 = 20;
	static int si3 = 30;
	private static int si4 = 40;

	//
	public int i1 = 100;
	protected int i2 = 200;
	int i3 = 300;
	private int i4 = 400;

	// static 메서드
	public static void smethod1() {
		System.out.println("124");
	}

	protected static void smethod2() {
		System.out.println("124");
	}

	static void smethod3() {
		System.out.println("124");
	}

	private static void smethod4() {
		System.out.println("124");
	}
	
	//
	public void method1() {
		System.out.println("12421");
	}

	protected void method2() {
		System.out.println("12421");
	}

	void method3() {
		System.out.println("12421");
	}

	private void method4() {
		System.out.println("12421");
	}
	
	
}
