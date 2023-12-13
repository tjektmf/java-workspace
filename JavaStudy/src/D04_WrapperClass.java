
public class D04_WrapperClass {

	/*
	 * # Wrapper Class
	 * 
	 * 각 기본형 타입에 대응하는 참조형 타입으로 유용한 기능들이 추가되어 있음
	 * 
	 * # 기본형
	 * 
	 * boolean, byte, char, short, int, long, float, double
	 * 
	 * # 참조형
	 * 
	 * Boolean, Byte, Character, Short, Integer, Long, Float, Double // 걍 첫글자 대문자로
	 * 
	 * 
	 */

	public static void main(String[] args) {

		/*
		 * # Parsing
		 * 
		 * 문자열 데이터를 해당 타입 값으로 변환하는 것
		 * 
		 * 각 타입마다 parseXXX 메서드가 존재함
		 * 
		 * 
		 */

		String v1 = "1234";
		String v2 = "zz";
		String v3 = "af00";
		String v4 = "1011101001";

		int i1 = Integer.parseInt(v1);
		int i2 = Integer.parseInt(v3, 16); // 16진수
		int i3 = Integer.parseInt(v3, 17); // 17진수
		int i4 = Integer.parseInt(v4, 2);

		short s1 = Short.parseShort(v1);
		Boolean b1 = Boolean.parseBoolean(v1);
		// int i2 = Integer.parseInt(v2);
		System.out.println(i1);
		System.out.println(i2);
		System.out.printf("10진수 : %d, 16진수 %X\n", i2, i2); // 16진수는 X로 표현
		System.out.println(i3);
		System.out.println(i4);

		System.out.println();

		System.out.println(s1);
		System.out.println(b1);
		// System.out.println(i2);

		/*
		 * # toString
		 * 
		 * 각 WrapperClass의 toString()은 해당 타입 값을 문자열로 변환하는 기능을 가짐
		 * 
		 * 인스턴스 메서드의 toString()은 해당 인스턴스를 문자열로 변환함
		 * 
		 * 스태틱 메서드의 toString()은 전달하는 값을 문자열로 변환함
		 * 
		 */

		Integer num1 = 10;
		Integer num2 = 534616235;

		String numStr1 = num1.toString();
		String numStr2 = Integer.toString(1234);
		String numStr3 = Integer.toString(num2, 16);
		String numStr4 = Integer.toString(num2, 2);
		String numStr5 = Integer.toHexString(num2); // toString(n, 16)
		String numStr6 = Integer.toBinaryString(num2); // toString(n, 2)
		String numStr7 = Integer.toOctalString(num2); // toString(n, 8)

		String doubleStr = Double.toHexString(123.123123);

		System.out.println(numStr1);
		System.out.println("" + num1);
		System.out.println(numStr2);
		System.out.println(numStr3);
		System.out.println(numStr4);
		System.out.println(numStr5);
		System.out.println(numStr6);
		System.out.println(doubleStr);

		// 각 타입의 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		// 각 타입의 바이트를 저장해놓은 상수
		System.out.println(Short.BYTES);

		// 각 타입의 비트 크기 byte * 8
		System.out.println(Short.SIZE);

		// Character 타입으 ㅣ기능

		System.out.println("숫자임??? " + Character.isDigit('a'));
		Character.isAlphabetic('2');
		System.out.println("글자임??? a  " + Character.isAlphabetic('a'));
		System.out.println("글자임??? 1  " + Character.isAlphabetic('1'));
		System.out.println("글자임??? [  " + Character.isAlphabetic('['));
		System.out.println("대문자임? " + Character.isUpperCase('A'));
		System.out.println("소문자임? " + Character.isLowerCase('A'));
		System.out.println("공백임? " + Character.isWhitespace('\t'));
		System.out.println("공백임? " + Character.isWhitespace(' '));
		System.out.println("공백임? " + Character.isWhitespace('\n'));

		// 자바 변수 첫글자로 사용가능? 별게다있음
		System.out.println(Character.isJavaIdentifierStart('7'));
		System.out.println(Character.isJavaIdentifierStart('a'));
		System.out.println(Character.isJavaIdentifierStart('_'));

	}

}
