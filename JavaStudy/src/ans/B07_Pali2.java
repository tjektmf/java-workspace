package ans;

public class B07_Pali2 {

	public static void main(String[] args) {

		String word = "Abba";
		boolean hasDiffCase = false;
		//대소 모두 포함되었는지 여부를 boolean타입을 이용해 체크
		//대소문자 개수가 둘다 1 이상이면 true
		int upperCount = 0;
		int lowerCount = 0;
		
		String lowercased = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (ch>='A' && ch <= 'Z') {
				++upperCount;
			} else if (ch >= 'a' && ch <= 'z') {
				++lowerCount;
				
			}
		}
		 hasDiffCase = upperCount > 0 && lowerCount>0;
		
		System.out.println(hasDiffCase);
			
			
			
			
		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				lowercased += (char) (ch + 32);
			} else {
				lowercased += ch;
			}
		}
		System.out.println("입력 원본: " + word);
		System.out.println("소문자로 바꾼 결과: " + lowercased);

	}

}
