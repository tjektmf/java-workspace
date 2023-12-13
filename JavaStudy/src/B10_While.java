
public class B10_While {

	public static void main(String[] args) {

		/*
		 * while for 문과 사용법이 약간 다른 '반복문' 초기값과 증감값의 위치가 정해져있지 않아 for문보다 자유로움 ()안의 내용이
		 * true라면 {}안의 내용을 계속 반복한다 증감값의 위치에 따라 결과가 달라지는 것에 주의해야 한다
		 */

		int i = 0;
		while (i < 10) { // for문은 ( ; ; ) 형식으로 초기값 증감값의 위치가 정해져있음
			// ++i; 증감값이 여기있으면 결과는 ㅎㅇ1~10이 나옴
			System.out.println("ㅎㅇ" + i++); // 0 ~ 9
//			if (i == 5) {
//				break;
//			}
		}

		System.out.println("============");

		i = 0;
		while (i < 10) { // 1 ~ 10 

			System.out.println("ㅎㅇ" + ++i); //먼저 1더함
		}
		System.out.println("============");

		i = 0;
		while (i++ < 10) { // 1~10

			System.out.println("ㅎㅇ" + i); //먼저 1더함
		}
		
		System.out.println("============");

		i = 0;
		while (++i < 10) { // 1~9 얘는 1부터 9까지나옴 그래서 ++i 는 잘 사용하지않음 직관적이지 않기 때문 비추

			System.out.println("ㅎㅇ" + i); //먼저 1더함
		}
		
		
		// while문으로 문자열 탐색
		String str = "Unionized railway workers launched a general strike from 9 a.m. "
				+ "Thursday to demand the expansion of public railroads and the implementation of a four-group, "
				+ "two-shift schedule.";
		
		int len = str.length();
		int index = 0;
		
		while(index<len) {
			System.out.printf("[%d]: %c\n", index, str.charAt(index++)); //n번째 : %d, n번째 글자 : %c
			// index가 1씩 증가함 for문에서 (index =0; ;index++)이랑 같음
			// printf에서 %c는 글자열 %d 정수 %f 실수
		}
			}
}
