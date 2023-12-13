
import java.util.Arrays;
import java.util.Scanner;

public class baek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ㄱㄱㄱ: ");

		String text = sc.next();
		int len = text.length();
		int[] ranIndex = new int[len];
		for (int i = 0; i < len; i++) {
			ranIndex[i] = (int) (Math.random() * len);
			boolean ranCheck = true;
			for (int j = 0; j < i; j++) {
				if (ranIndex[j] == ranIndex[i]) {
					ranCheck = false;
					break;
				}
			}
			if (!ranCheck) {
				--i;
			}
		}
		for( int k = 0; k<len;k++) {
			System.out.print(text.charAt(ranIndex[k]));
		}
		System.out.println(Arrays.toString(ranIndex));

	}
}