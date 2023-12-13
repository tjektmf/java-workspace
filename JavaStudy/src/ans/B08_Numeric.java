package ans;

import java.util.Scanner;

public class B08_Numeric {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(" 입력  ");

		String str = sc.next();

		boolean onlyNumber = true;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') { // onlyNumber = ch < '0' || ch > '9' 이렇게놓고 if문ㅇ ㅔ넣어도됨
				onlyNumber = false;   		// if문 자체는 변수활용으로 더 깔끔해지긴 하는데 작성하는 코드양은 같음
			}
		}
		if (onlyNumber) {
			System.out.println("숫자만있음");
		} else {
			System.out.println("다른거도있음");

		}

	}

}
