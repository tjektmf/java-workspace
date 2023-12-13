package quiz;

public class B10_Gugudan2 {

	public static void main(String[] args) {

		int dan = 2;
		int gop = 1;
		while (dan < 10) {
			System.out.printf("%d단 : ", dan);
			gop = 1; // 	int gop = 1; 이걸 while문 안에 넣었으면 굳이 안써도 되는 코드
			while (gop <= 9) {
				System.out.printf("%dx%d=%d ", dan, gop, dan * gop);
				gop++;
			}
			System.out.println();

			dan++;
		}

		System.out.println("=====================================");
		int dan2 = 2; // 변수 선언값이 while문 안에 있어야 계속 이값으로 초기화해줌
		int gop2 = 0; 
		while (gop2 < 10) {
			dan2 = 2; // 변수선언을 while 밖에서하면 이렇게 추가로 넣어줘야함
			while (dan2 < 10) {
				if (gop2 == 0) {
					System.out.printf("%d단 \t", dan2);
					dan2++; // 증감값 if에 넣었으면 else에도 넣어야지
				} else {
					System.out.printf("%dx%d=%d\t", dan2, gop2, dan2 * gop2);
					dan2++; // 각 while문 하나에 증감값 하나는 있어야함
				}
			}
			System.out.println();
			gop2++;
		}

	}

}
