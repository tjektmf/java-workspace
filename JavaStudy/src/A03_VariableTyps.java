
public class A03_VariableTyps {
	
	/*
	 	정수 타입
		byte	(1byte, 8bit)
		2^8 = 256 가지의 값을 표현할 수 있다 > -128 ~ 127 총 256가지
	   	short	(2byte, 16bit)
	   	2^16 = 65536 가지의 값을 표현할 수 있다 > -32768 ~ 32767 총 65536가지
	   	
   	   	char	(2byte, 16bit)
   	   	2^16 = 65536 >> 0~65535 범위의 양수만 사용함 65536가지
 	   	int		(4byte, 32bit)
 	   	2^32 = 4,294,967,296 > -2,147,483,648 ~ 2,147,483,647
 	   	long	(8byte, 64bit)
 	   	2^64 = 18,446,744,073,709,551,616 > -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
	  
	  실수 타입
	  
	  
	  
	  참/거짓 타입
	  
	  문자열
	 */
	public static void main(String[] args) {
		
		byte mi = (byte) 128; 
		// byte의 상한인 127을 넘어가면 제일 작은 숫자인 -128로 돌아감 (126, 127, -128, -127 순서)
		
		int number = 999;
		byte num1 = 10;
		System.out.println(number);
		System.out.println(num1);
		System.out.println(mi);
		
		byte byte_min = -128, byte_max = 127;
		System.out.println("byte 타입의 최솟값은 " + byte_min + "이고 최댓값은 " + byte_max + "입니다.");
		
		int int_min = -2147483648, int_max = 2147483647;
		System.out.println("int 타입의 최솟값은 " + int_min + "이고 최댓값은 " + int_max + "입니다.");
		
		int int_min2 = Integer.MIN_VALUE;
		int int_max2 = Integer.MAX_VALUE; // 이미 저장된 값을 불러옴
		long long_min2 = Long.MIN_VALUE;
		long long_max2 = Long.MAX_VALUE;
		
		
		System.out.println("int min : " + Integer.MIN_VALUE + ", int max : " + Integer.MAX_VALUE);
		// 이런게 있음 롱숏다됨 걍다됨
		
		long long_min = -9223372036854775808L, long_max = 9223372036854775807L;
		System.out.println("long 타입의 최솟값은 " + long_min + "이고 최댓값은 " + long_max + "입니다.");
		// int 범위 넘어가면 L 붙여야함 
		

		//AC00 > 44032 프로그래머용 계산기를 사용하면 쉽게 값을 찾을 수 있음
		/*16진수
		1~9 A B C D E F 까지 6개를 더 사용함
		10진수하면 너무 많아서 16진수사용
		*/
		//char 타입에 넣는 값은 문자로 바꿔서 보여줌 
		char ch1 = '갑';
		int ch2 = 44049;
		
		char cha = '갑'; 
		// 문자를 넣어도 값이 나옴 > 문자도 정수값을 가짐
		// 그래서 다른 정수값인 int 에도 저장가능
		// char cha2 = 'ff'; 문자열은 정수아님
		
		// Alt + 방향키 : 줄 위아래로 바꿈
		char ch4 = (char) ch2;
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(cha);
		System.out.println(ch4);
		
		// ASCII CORD : 0~127 총 128개의 코드
		char ch5 = 48; // '숫자' 48을 넣으면 '문자' 0이 나옴
		int ch6 = '0';
		// int ch7 = "0";  "0"은 안됨 '0' 넣어야함
		
		System.out.println(ch5);
		System.out.println(ch6);
		
		
		/*
		 * 실수 타입
		 * 부동 소숫점 방식을 사용
		 * float	(4bytes)
		 * double	(8bytes)
		 * 
		 * 참/거짓 타입
		 * boolean
		 * 
		 * 문자열
		 * String
		 */
		float avg_score = 95.22222222222222222f; // float에 저장할 때는 F를 적어야함 대소구분안함
		// f 안넣으면 double을 float로 변환할 수 없다는 에러가 뜸
		// f 넣으면 뒤에 적당히 짤림 >>  * 7. 소수 뒤에 F : 짧은 실수(Float), 계산가능, 소문자가능
		double avg_score2 = 7777777.7777777; // double은 f없이 그냥 적어도 됨 무한으로 나옴
		
		System.out.println("에베베벱 " + avg_score);
		System.out.println("슬롯머신 " + avg_score2);

		boolean dog = true;
		boolean cat = true;
		boolean powerOn = true;
	
		//문자열 String
		String welcomeMessage = "ㅎ2";
		System.out.println(welcomeMessage);
		
		
	}

}
