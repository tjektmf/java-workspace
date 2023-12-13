package ans;

public class B06_ForQuiz02_2 {

	public static void main(String[] args) {

		int lastNum = -103;
		boolean isMinus = lastNum < 0;

		lastNum = Math.abs(lastNum);

		int cnt = 0;
		for (int i = 0 ; i <= lastNum; ++i) {
			if (i % 5 == 0) {
				if (isMinus) {
					System.out.printf("-%d", i);
				} else {
					System.out.print(i + " ");
				}
				
				if (++cnt % 10 == 0) {
					System.out.println();
					
				}
			}

		}

	}
}
