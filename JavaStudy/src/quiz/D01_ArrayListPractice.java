package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {

	/*
	 * 1. 리스트에 1000~2000 사이의 랜덤정수 100개 추가
	 * 
	 * 2. 원본에서 짝수 제거 후 총합
	 * 
	 * 3. 원본에서 홀수 제거 후 총합
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		ArrayList<Integer> numbers3 = new ArrayList<>();

		System.out.println("========================");

		for (int i = 0; i < 100; i++) {
			int count = (int) (Math.random() * 1001) + 1000;
			numbers.add(count);
		}
		System.out.println(numbers);

		int size = 0;
		while (size < numbers.size()) {
			if (numbers.get(size) % 2 == 0) {
				numbers.remove(size);
			} else {
				size++;
			}
		}

		System.out.println(numbers);
		int sum1 =0;
		for(int i =0; i<numbers.size(); i++) {
			sum1 += numbers.get(i);
		}
		System.out.println("짝수 날린 홀수 합 : " + sum1);

		size = 0;
		while (size < numbers.size()) {
			if (numbers.get(size) % 2 != 0) {
				numbers.remove(size);
			} else {
				size++;
			}
		}

		System.out.println(numbers);
		System.out.println("짝수 홀수 전부 날린 합 : 0" );

	}
}