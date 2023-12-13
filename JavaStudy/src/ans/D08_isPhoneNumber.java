package ans;

public class D08_isPhoneNumber {

	public static boolean isValidPhoneNumber(String phoneNumber) {

		// 010으로 시작하지 않으면 false
		if (!phoneNumber.startsWith("010")) {
			System.out.printf("[INFO] %s 는 010으로 시작하지 않음\n", phoneNumber);
			return false;
		}

		// - 제거했는데 숫자가 아닌게 있으면 false
		String hyponRemovedNumber = phoneNumber.replace("-", ""); // "-"를 ""로 바꿈 그냥 - 삭제랑 같은효과
		for (int i = 0; i < hyponRemovedNumber.length(); i++) {
			if (!Character.isDigit(hyponRemovedNumber.charAt(i))) {
				System.out.printf("[INFO] %s 는 숫자 이외의 문자가 포함됨\n", phoneNumber);
				return false;
			}
		}
		
		if(hyponRemovedNumber.length()!=11) {
			System.out.println("[INFO] 숫자가 11개가 아님");
			return false;
		}
		

		int len = phoneNumber.length();
		if (!(len == 11 || len == 13)) {
			System.out.println("[INFO] 길이가 이상함");
			return false;
		}

		if (len == 13) {
			if(phoneNumber.charAt(3)!= '-' || phoneNumber.charAt(8)!='-') {
				System.out.println("[INFO] - 위치가 이상함");
				return false;
			}
			
			int hyponCount =0;
			for(int i=0; i<len; i++) {
				if(phoneNumber.charAt(i)=='-') {
					hyponCount++;
				}
			}
			if(hyponCount!=2) {
				System.out.println("[INFO] - 의 개수가 이상함");
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isValidPhoneNumber("dddddd"));
		System.out.println(isValidPhoneNumber("010-1234+1234"));
		System.out.println(isValidPhoneNumber("010-123412-34"));
		System.out.println(isValidPhoneNumber("010-123-4-1-2-34"));
		System.out.println(isValidPhoneNumber("010--4-1-2-34"));
		System.out.println(isValidPhoneNumber("010--4-1-2"));
		System.out.println(isValidPhoneNumber("010-6855-1527"));

	}

}
