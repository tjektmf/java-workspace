
public class B13_Operator4 {
	public static void main(String[] args) {

		/*
		 * 삼항연산자 간단한 if문을 한줄로 쉽게 사용할 수 있는 연산자
		 * 
		 * 비교 ? 예 : 아니오;
		 * 
		 * 비교의 결과가 true라면 왼쪽의 값을 사용 비교의
		 * 
		 * 결과가 false라면 오른쪽의 값을 사용
		 */

		int age = 25;
		int money = age > 30 ? -50000 : 50000;
		System.out.println("이번추석돈 : " + money);

		int apple = 33;
		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1;
		System.out.printf("사과가 %d개일때 바구니 %d개 필요\n", apple, basket);

		String greetings = age > 20 ? "안녕" : "안녛아세요";
		System.out.println(greetings);

	}
}
