package quiz;

public class B09_Gogodan {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "단: ");

			for (int gop = 1; gop <= 9; gop++) {

				System.out.printf(" %dx%d=%-2d ", dan, gop, dan * gop); 
			}							// printf에서 %d는 정수 %d는 정수 %c는 문자 %f는 실수
			System.out.println();		// printf문법에서 %2d > 정수에 자리수2개 / %-2d 뒤로 자리출력 
		}

		System.out.println();

		for (int dan2 = 2; dan2 <= 9; dan2++) {
			System.out.printf("%d단\t", dan2);
			if (dan2 == 9) {
				System.out.println();
			}
		}

		for (int gop2 = 1; gop2 <= 9; gop2++) {
			for (int dan3 = 2; dan3 <= 9; dan3++) {

				System.out.printf("%dx%d=%d\t", dan3, gop2, dan3 * gop2);
				if (dan3 == 9) {
					System.out.println();
				}
			}
		}
	}
}
