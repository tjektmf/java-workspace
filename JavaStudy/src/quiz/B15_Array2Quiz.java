package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {

	public static void main(String[] args) {

		int[][] ayArr = { { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

		int len = ayArr.length;

		for (int i = 0; i < ayArr.length; i++) {
			for (int j = 0; j < ayArr[i].length; j++) {
				ayArr[i][j] = (int) (Math.random() * 500 + 1);
			}

		}

		for (int i = 0; i < ayArr.length; i++) {
			for (int j = 0; j < ayArr[i].length; j++) {
				System.out.println(ayArr[i][j]);
			}
		}

		int sum = 0;
		int sumCount = 0;
		for (int i = 0; i < ayArr.length; i++) {
			for (int j = 0; j < ayArr[i].length; j++) {
				sum += ayArr[i][j];
				++sumCount;

			}
		}
		System.out.println("합 " + sum);
		System.out.println("평균 " + sum / (double) sumCount);

		int sumRow = 0;
		int sumColumn = 0;
		for (int i = 0; i < ayArr.length; i++) {
			for (int j = 0; j < ayArr[i].length; j++) {
				sumRow += ayArr[i][j];
			}
			System.out.println(i + "행의 합 " + sumRow);
			sumRow = 0;
		}

		int maxColSize = 0;

		for (int i = 0; i < ayArr.length; i++) {
			int colSize = ayArr[i].length;
			maxColSize = maxColSize < ayArr[i].length ? ayArr[i].length : maxColSize;
		}
		int[] colSum = new int[maxColSize];
		for (int row = 0; row < ayArr.length; ++row) {
			for (int col = 0; col < ayArr[row].length; ++col) {
				colSum[col] += ayArr[row][col];
				// 행을 기준으로 1행부터 쭉 1열부터 끝까지 박아버리고
				// 그다음 2행부터 또 1열부터 더해버리는 형식으로 계산
				// 열을 기준으로 하면 매우 힘듬
			}
		}
		System.out.println("열의 합: " + Arrays.toString(colSum));

		// 맥콜사이즈가 어레이랭스보다 작으면 어레이렝스 크면 맥콜사이즈

	}

//		int[] colSum = new int[8];
//
//		int k = 0;
//		while (k < ayArr.length) {
//			for (int i = 0; i < ayArr[k].length; i++) {
//
//				for (int j = 0; j < ayArr.length; j++) {
//
//					if (i >= ayArr[j].length) {
//						++k;
//						break;
//					}
//					if (i < ayArr[j].length) {
//						sumColumn += ayArr[j][i];
//						++k;
//					}
//				}
//				System.out.println(i + "열의 합 " + sumColumn);
//			}
//			sumColumn = 0;
//		}
}
