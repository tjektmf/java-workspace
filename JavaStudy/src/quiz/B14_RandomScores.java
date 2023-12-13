package quiz;

import java.util.Random;

public class B14_RandomScores {

	public static void main(String[] args) {

		Random ran = new Random();

		double sum = 0;
		double avg = 0;
		int numMax = 0;
		int numMin = 20000;
		int maxLine = 0;
		int minLine = 0;
		String maxLine2 = "";
		String minLine2 = "";
		int makeNum = 300;

		int[] score = new int[makeNum+1];
		for (int i = 1; i <= makeNum; i++) {
			score[i] = ran.nextInt(100);
			System.out.print(score[i] + " ");
			sum += score[i];
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		for (int i = 1; i <= makeNum; i++) {

			if (score[i] >= numMax) {
				numMax = score[i];
				maxLine = i;
			}
		}
		for (int i = 1; i <= makeNum; i++) {

			if (score[i] <= numMin) {
				numMin = score[i];
				minLine = i;
			}
		}
		for (int j = 1; j <= makeNum; j++) {
			if (score[j] >= numMax) {
				maxLine2 += j + " ";
			}
		}
		for (int j = 1; j <= makeNum; j++) {
			if (score[j] <= numMin) {
				minLine2 += j + " ";
			}
		}
		System.out.println("평균은 " + Math.round((sum/makeNum)*100)/100.0);
		System.out.println(score[5]);
		System.out.println("제일 높은 점수는 " + numMax + "//" + maxLine + "번째");
		System.out.println("제일 낮은 점수는 " + numMin + "//" + minLine + "번째");
		System.out.println("최고 중복 " + maxLine2 + "\n최소 중복 " + minLine2);
	}
}
