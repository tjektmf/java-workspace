package ans;

public class B12_357 {

	public static void main(String[] args) {

		int ran = (int) (Math.random() * 401 + 100);
		int clapCount = 0;
		for (int i = 1; i <= ran; i++) {
			System.out.print(i + " : ");
			// (1) 숫자를 문자열로 바꿔서 센다
			String numStr = "" + i; // 스트링에 하나씩 갖다붙임
			for (int j = 0; j < numStr.length(); j++) {//
				char ch = numStr.charAt(j); // 0부터 시작

				if (ch == '3' || ch == '6' || ch == '9') {
					System.out.print("짝");
					++clapCount;
				}
			}
			System.out.println();
		}
		System.out.print("\t누적 " + clapCount + "번");
	}
}

// (2) 숫자를 한자리씩 검사하며 3의 배수인지 센다

//int chkNum = i;
//while (chkNum > 0) {
//
//	int digit = chkNum % 10;
//	if (digit != 0 && digit % 3 == 0) {
//		System.out.print("짝");
//		++clapCount;
//	}
//	chkNum /= 10;
//}