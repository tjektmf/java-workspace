package ans;

public class D09_CaesarCipher {

	/*
	 * $ 시저 암호
	 * 
	 * - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘
	 * 
	 * - 키값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고 암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화가 된다
	 * 
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'"
	 * 
	 * Hello!! 를 오른쪽으로 10만큼 밀면 RovvyCC가 됨 > 암호화 다시 왼쪽으로 10만큼 밀면 원래의 평문이 됨 > 복호화
	 * 
	 */

	// 1. 평문과 키값이 전달되면 해당 평문을 암호화하여 리턴해주는 메서드

	// 2. 암호문과 키값이 전달되면 해당 암호문을 복호화하여 리턴해주는 메서드

	final public static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'\"";

	public static String encrypt(String text, int key) {

		StringBuilder sb = new StringBuilder();
		int lenOfCharset = CAESAR_CHARSET.length();
		int len = text.length();

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int cipherIndex = (index + key) % lenOfCharset;
				sb.append(CAESAR_CHARSET.charAt(cipherIndex));
			} else
				sb.append(ch);
		}

		return sb.toString();
	}

	public static String decrypt(String text, int key) {

		StringBuilder sb = new StringBuilder();
		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();

		for (int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int plainIndex = (index - key) % lenOfCharset;

				if (plainIndex < 0) {
					// key 값을 뺀 결과가 0보다 작으면
					sb.append(CAESAR_CHARSET.charAt(lenOfCharset + plainIndex));

				} else {
					// key 값을 뺀 결과가 0보다 크면 그대로 사용
					sb.append(CAESAR_CHARSET.charAt(plainIndex));
				}

			} else {
				sb.append(ch);
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(encrypt("Hello!!!가나다", 355));

		String encryptedText = encrypt("Hello!!!가나다", 355);
		System.out.println(decrypt(encryptedText, 355));

	}

}
