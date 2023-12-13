
public class B02_Operator02 {
	
	public static void main(String[] args) {
		
		/*
		 * 	비교 연산자
		 * 	
		 * 	두 값을 비교하는 연산
		 * 	비교 연산의 결과는 항상 true or false이므로 boolean타입
		 * 
		 * 	논리 연산자
		 * 	
		 * 	두 boolean 값으로 연산하는 연산자
		 * 	&& : 양 옆의 두 값이 모두 true일 때만 true (AND 연산)
		 *  || : 양 옆의 두 값 중 하나만 true여도 true (OR 연산)
		 *  !: true면 false, false면 true (NOT 연산)
		 * 
		 */
		
		int a = 10, b = 10;
		
		System.out.println(a>b); // true가 출력됨
		System.out.println(a<b); // false가 출력됨
		System.out.println(a>=b); // true가 출력됨 >= =가 뒤에옴
		System.out.println(a<=b); // false가 출력됨 <= =가 뒤에옴
		System.out.println(a==b); // false가 출력됨 두 값이 같음
		System.out.println(a!=b); // true가 출력됨 두 값이 다름
		
		//비교연산은 우선순위가 낮음
		
		System.out.println(a + 5 > b * 10);
		System.out.println(2+10*0*5);
		// 산술연산 먼저 하고 비교연산 수행함 
		System.out.println(a % 2 ==0);
		// 2로 나눴을 때 나머지가 0이면 true, 즉 짝수면 true 
		System.out.println(a % 5 !=0);
		// 5의 배수가 아니면 true, 5의 배수면 false
		
		System.out.println("#### and ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(a % 3 == 0 && a < 100);
		// a가 3의 배수면서 100보다 작아야함 둘다 만족해야함
		// 논리연산자는 비교연산자보다 우선순위 낮음 ()없어도 비교연산을 먼저 수행
		// 산술연산 >> 비교연산 >> 논리연산
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(a % 3 == 0 || a < 10); // 둘중 하나만 만족하면 true
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(a > 3)); // 위에서 a는 10이라고 했으니 ()안이 true가 되면서 false값이 나옴
		
		
	}

}
