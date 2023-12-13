package quiz;

public class B08_ContinueQuiz {

	public static void main(String[] args) {

		int ex1Sum = 0;
		int ex2Sum = 0;

		for (int i = 600; i <= 800; i++) {

			if (i % 7 != 0) {
				continue; // 이프문 아래를 더 수행하지않고 그냥 다재끼고 위로올려버림
			}
			System.out.print(i + " ");
			ex1Sum += i;
		}
		
		System.out.println();
		
		for (int i = 0; i <= 200; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
			ex2Sum += i;
		}
		
		System.out.println();
		
		System.out.println(ex1Sum + ex2Sum);

	}

}
