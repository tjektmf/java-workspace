package quiz;

public class A03_PersonInfo {
	public static void main(String[]args) {
		
		String a = "홍길동";
		int b = 20; // byte는 용량을 아끼기 위해 사용함 요즘엔 용량 넘쳐서 byte 안써도 됨
		String c = "010-1234-1234";
		float d = 178.5f;  // float은 f사용, int 범위 넘어가면 L사용 대소구분안함
		float e = 75.0f;	// float도 byte와 같이 용량을 아끼기 위해 사용함
		// 즉 잘 안씀 뒤에 f붙여야해서 귀찮음 그냥 double 쓰면 됨 ㅋㅋ
		String f = "O";
		// 혈액형은 A B O AB RH+ RH- 등등 다양함 char 불가능
		
		
		System.out.println("======= 출력 결과 ========");
		System.out.println("이름\t: " + a);
		System.out.println("나이\t: " + b);
		System.out.println("Tel\t: " + c);
		System.out.println("키\t: " + d);
		System.out.println("몸무게\t: " + e);
		System.out.println("혈액형\t: " + f);

		
		
	}

}
