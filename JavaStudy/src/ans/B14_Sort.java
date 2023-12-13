package ans;

import java.util.Arrays;

public class B14_Sort {

	public static void main(String[] args) {

		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 201 - 100);
		}
		System.out.print(Arrays.toString(arr));
		System.out.println("\n===========================");

		int step = 0;
		while (step < arr.length) { // 0대신 step을 쓰는건 굳이 0부터 비교할 필요가 없기 때문
			// 가장 큰걸 맨 앞에 놓음
			int biggestIndex = step;
			for (int i = step + 1; i < arr.length; i++) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;
				}
			}
			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			// System.out.println(Arrays.toString(arr));
			++step;

		}
		System.out.println("===========================");
		System.out.println(Arrays.toString(arr));
		System.out.println("===========================");
		System.out.println("===========================");

		//

		int[] arrs = new int[20];
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = (int) (Math.random() * 201 - 100);
		}
		System.out.println(Arrays.toString(arrs));

		step = arrs.length - 1;
		while (step >= 0) { // 스탭이 더 뒤임

			int biggestIndex = step;
			for (int i = step-1; i >= 0; i--) {
				if (arrs[biggestIndex] < arrs[i]) {
					biggestIndex = i;
				}
			}
			int temp = arrs[step];
			arrs[step] = arrs[biggestIndex];
			arrs[biggestIndex] = temp;
			--step;

		}
		System.out.println("===========================");
		System.out.println(Arrays.toString(arrs));

		int[] arrr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arrr[i] = (int) (Math.random() * 201 - 100);
		}
	//	System.out.print(Arrays.toString(arr));
	//	System.out.println("\n===========================");

		step = 0;
		while (step < arr.length) { // 0대신 step을 쓰는건 굳이 0부터 비교할 필요가 없기 때문
			// 가장 큰걸 맨 앞에 놓음
			int biggestIndex = step;
			for (int i = 0; i < arrr.length-step; i++) {
				if (arrr[biggestIndex] < arrr[i]) {
					biggestIndex = i;
				}
			}
			int temp = arrr[arrr.length - 1 - step];
			arrr[arrr.length - 1 - step] = arrr[biggestIndex];
			arrr[biggestIndex] = temp;
			++step;
		}
	//	System.out.println(Arrays.toString(arrr));
	}
}
