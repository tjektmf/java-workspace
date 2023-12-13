import java.util.Arrays;

public class B15_Array2 {

	public static void main(String[] args) {

		/*
		 * 배열안의 요소로 배열을 넣을 수 있다
		 * 
		 * 
		 * 
		 * 
		 */
		int[] arr1 = new int[5];
		int[] arr2 = new int[] { 40, 50, 60, 70, 80 };
		int[] arr3 = { 1, 3, 5, 7, 9 };

		int[][] arr4 = { arr1, arr2, arr3, { 9, 9, 9, 9 }, new int[] { 44, 55, 66, 77, 88 } };
		int[][][] arr5 = { arr4, arr4 };

		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[1][3]);
		System.out.println(arr4[2][1]);
		System.out.println(arr4[0][1]);
		System.out.println(arr4[4][1]);

		System.out.println(Arrays.toString(arr4));

		// 배열의 신기한점
		char[] name1 = new char[] { '김', '철', '수' };
		char[] name2 = name1;
		char[] name3 = name1;

		name3[1] = '영';
		name3[2] = '희';
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		// n차원 배열은 n중 반복문으로 모두 탐색가능

		char[][] fruits = new char[][] { { 'a', 'p', 'p', 'l', 'e' }, { 'b', 'a', 'n', 'a', 'n', 'a' },
				{ 'o', 'r', 'a', 'n', 'g', 'e' }, { 'g', 'r', 'a', 'p', 'e' } };
		for (int i = 0; i < fruits.length; i++) { // fruits.length : 배열이 몇개인가, 여기선 4개 0 1 2 3
			for (int j = 0; j < fruits[i].length; j++) {  // fruits[i].length : 해당번째 배열의 길이, 행렬이랑 비슷
				System.out.printf("fruits[%d][%d] : %c\n",i,j, fruits[i][j]);
			}
		}
	}
}
