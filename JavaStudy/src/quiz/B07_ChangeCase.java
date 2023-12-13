package quiz;

import java.util.Scanner;

public class B07_ChangeCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문장을 입력해 ");
		String ans = sc.nextLine(); // 문장입력이라 라인써야함 라인안쓰면 공백에서 끊어짐
		// 점수 입력값 받을때 스페이스로 구분해서 세번받던거 생각
//
//		String result = "";
//		String text = new Scanner(System.in).nextLine();
//		for (int i = 0; i < text.length(); i++) {
//			char ch = text.charAt(i);
//
//			if (ch >= 'a' && ch <= 'z') {
//				result += (char) (ch - 32);
//			} else if (ch >= 'A' && ch <= 'Z') {
//				result += (char) (ch + 32);
//			} else {
//				result += ch;
//			}
//		}
//		System.out.print(result);

//		 * 	2. next() 메서드
//		 * 
//		 * 	통로에 있는 값 하나를 무조건 문자열로 꺼낸다
//		 * 	공백, \t, \n을 통해 각 값을 구분함
//		 * 	통로에 남아있는 값이 없다면 다음 입력을 기다림 // next() 메서드를 사용하면 띄어쓰기앞에서 끝남

//		 *  3. nextLine() 메서드
//		 *  
//		 *  통로에 있는 값을 모두 문자열로 꺼낸다(즉 한 줄을 입력받음)
//		 *  \n만으로 값을 구분하기 때문에 모든 값을 꺼냄 <<
//		 *  통로에 남아있는 값이 없다면 다음 입력을 기다림

		int len = ans.length();

		for (int i = 0; i < len; i++) { // 범위 확인
			if (ans.charAt(i) >= 65 && ans.charAt(i) <= 90) { // 굳이 숫자로 안바꾸고 a A z Z 써도 됨
				System.out.print((char) (ans.charAt(i) + 32)); // char ans2로 변수만들어서 ans.charAt(i)대신 써도됨
			} else if (ans.charAt(i) >= 97 && ans.charAt(i) <= 122) {
				System.out.print((char) (ans.charAt(i) - 32));
			} else {
				System.out.print((char) ans.charAt(i));
			}
		}
	}
}
