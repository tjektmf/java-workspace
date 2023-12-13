package ans;

public class B14_RandomScores {

	public static void main(String[] args) {

		int[] score = new int[300];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 201);
		}

		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.print(score[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		System.out.println("================");
		System.out.println("총합: " + sum);
		System.out.printf("평균: %.2f\n", sum / (double) score.length); // printf가 소숫점관리 편함

		int bestScore = score[0];
		int worstScore = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > bestScore) {
				bestScore = score[i];
			}

			if (score[i] < worstScore) {
				worstScore = score[i];
			}

		}
		System.out.println("최고점수 : " + bestScore);
		for (int i = 0; i < score.length; i++) {
			if (score[i] == bestScore) {
				int scores = score[i];
				System.out.printf("%d번째 참가자 [%d점]\n", i, scores);
			}
		}
		System.out.println("최저점수 : " + worstScore);
		for (int i = 0; i < score.length; i++) {
			if (score[i] == worstScore) {
				int scores = score[i];
				System.out.printf("%d번째 참가자 [%d점]\n", i, scores);
			}
		}
		// 최고 및 최저점수 사람들 모두 출력

	}

}
