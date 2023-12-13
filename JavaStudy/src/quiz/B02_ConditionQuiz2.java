package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	
	public static void main(String[] args) {
		
		char a = 'Q';
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		
		char b = '\t';
		System.out.println("2. " + !(b==' ' || b== '\t'));
		
		char c = '5';
		System.out.println("3. " + (c <= 57 && c >= 48));
		
		char d = 'B';
//		int dd = d;
//		System.out.println(dd);
//		System.out.println(97~122);
		System.out.println("4. " + (d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z'));
	//	int dd =d;
//		System.out.println(dd); B와 b는 다름 
		
		char e = '헉';
		System.out.println("5. " + (e >= 44032 && e <= 55213));
//		int ee = e;
	//	System.out.println(ee);
		
		Scanner ds = new Scanner(System.in);
		System.out.print("6. quit라고 써 ");
		String f = ds.next();
		System.out.print(f.equals("quit"));
		
		System.out.println(new Scanner(System.in).next().equals("quit"));
		//이렇게하면 더 못쓰고 스캐너는 버려짐
		
		
	}

}
