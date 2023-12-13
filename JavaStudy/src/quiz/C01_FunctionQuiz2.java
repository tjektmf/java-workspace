package quiz;

public class C01_FunctionQuiz2 {

	public static String password() { // password이후 ()사이에 뭐 안줘도됨 
		// 실행?
		String pass = "";  // 빈문자열 만들어서 거기다가 for문 활용해 이어붙이기
		int a = 0;
		for (int i = 0; i < 4; i++) {
			a = (int) (Math.random() * 26 + 65); // 65~90 // *('Z' - 'A' +1) +'A'이렇게 써도됨
			pass += (char)a;  // 랜덤정수 a값을 char타입으로 변환해서 갖다붙임 
		}
		return pass;
	}
		// 함수안에서 if문을 사용할때 if문의 true값과 상관없이 else값에도 리턴값ㅇ ㅣ주어져야함
		// for문도 마찬가지 팩트여부 떠나서 모든값에서 리턴이 나오는게 아니면 오류부터 뜸
	public static String text(String ran) {
		// "".toCharArray() : 문자열을 char[] 로 변환한 결과를 반환함
		// char[]arr = text.toCharArray();
		//for(int i = 0; i<1000; i++){
//		int ranIndex=(int)(Math.random()*(arr.length-1)+1);
		
//		char temp = arr[0];
	//	arr[0] = arr[ranIndex];
//		arr[ranIndex] = temp; 이렇게 뺑뺑이돌리면 사라지는값 없음 더 단순하긴한듯? strawberry 이렇게함
		
		//char[]로 문자열 생성
		//
		
		int len = ran.length(); // 입력받은 문자열의 길이 
		int ary[] = new int[len];
		String aa = ""; // >> 빈문자열에 이어붙이기
		for (int i = 0; i < len; i++) {
			ary[i] = (int) (Math.random() * len);
			for (int j = 0; j < i; j++) {
				if (ary[i] == ary[j]) {
					--i;
					break;
				}
			}
		}
		 for (int i = 0; i < len; i++) {
			aa += ran.charAt(ary[i]);
		}
		 return aa; // 위의 for문을 한줄로 줄인게 > return new String(arr);

	}

	 //32차이
	public static String alpha(String al) {
		int len = al.length();
		String as = "";

		for (int i = 0; i < len; i++) {
			if (al.charAt(i) >= 'A' && al.charAt(i) <= 'Z') {
				 as += (char)(al.charAt(i) + 32); // 그냥 al.charAt(i) + ('a'-'A')해도 결과같게나옴 
			} else if (al.charAt(i) >= 'a' && al.charAt(i) <= 'z') {
				 as += (char)(al.charAt(i) - 32);
			} else {
				as += al.charAt(i); // 알파벳아니면 걍갖다붙임
			}
		}
		return as;  // 빈 문자열 스트링타입 변수를 만들고 거기다 갖다붙임 <<
	}

	public static boolean check(String text) {
		int len = text.length();
		boolean check1 = true; // 굳이 boolean 변수를 선언할 필요없이 그냥 return값으로 false true 출력해도됨
		for (int i = 0; i < len; i++) {
			if (!(text.charAt(i) >= '0' && text.charAt(i) <= '9')) {
				check1 = false;
			}
		}
		return check1;

	}

	public static void main(String[] args) {
		
		password();
		System.out.println("1  " + password());
		text("hello");
		System.out.println("2  " + text("hello"));
		alpha("aAbB");
		System.out.println("3  " + alpha("aAbB"));
		check("32");
		System.out.println("4  " + check("32"));
		

	}
}
