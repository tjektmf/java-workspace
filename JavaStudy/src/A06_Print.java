//패키지이름이 없으면 디폴트 패키지
public class A06_Print {
	
	public static void main(String[] args)	{
		
		/*
		 * 	콘솔에 출력하기 위한 함수들
		 * 
		 * 	뒤에 () 붙은건 다 함수임
		 * 	뒤에 ()가 붙고 class 내부에 있으면 메서드
		 * 
		 * 	1. println() 
		 * 	()안에 전달한 데이터를 콘솔에 출력하고 줄을 바꿈
		 * 	데이터 뒤에 \n을 출력
		 * 
		 * 	2. print()
		 * 	()안에 전달한 데이터를 콘솔에 출력 << 얘가 기본임
		 * 
		 * 	3. printf()
		 * 	print format 
		 * 	원하는 서식을 먼저 설정, 해당 서식대로 데이터 출력
		 * 	
		 * 	printf 서식의 종류
		 * 	%d : 해당 자리에 전달한 정수값을 10진수로 출력 (deci)
		 * 	%o : 8진수로 출력 (oct)
		 *  %x : 16진수로 출력 (소문자) (hex)
		 *  %X : 16진수로 출력	(대문자) (hex)
		 *  %f : 실수
		 *  %s : 문자열
		 *  %c : 문자
		 *  %% : escape문자처럼 그냥 %를 출력할 때 사용
		 * 
		 * 	옵션
		 * 	1. %숫자d :  숫자만큼 자릿수를 확보해 출력
		 * 	2. %-숫자d : 위와 같은데 왼쪽 정렬 후 뒤로 확보
		 * 	3. %+숫자d : 1과 같은데 +부호를 추가함
		 * 	4. %0d : 숫자 앞에 남은 자리에 0을 출력
		 * 	5. %.숫자f : 소숫점 자릿수를 설정하여 반올림해 출력함 f만 가능 d는 당연안됨
		 */
		System.out.print("ㅎ2\n");
		System.out.print("ㅎ2\n");
		System.out.print("ㅎ2\n");
		
		int year = 2023;
		int month = 9;
		int date = 6;
		int hour = 11;
		int minute = 22;
		int second = 32;
		String ampm = "AM";
		
		
		System.out.println(year+"년 " + month+"월 "+date+"일 " + ampm +" "
				+ hour + "시 "+ minute + "분 " + second + "ch ");
		
		System.out.printf( "%d\n %d\n %d\t %s %d %d %d 초\n", 
			            	year, month, date, ampm, hour, minute, second);
		
		// %d에 값이 하나씩 들어감 %s는 String
		
		double successRate = 65.88;
		
		System.out.printf("%f%%의 확률로 강황 ㅔ성공\n", successRate);
		System.out.printf("%.1f%%의 확률로 강황 ㅔ성공\n", successRate);
		System.out.printf("%1f%%의 확률로 강황 ㅔ성공\n", successRate);
		System.out.printf("%.2f%%의 확률로 강황 ㅔ성공\n", successRate);
		
		int money = 1234;
		System.out.printf("보유금액 : %d\n", money);
		System.out.printf("보유금액 : %10d\n", money); //앞에 10칸 확보
		System.out.printf("보유금액 : %-10d\n", money);//뒤에 10칸 확보
		System.out.printf("보유금액 : %+10d\n", money);//10칸 확보하고 +출력
		System.out.printf("보유금액 : %010d\n", money);//10칸 확보하고 빈자리에 0출력
		System.out.printf("보유금액 : %025d\n", money);
		
		double dollar = 10.15;
		System.out.printf("remains : %.2f$\n", dollar);
		System.out.printf("remains : %15f$\n", dollar);
		System.out.printf("remains : %015.1f$\n", dollar);
		// 0 = 빈자리를 0으로 채움, 15 = 앞에 15자리를 남김, .1 = 소숫점 둘째자리에서 반올림해서 출력
		
		
		String aa = "*";
		
		System.out.printf("%s%s%s%s%s%s%s%s%s\n", aa, aa, aa, aa, aa, aa, aa ,aa, aa);
		System.out.printf("%2s%s%s%s%s%s%s\n", aa, aa, aa, aa, aa, aa, aa);
		System.out.printf("%3s%s%s%s%s\n", aa, aa, aa, aa, aa);
		System.out.printf("%4s%s%s\n", aa, aa, aa);
		System.out.printf("%5s\n",aa);
		
		
		String str = "10";
		int value2 = 10;
		int value = Integer.parseInt(str);
		System.out.println(value);
		System.out.println(value+value2); // 문자열 str을 숫자(기본타입) 10으로 바꿔서 10+10=20
		System.out.println(value+str);
		
		
		
		
	}
}
