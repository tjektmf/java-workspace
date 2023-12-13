package quiz;

import java.util.Random;

public class B12_TempPass2 {

	public static void main(String[] args) {

		Random ran = new Random();
		// 33~122
		final String text = "!@#$%^&*():;=+-_[]ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int len = text.length();
		System.out.println(len);
		// final 을 붙이고 선언한 변수는 값을 변경할 수 없음 종결변수 뭐 이런느낌인듯
		for (int i = 0; i < 6; i++) {

			int num = ran.nextInt(len);
			System.out.print(text.charAt(num));
// 48~57 // 65~90 // 97~122 = 10 + 26 + 26 // 62개18
		}

	}
}

//			for(int j = 0; j< )
//
//			int num1 = ran.nextInt(122 - 33 + 1) + 33;
//			
//			String all = ""
//			char ch = 'd';
//			System.out.print((char) num1);
//			
