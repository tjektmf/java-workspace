
public class B07_CharAt {

	public static void main(String[] args) {

		/*
		 * "문자열".charAt(index); 해당 문자열에서 원하는 위치(인덱스)의 문자를 char타입으로 꺼내는 메서드 시작은 0
		 * 인덱스는 '문자 개수 - 1' >> 0부터 시작함
		 * 
		 * "문자열".length(); 해당 문자열의 길이(문자 개수)를 알 수 있다
		 * 
		 */

		char ch = "안녕하세요".charAt(0); //안녕하세요의 0번자리는 '안'이니까 함수 ch에는 '안' 한글자가 저장됨

		System.out.println(ch);
		System.out.println("안녕하세요".charAt(1));
		System.out.println("안녕하세요".charAt(2));
		System.out.println("안녕하세요".charAt(3));
		System.out.println("안녕하세요".charAt(4));

		// for문을 사용하면 문자열을 쉽게 탐색할 수 있다
		String text = "다람쥐 헌 쳇바퀴에 타고파";
		System.out.println("마지막 글자 : " + text.charAt(text.length() - 1));
		//text.length() - text의 길이라서 1부터셈
		//text.charAt() - 위치라서 0부터 셈, charAt+1=length 임

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.printf("%d번째 문자 : %c\n", i, c); // printf에서 c는 문자 d는 정수 f는 실수
		}
		// 문자열 str을 거꾸로 출력 시작값을 끝글자의 위치로 지정하고 i를 1씩 빼면됨
		for (int i = text.length() - 1; i >= 0; i--) { // 0부터 시작하므로 i >= 0
			System.out.print(text.charAt(i)); // text의 i번째 글자열을 출력함
		}
		
		System.out.println();
		
		for (int i = 0; i < text.length(); i++) { // 좀더 깰끔, 골격은 같음 뒤부터 불러와서 하나씩 앞으로
			System.out.print(text.charAt(text.length() -1 -i)); // 
		}
		
		System.out.println();
		 
	}
}
