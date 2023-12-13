
public class B09_InnerLoop {
	
	public static void main(String[] args) {
		
		//	반복문 내부에 반복문 사용하기
		
		for(int i = 0; i < 10; i++) {
			System.out.println("=============바깥 반복문  " + i);
			
			for (int j = 0; j < 5; j++) { // j++ 써야함 
				System.out.printf("-----안쪽 반복문 %d-%d\n " , i, j);
				for (int k = 0; k < 3; k++) {
					System.out.printf("+++ 제일 안쪽 반복문 %d-%d-%d\n", i, j, k);
				}
			}
			
		}
		
		
	/*
	 * 		다중 반복문으로 구구단 출력
	 * 		- 2단부터 9단까지 있음
	 * 		- 각 단마다 *1 ~ *9 까지 실행
	 * 		- 반복문 2개가 필요함 
	 */
		
		for ( int dan = 2; dan <= 9 ; dan++) {
			System.out.printf("=== %d단 ===\n", dan);
			for (int gop = 1; gop <=9; gop++) {
				System.out.printf("%d * %d = %d\n", dan, gop, dan*gop);
			}
			
		}
		
		
		
		
	}

}
