package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz3 {

	public static int[] randomNum() {

		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					--i;
					break;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		randomNum();
		System.out.println(Arrays.toString(randomNum()));
	}

}
