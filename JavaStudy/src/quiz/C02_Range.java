package quiz;

import java.util.Arrays;

public class C02_Range {

	public static int[] range(int a) {
		int[] ary = new int[a];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = i;
		}
		return ary;
	}

	public static int[] range(int a, int b) {
		int abs = Math.abs(a - b);
		int[] ary = new int[abs];

		for (int i = 0; i < abs; i++) {
			if (a >= b) {
				ary[i] = b;
				++b;
			} else if (a <= b) {
				ary[i] = b;
				--b;
			}
		}
		return ary;
	}

	public static int[] range(int a, int b, int c) {
		int abs2 = Math.abs(a - b);
		int[] ary2 = new int[abs2 / Math.abs(c)];
		int[] ary3 = new int[abs2 / Math.abs(c)];
		int[] ary4 = new int[0];

		for (int i = 0; i < abs2 / Math.abs(c); i++) {

//			int
//			int size = (int)(Math.ceil((end - start) / (double)increment);
//			if (size < 0) {
//				return null;
//			}
//			int[]arr new int[size];
//			for(int i = 0; i<size; i++) {
//				arr[i] = start + (increment *i);
//			}
//			return arr;

			if ((a < b) && (c > 0)) {
				ary2[i] = a + (c * i);
			} else if (a > b && c < 0) {
				ary3[i] = a + (c * i);
			} else {
				return ary4;
			}
		}
		if (a < b) {
			return ary2;
		} else if (a > b) {
			return ary3;
		} else {
			return ary4;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(5)));
		System.out.println(Arrays.toString(range(20, 10)));
		System.out.println(Arrays.toString(range(10, 20)));
		System.out.println(Arrays.toString(range(10, 20, 2)));
		System.out.println(Arrays.toString(range(10, 30, 2)));
		System.out.println(Arrays.toString(range(-10, 30, 2)));
		System.out.println(Arrays.toString(range(20, 10, -2)));
		System.out.println(Arrays.toString(range(20, 10, 5)));
		System.out.println(Arrays.toString(range(100, 200, 5)));
		// int[] result = rang(10,80,-1); // null을 리턴할 가능성이 있는 경우 미리 차단해주면 좋음
		// if(result!=null) { // 널이 아니어야 true
		// System.out.println(Arrays.toString(result));
		// } else{
		// System.out.println("null나옴");
		// }
	}

}
// 정수받으면 0붙 ㅓ해당값 미만의 int[]를 생성하여 반환
// ex range(8) > [0, 1,2,3,4,5,6,7]

// 정수 최솟값고 최댓값을 받으면 최솟값부터 최댓값 미만인 int[]을 생성하여 반환하는 range함수 
// ex range(10,15) > [10, 11,12,13,14]
// ex range(15,10) > [15,14,13,12,11]

// 최솟값 최댓값 증감값을 전달받으면 (3가지)
// 최솟값부터 최댓값미만까지 증감값만큼 증가하는 int[]생성하여 반환
// ex range(10,20,2) > [10, 12, 14, 16, 18];
// ex range(20, 10, 5) > [] ; 안나옴