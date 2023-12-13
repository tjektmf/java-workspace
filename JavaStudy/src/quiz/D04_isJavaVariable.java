package quiz;

public class D04_isJavaVariable {

	/*
	 * 문자열을 매개변수로 전달하면 해당 문자열이 자바변수로 사용할 수 있는 문자열인지 검사해주는 메서드
	 * 
	 */

	boolean javaCheck(String text) {

		if (Character.isJavaIdentifierStart(text.charAt(0))) {
			for (int i = 0; i < text.length(); i++) {
				if (!Character.isJavaIdentifierPart(text.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		D04_isJavaVariable a1 = new D04_isJavaVariable();
		System.out.println(a1.javaCheck("7dvxc235"));
		System.out.println(a1.javaCheck("s#"));
		System.out.println(a1.javaCheck("%#_{}325sdvxc235"));
		System.out.println(a1.javaCheck("AwrEG30LKVD"));

		// javaCheck("ddd"); 메서드에 static 쓰면 이거 바로가능

	}
}
