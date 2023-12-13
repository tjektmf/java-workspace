package ans;

public class B06_ForQuiz1 {
	
	public static void main(String[] args) {
		
		//1000부터 2000까지 반복하면서 8의 배수 출력
		
		int num;
		
		for ( num = 1000; num <= 2000; num++) {
			if (num % 8 == 0) { // 8의배수 출력하라는 자체가 if문쓰라는 의도임
				System.out.println(num);// 변수는 해당변수를 포함하는 {}가 끝나고 사라짐
			}
			
		}
		// for문 안에 if문 마음껏 넣어도 상관없음 << 
		

		int total = 0;
		
		for ( num = 100; num <= 300; ++num) {
			total += num; // total에 0넣고 num에 해당하는 값을 계속 때려박음
		}
		System.out.println(total); //이걸 for문 안에 넣으면 매번 total값이 출력됨
			//total을 for문 밖에서 선언해야 밖에서 출력가능
		
		int count = 0;
		
		for ( num = 1000; num <= 2000; ++num) {
			if ( num % 10 == 0) {
				System.out.print(num + " ");
				++count; // 숫자를 출력하는 횟수를 셈
	//			System.out.println(count + "번째 출력");
				if ( count % 5 == 0) { // 위에 ++count 대신 if문 안에 ++count 를 써도됨
					System.out.println(); // ++count % 5 == 0 이런식
				}
			}
			
		}
	}

}
