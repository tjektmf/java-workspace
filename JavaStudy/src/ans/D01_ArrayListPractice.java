package ans;

import java.util.ArrayList;

public class D01_ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			int count = (int) (Math.random() * 1001) + 1000;
			numbers.add(count);
			// 굳이 count 변수선언 안하고 numbers.add( (int) (Math.random() * 1001) + 1000 ); 해도됨
		}
		System.out.println(numbers);

		int evenSum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			if (num % 2 == 0) {
				evenSum += numbers.remove(i--); // 한번에 구함
			}
		}
		System.out.println("짝수가 제거된 배열");
		System.out.println(numbers);
		System.out.println("짝수의 합 : " + evenSum);

		int oddSum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);
			if (num % 2 == 1) {
				oddSum += numbers.remove(i--);
			}
		}
		System.out.println("홀수가 제거된 배열");
		System.out.println(numbers);
		System.out.println("ㅎㄹ수의 합 : " + oddSum);

	}
}
