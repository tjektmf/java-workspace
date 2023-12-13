
public class Hello {

	public static void main(String[] args) {

//		int i = 10;
		char car = 'A';
		double dou = 5.7;
		String st = "A";

		// byte var = (byte) i;
//	char var = (char) st;
//	int var = (int)dou;
//
		// char var = (char)st;
		// Cannot cast from String to char 이 오류가 나옴
		// 스트링타입은 차르타입으로 캐스트 불가함

//		System.out.println(var);

		char c1 = 'a';
//		char c2 = c1 + 1;
		int c3 = c1 + 1;
		char c2 = (char) c3;
//		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c2);

		char c5 = 'a';
//		char c6 = c5 + 1;
		// System.out.println(c6);

		int x = 5;
		int y = 2;
		String z = "2";
		// int zz = (int) z;

		System.out.println(x + z);

//		double result = ((double)x)/y; // int는 2 double float은 2.0
		// System.out.println(result);

//		double var1 = 3.5;
		// double var2 = 2.7;

//		int result = (int)var1 + (int)var2;
		// System.out.println(result);

		long var1 = 2L;
		float var2 = 1.8f; // f 써야함 float 불편
		double var3 = 2.5;
		String var4 = "3.9";

		double var5 = Double.parseDouble(var4);
		// int result = var1 + (double)var2+ (var3+ var5);
		int asdf = (int) (var3 + var5);
		System.out.println(asdf);
		System.out.println(var3 + var5);
		int asas = (int) (((int) var1) + (int) var2 + (var3 + var5));
		System.out.println(asas);
		int asasas = (int) (((int) var1) + (int) var2 + (var3 + Double.parseDouble(var4)));
		System.out.println(asasas);

		System.out.println("--------------");

		String str1 = 2 + 3 + ""; // 걍 숫자도 더해서 나오긴함
		System.out.println(str1);
		String str2 = 2 + "" + 3;
		System.out.println(str2);
		String str3 = "" + 2 + 3; // ""의 문자열과 2가 먼저 더해져서 2가 문자열화됨
		System.out.println(str3); // 이후 문자열+3이므로 3도 문자열화되어 그냥 뒤에 붙여서 23

		byte value = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");

		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

		String asas3 = "1"; // 한글이나 영어는 문자열에서 기본타입으로 못바꾸는듯?
		double asas2 = Double.parseDouble(asas3);
		System.out.println(asas2);
		char ch = 'a' + 32;
		System.out.println(ch);

		for (int i = 1; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}
}
