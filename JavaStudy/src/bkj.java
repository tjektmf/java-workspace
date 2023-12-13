
import java.util.Scanner;

public class bkj {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sameCount = 0;
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			arr[i] = num % 42;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					sameCount++;
				}
			}
		}
		System.out.println(10 - sameCount);

	}
}
