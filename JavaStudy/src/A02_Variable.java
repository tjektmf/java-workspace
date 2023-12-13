
public class A02_Variable {
	public static void main(String[] args) {
		
		/* 변수 ( Variable)
		 * 
		 * 프로그래밍 언어에서 데이터를 저장해 둘 수 있는 공간
		 * 변수에 어떤 데이터를 보관할 것인지 타입을 지정해야 함
		 */
		
		int age = 30; // int : 정수를 저장함 위에서 말한 타입지정
		
		String name = "삼십"; // String : 문자열 저장

		String food = "피자"; // 변수의 선언 : 타입과 변수명을 적어 앞으로 해당 변수를 사용한다고 선언
		// 한 {} 안에서는 같은 이름의 변수는 하나만 가능하며 대소문자를 구별함
		String Food = "치킨";
		
		/* 대입연산 =
		왼쪽에 있는 변수에 오른쪽에 있는 값을 넣음
		=는 좌우가 같다는 뜻이 아님
		String food = "피자"; 푸드에 피자라는 값을 넣음
		String food > food 라는 변수를 선언함
		food = "피자" > food 라는 변수에 피자라는 값을 대입
			
		*/
		
		System.out.println(age - 10);
		System.out.println(name);
		System.out.println(food);
		System.out.println(Food); // 대소구별함 
		
		System.out.println(age + 10);
		System.out.println(age);
		
		int apple = 5; // 초기화되지 않은 변수는 사용할 수 없다, 즉 값을 한 번이라도 넣어야 사용가능
		// 선언한 변수에 값을 넣는 것을 초기화라고 함
		
		System.out.println("사과는 총 "+ apple +"개 입니다.");
		
		// 1 선언과 동시에 초기화
		int x = 10;
		// 2 선언만 함, 아직 초기화안함
		int y;
		// 3 한번에 여러개 선언, 아직 초기화 안함
		int a, b, c;
		// 4 변수를 여러개 선언하면서 동시에 초기화
		int d=10, e=20, f=30;
		String snack4 = "쿠쿠다스", snack5 = "초코하임", snack6 = "빅파이";
		
		System.out.println(snack4 +" "+ x+"개 " + snack5 + " "+snack6);
		
		
	}

}
