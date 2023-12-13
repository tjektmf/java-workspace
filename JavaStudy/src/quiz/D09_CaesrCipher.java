package quiz;

public class D09_CaesrCipher {

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

	public static void main(String[] args) {
		System.out.println(code("ddsfavsr@%\"", 5)); // iixkf[xw&1E 나옴
		System.out.println(decode("iixkf[xw&1E", 5)); // ddsfavsr@%" 나옴
		System.out.println(secret.length());

	}

	static StringBuilder secret = new StringBuilder(
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789abcdefghijklmnopqrstuvwxyz[]/?;'\""); // 77자리 0~76

	public static StringBuilder code(String decodeText, int key) { // 암호화는 인덱스 +key
		secret.append(secret);
		secret.append(secret);

		StringBuilder code = new StringBuilder();
		for (int i = 0; i < decodeText.length(); i++) {
			for (int j = secret.length() / 4 + 1; j < secret.length() / 2; j++) {
				if (decodeText.charAt(i) == secret.charAt(j)) {
					code.append(secret.charAt(j + key));
				}
			}
		}
		return code;
	}

	public static StringBuilder decode(String codeText, int key) { // 복호화는 인덱스 -key

		StringBuilder decode = new StringBuilder();
		for (int i = 0; i < codeText.length(); i++) {
			for (int j = secret.length() / 4 + 1; j < secret.length() / 2; j++) {
				if (codeText.charAt(i) == secret.charAt(j)) {
					decode.append(secret.charAt(j - key));
				}
			}
		}
		return decode;
	}

}
