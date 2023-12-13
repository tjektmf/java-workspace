
public class E03_CustomException {

	/*
	 * $ Exception
	 * 
	 * - 반드시 처리해야 하는 예외로 처리하지 않으면 컴파일 불가
	 * 
	 * # RuntimeException
	 * 
	 * - 굳이 처리 안해도 ㄱㅊ
	 * 
	 */
	
	public static void method1() throws NotMustHandledException{
		throw new NotMustHandledException();
	}
	
	public static void method2() throws MustHandledException{
		throw new MustHandledException();
	}

	public static void main(String[] args) {
		method1();
		// method2();
		

	}

}

// Exception 또는 RuntimeException 을 상속받은 클래스는 throw가 가능
class MustHandledException extends Exception {
	public MustHandledException() {
		super("내가 만든 예외 메세지");
	}
}

class NotMustHandledException extends RuntimeException {
	public NotMustHandledException() {
		super("반드시 처리하지는 않아도 되는 메세지");
	}
}