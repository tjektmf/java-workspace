package quiz;

public class B06_ForQuiz3 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i += 3) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		for (int i = 1; i <= 10; i++) {
			int a = 100;
			System.out.print(a * i + " ");
		}

		System.out.println("\n");

		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

//		for (int i = 0; i <= 30; i++) {
//			if (i < 10) {
//				System.out.print(i + " ");
//			} else if (i < 20) {
//				System.out.print(i - 10 + " ");
//			} else if (i < 30) {
//				System.out.print(i - 20 + " ");
//			}
//		}

		for (int i = 0; i < 300; i++) {
			System.out.print(i % 10 + " ");
		}

		System.out.println("\n");

//		for (int i = 30; i > 0; i--) {
//			if (i > 20) {
//				System.out.print(i - 20 + " ");
//			} else if (i > 10) {
//				System.out.print(i - 10 + " ");
//			} else if (i > 0) {
//				System.out.print(i + " ");
//			}
//		}

		for (int i = 0; i < 300; i++) {
			System.out.print(10 - (i % 10) + " ");
		}

		System.out.println("\n");

		for (int i = 1, a = 0; i < 1000000000; i *= 10) {
			a += i;
			System.out.print(7 * a + " ");
		}
		
		System.out.println("\n");
		
		for ( double i = 0, a = 0, b = 0 ; i < 10 ; i++) {
			a = Math.pow(10, i);
			b += a;
			System.out.print((int)(7 * b) + " " );
			
		}
	}

}
