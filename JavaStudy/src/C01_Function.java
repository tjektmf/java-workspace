
public class C01_Function {

	public static void plus(int a, int b) {
		System.out.println(a + b);

	}
	public static String getBasketMessage(int appleCount) {
		if(appleCount%10==0) {
			return "사과가 나누어 떨어짐";
		} else {
			return "사과가 나누어 떨어지지 않음";
		}
	}

	public static int getBasket(int appleCount) {
		if (appleCount % 10 == 0) {
			return appleCount / 10;
		} else {
			return appleCount / 10 + 1;
		}
	}

	public static void plusAll(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("총합은 " + sum + " 입니다.");
	}

	public static void minus(int... num) { // ...으로 선언한 매개변수는 배열이됨
		for (int i = 0; i < num.length; i++) {
			System.out.println("빼야하는수 : " + num[i]);
		}

	}

	public static void rabbit() {

		System.out.println(" /)/)");
		System.out.println("(ㅇㅠㅇ)");
		System.out.println("( > >)");

	}
	
	public static void howManyBasket(int apple, int size) {
		if(apple%size == 0) {
			System.out.println("필요한 바구니 개수 = " + apple/size);
		} else {
			System.out.println("필요한 바구니 개수 = " + apple/size +1);
		}
	}
	
	/** 사과의 개수와 바구니의 크기를 입력하면 바구니의 개수를 콘솔에 출력해주는 함수임
	 * @param apple - 사과의 개수
	 * @param size - 바구니의 크기를 입력
	 */
	
	/**
	 *
	 * @param args
	 * 함수바다 파란주석 달수있음 별2개
	 */

	public static void main(String[] args) {

		/*
		 * 
		 * ** 함수
		 * 
		 * 기능을 미리 정의해두고 나중에 사용 함수는
		 * 
		 * 처음 정의한 시점에서는 실행되지않고 나중에 불러와서 써야함
		 * 
		 * 나중에 재사용할 가능성이 있는 코드를 함수로 만들어두면 작업의 반복을 줄일 수 있다(생산성증가)
		 * 
		 * 클래스 내부에 있는 함수는 메서드라고 부름, 어차피 자바에서는 클래스밖에서 함수 못만듬
		 * 
		 * 그래서 자바는 함수가 없다고 말하기도함 전부 메서드에 해당함
		 * 
		 * ** 함수의 매개변수(argument) 메인스트링뒤에 args
		 * 
		 * 함수를 호출할 때 해당 함수에 전달할 수 있도록 선언해놓는 변수
		 * 
		 * 함수를 호출할 때 ()에 전달하는 값을 인자라고 함
		 * 
		 * 함수를 정의할 떄 ()에 선언하는 인자를 받을 수 있는 변수를 매개변수라고 함
		 * 
		 * 매개변수의 개수에는 제한이 없으며 타입에 ... 을 쓰면 해당타입 인자를 무한으로 받음
		 * 
		 * ** 합수의 타입 (리턴타입)
		 * 
		 * 해당 함수의 실행 결과 얻게 되는 값의 타입을 지정할 수 있음
		 * 
		 * void : 이 함수는 실행 결과로 아무것도 얻을 수 없음(리턴값 없음)
		 * 
		 * 그 외 타입 : 함수를 실행하면 해당 타입 값을 반드시 돌려줌
		 * 
		 * return : 해당 함수를 즉시 종료하고 함수를 호출한 곳으로 값을 보냄
		 * 
		 */
		
		
		for (int i = 0; i < 20; i++) {
			rabbit();
			plus(30, 33);
			plus(5, -20);
			minus(1, 2, 3, 4, 5, 6);
			plusAll(10, 20, 30, 50, 60);
			getBasket(15);
			getBasketMessage(25);
			
			int basket = getBasket(15);
			System.out.println(basket); // println은 return타입이 void라 변수저장불가
			String basket2 = getBasketMessage(25);
			System.out.println(basket2);
			System.out.println(getBasketMessage(400));
		}
	}
}
