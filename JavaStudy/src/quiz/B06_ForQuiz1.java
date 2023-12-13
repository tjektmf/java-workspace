package quiz;

public class B06_ForQuiz1 {

	public static void main(String[] args) {

		int a, b, c, d, e = 0;
		int aa = 0;
		int i = 0;

		for (i = 1000; i <= 2000; i += 8) {
			System.out.println(i);
		}

		for (i = 100; i <= 300; i++) {

			aa += i;
		}
		System.out.println(aa);
		for (i = 990; i <= 2000;) {

			a = i += 10;
			b = i += 10;
			c = i += 10;
			d = i += 10;
			e = i += 10;
			System.out.printf("%d %d %d %d %d\n", a, b, c, d, e);
		}
		System.out.println(i);

		int o = 0;
		for (i = 1; i <= 10; i++) {
			o += i; // o에 i값을 계속 누적으로 더해줌 
		}
		System.out.println(o);
		int bb = 0;
		// 10의 배수를 한줄에 5개씩 출력
		for ( i = 1000; i <= 2000; i++) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
				if (++bb % 5 == 0) {
					System.out.println();
					
				}
			}
		}
	}

}