
public class B01_Operator01 {
	
	public static void main(String[] args) {
		
		/*
		 * 	Operator 연산자
		 * 
		 * 	계산할 때 값 사이에 넣어서 쓰는 것
		 * 	+ - * > < % / 등 다양함
		 * 
		 * 	산술 연산자
		 * 
		 * 	+ : 더하기
		 * 	- : 빼기
		 * 	* : 곱하기
		 * 	/ : 나누기
		 * 	% : 나머지 <<
		 * 
		 * 	나누기는 정수끼리 나누면 몫만 구하고, 계산에 실수가 포함되어 있으면 정확한 결과를 구함
		 * 	정수끼리의 산술 연산 결과는 정수고, 정수와 실수의 산술 연산 결과는 실수임
		 * 
		 * 
		 */
		
		int a = 10, b = 7;
		
		System.out.println("a + b = "+ a + b); // 107 계산순서
		System.out.println("a + b = "+ (a + b)); // 17
		System.out.println("a - b = "+ (a - b)); 
		System.out.println("a * b = "+ (a * b));
		System.out.println("a / b = "+ (a / b));
		System.out.println("a % b = "+ (a % b));
		
		// n으로 나눈 나머지 연산의 결과는 0 ~ n-1이다
		System.out.println(10%5); // 0
		System.out.println(11%5); // 1
		System.out.println(12%5); // 2
		System.out.println(13%5); // 3
		System.out.println(14%5); // 4
		System.out.println(15%5); // 0


		double c = 7; // a = 10임
		//char 타입은 문자로 보여주는 것 처럼
		//double/float 타입은 .0을 붙여 보여줌
		
		System.out.println("a + c = "+ a + c); // 107
		System.out.println("a + c = "+ (a + c)); // 17
		System.out.println("a - c = "+ (a - c)); 
		System.out.println("a * c = "+ (a * c));
		System.out.println("a / c = "+ (a / c));
		System.out.println("a % c = "+ (a % c));
		
		
		// Math.pow(a, b); a^b의 결과를 '반환'한다
		double result = Math.pow(2, 0.5); // result 에 2^10 의 값을 넣어줌
		double resultt = Math.pow(2, (1/2)); // result 에 2^10 의 값을 넣어줌
		// 제곱은 포우임 왜 포우임???
		System.out.println(result + "    ???");
		System.out.println(resultt + "    ???");
		// Math.sqrt(a) : a의 제곱근을 반환한다
		double result2 = Math.sqrt(25);
		double i = Math.sqrt(-1);
		System.out.println(result2);
		System.out.println(i);
		
		// Math.abs(a) : a의 절댓값을 반환
		int abs = Math.abs(-7);
		System.out.println(abs);
		float abs2 = Math.abs(-1.13f);
		System.out.println(abs2);
		double abs3 = Math.abs(i);
		System.out.println(abs3);
		
		// Math.round(a) : a를 소수 첫째자리에서 반올림한 결과를 반환
		System.out.println(Math.round(1.5125));
		System.out.println(Math.round(i));
	
		// Math.ceil(a) : a를 소수 첫째자리에서 '올림'한 결과를 반환
		System.out.println(Math.ceil(12.1212));
		// Math.floor(a) : a를 소수 첫째자리에서 '버림'한 결과를 반환
		System.out.println(Math.floor(12.1212));
		//round 둥글게 반올림, ceil 천장으로 올림 floor 바닥으로 내림
		/*
		 *	원하는 자리에서 반올림
		 *	반올림하고 싶은 자리를 소수 첫번째 자리로 만듬
		 *	반올림이 끝나면 다시 원래 자리로 돌려놓음
		 *	원래 자리로 돌려놓을 때 소수로 나눠야함 <<
		 *	
		 */	
		
		double value = 123.123456; // 난 소숫점 다섯째자리에서 반올림하고싶음
		System.out.println(value * 10000); // 만을 곱해 다섯째자리를 첫번째자리로 만들어줌 1231234.56이 됨
		System.out.println(Math.round(value*10000)); // 위에서 반올림해서 1231235가 됨
		System.out.println(Math.round(value*10000)/10000.0 + "\n"); // 다시 자리 맞추면 원하는자리 반올림이 됨
		// 걍 printf써서 %.2f하면 걍 소숫점 다루기 쉬움
		// 연습 1 : 12500을 반올림해 13000을 만듬
		// 연습 2 : 1.138을 내림하여 1.13으로 만듬
		
		double ex1 = 12500;
		System.out.println(ex1/1000);
		System.out.println(Math.round(ex1/1000));
		System.out.println(Math.round(ex1/1000)*1000.0+ "\n");
		
		double ex2 = 1.138;
		System.out.println(ex2 * 100);
		System.out.println(Math.floor(ex2*100));
		System.out.println(Math.floor(ex2*100)/100.0);
		
		
		
	
		
		
	}

}
