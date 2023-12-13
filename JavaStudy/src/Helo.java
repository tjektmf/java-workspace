import java.util.Scanner;

public class Helo {
	
	public static void main(String[] args) {
		
		String name = "감자바";
		int age = 25;
		String tel1 ="010", tel2="123", tel3="4567";
		
	
		System.out.println("이름 :\t" + name);
		System.out.print("나이 :\t" + age + "\n");
		System.out.printf("전화 :\t%s-%s-%s\n", tel1, tel2, tel3);
					// printf 에서 앞에 적는 값은 ""로 전부 통째로 묶어야함
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		String strNum1 = sc.nextLine();
		
				
		System.out.print("두번째 수: ");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
	
		
				
		int num2 = Integer.parseInt(strNum2);
		
		
		int result = num1 + num2;
		
		System.out.println("result : " + result);
		
		int o = 0;
		for ( int i = 1; i <= 10; i++) {
			o += i;
		}
		System.out.println(o);
		

			
	}

}
