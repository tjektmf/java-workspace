package ans;

public class B14_num {

	public static void main(String[] args) {

		int[] winNums = new int[7];

		int i = 0;
		int len = winNums.length;

		while (i < len) {
			winNums[i] = (int) (Math.random() * 45 + 1);

			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
				}
				j++;
			}
			if (!duplicate) {
				++i;
			}

		}
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums[%d] : %d\n", i, winNums[i]);
		}
	}
}
