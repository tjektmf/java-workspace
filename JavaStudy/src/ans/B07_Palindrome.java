package ans;

public class B07_Palindrome {

	public static void main(String[] args) {

		// 1. 맨앞부터 글자 하나씩 비교(절반까지)
		String word = "eye";

		int len = word.length(); // 이런건 걍 미리해두면 나중에 변수로 쓰기편함
		int incorrectCount = 0;
		boolean palindrome = true;
		//
		// 팰린드롬이 true인 경우에만 실행, false가 나오면 즉시 종료
		for (int i = 0, half = word.length() / 2; palindrome && i <= half; i++) {
			char frontCh = word.charAt(i);
			char behindCh = word.charAt(len - 1 - i);

			palindrome &= frontCh != behindCh;
			// &=를 이용해 false가 한번만 나와도 false가 되도록 만들 수 있다

//			if (frontCh != behindCh) {
//				++incorrectCount;
//			} 
//		}

			if (incorrectCount > 0) {
				System.out.println("(1) 좌우대칭이 아님");
			} else {
				System.out.println("(1) 좌우대칭입니다");
			}
			// 2. 단어를 뒤집고 비교해서 같으면 좌우대칭
			// String word = "Tree";
			String reversed = ""; // 빈 문자열 변수 하나 만들고 뒤집은거 집어넣어서 코드짜면 편함

//			for (int i = 0; i < word.length(); i++) {
//
//				reversed += word.charAt(word.length() - 1 - i);
//			}
//			System.out.printf("원본 : %s, 뒤집 : %s\n", word, reversed);
//
//			if (word.equals(reversed)) {
//				System.out.println("좌우대칭입니다");
//			} else {
//				System.out.println("좌우대칭이 아닙니다");
//
//			}
//
//			System.out.println(word.equals(reversed));
//			// 변수 word에 있는 문자열이 변수 reversed에 있는 문자열과 일치하는지 비교
//			// true false 값으로 나옴

		}

	}
}
