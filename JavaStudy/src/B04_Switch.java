
public class B04_Switch {

	public static void main(String[] args) {

		/*
		 * switch-case 문
		 * 
		 * ()안의 값에 따라 실행할 코드를 결정 ()안에 boolean 타입 값은 사용할 수 없음 if문으로 완벽하게 대체 가능함 if문이 더 좋음
		 * 스위치는 boolean값을 못씀 default는 if문의 else의 역할을 함, 나머지 값 전부 break를 적지 않으면 ()값에 해당하는
		 * case부터 break를 만날 때 까지 모든 case를 실행함
		 * 
		 * 
		 */
		int value = 3;

		switch (value) {
		case 1, 2, 3:
			System.out.println("11111111");
			break;
		case 4:
			System.out.println("22222222222");
			break;
		case 5:
			System.out.println("3333333333333333");
			break;
		default:
			System.out.println("?");
			break;

		}

		String cmd = "run";

		switch (cmd) {
		case "run":
			System.out.println("실행");
			break;
		case "help":
			System.out.println("도움말");
			break;
		case "cd":
			System.out.println("change direction");
			break;
		default:
			System.out.println("다시");
			break;

		}

	}
}
