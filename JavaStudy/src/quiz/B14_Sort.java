package quiz;

import java.util.Arrays;

public class B14_Sort {

	public static void main(String[] args) {

		/*
		 * -100 ~ 100 사이의 랜덤 정수 값이 20개 들어있는 배열을 하나 생성
		 * 
		 * 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성해 출력
		 * 
		 * 내림차순도
		 * 
		 */

		int[] ran = new int[20];
		int[] ran2 = new int[20];
		int len = ran.length;
		int i = 0;

		for (i = 0; i < len; i++) {
			ran[i] = (int) ((Math.random() * 201) - 100);

			for (int j = 0; j < len; j++) {
				int ranx = 0;
				ranx = ran[0];
				if (ran[i] > ran[j]) {
					ranx = ran[i];
					ran[i] = ran[j];
					ran[j] = ranx;
				}
			}
		}
		System.out.println(Arrays.toString(ran));

		for (i = 0; i < len; i++) {
			ran[i] = (int) ((Math.random() * 201) - 100);

			for (int j = 0; j < len; j++) {
				int ranx = 0;
				ranx = ran[0];
				if (ran[i] < ran[j]) {
					ranx = ran[i];
					ran[i] = ran[j];
					ran[j] = ranx;
				}
			}
		}
		System.out.println(Arrays.toString(ran));
	}
}
