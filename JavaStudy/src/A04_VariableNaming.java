
public class A04_VariableNaming {
	
	/*	변수를 왜 사용?
	 * 	1. 코드의 가독성을 높임
	 *  2. 여러곳에서 사용되는 값을 한번에 변경가능, 하나의 값을 여러곳에 사용 가능
	 * 
	 * 	>>>변수 작명 규칙 (권장, 굳이 안지켜도 됨, 에러 미발생)
	 * 	1. 변수가 두 단어 이상인 경우 _를 사용함 (sun_chip) snake_case
	 * 	2. 두 단어 이상인 경우 두번째 단어 첫글자는 대문자를 사용함 (sunChip) camelCase
	 * 	3. 변수의 첫 글자는 소문자를 사용해야함 Sun(x) sun(o)
	 * 	4. 클래스의 첫 글자는 대문자를 사용하기 때문에 3과 연계해서 오해의 소지가 있음
	 * 		PersonInfo(o) personInfo(x)
	 * 	5. 패키지명은 모두 소문자를 사용
	 * 		quiz(o) Quiz(x)
	 * 	6. 프로그램에서 항상 변하지 않고 동일한 값은 모두 대문자를 사용, constant
	 * 		MAX_SCORE
	 * 	7. 변수값을 쉽게 파악할 수 있는 단어 사용
	 * 		a, b, c 말고 구체적인 의미를 가진 단어를 사용
	 * 
	 * 	>>>변수 작명 규칙 (필수, 안 지키면 에러 발생)
	 * 	1. 첫 번째 글자에 숫자 사용 불가
	 * 		1st(x)
	 * 	2. 공백 사용 불가
	 * 	3. 특수문자는 _와 $만 사용 가능
	 * 		$uper(o) __super(o) 둘 다 가능함
	 * 	4. 자바에서 이미 사용하고 있는 단어는 사용 불가(예약어)
	 * 		public static void int long double 등 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int apple1 = 837;
		int apple2 = 55;
		double apple3 = 222.5; // f써야하는 float 말고 편한 double 쓰자
		
		System.out.println("사과 얼?마? " + apple1 + "원" );
		System.out.println("사과 몇?개? " + apple2 + "개" );
		System.out.println("다 합치면 얼?마? " + (apple1 * apple2) + "원" );
		System.out.println("총 무게는? " + (apple2 * apple3) + "g");
		System.out.println("1g당 가격은? " + (apple1 / apple3) + "원");
		
		//int if;
		//int IF;
		
		//int new;
		
		
		
	}

}
