
public class B08_Break {

	public static void main(String[] args) {

		/*
		 * break
		 * 
		 * switch-case 문에서 사용해 해당 case를 탈출한다 반복문 내부에서 사용하면 반복문을 하나 탈출한다 if문 내부에서 사용한다고
		 * 해서 if문을 탈출하지는 않음
		 * 
		 * continue
		 * 
		 * 반복문 내부에서 만나면 다음번 반복으로 넘어감
		 * 
		 */

		// ex1

		for (int i = 0; i < 100; i++) {
			System.out.println("g2 " + i + " !");

			if (i == 'A') {
				break; // if문으로 조건만들고 이게 참이면 탈출 이런식으로 활용
			}

		}

		// ex2
		String str = "김정은 북한 국무위원장이 탄 전용열차가 러시아 극동 지역인 보스토치니 우주기지로 향하고 있습니다";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.printf("\'%d\'번째 문자는 \"%c\"입니다. \n", i, ch);

			if (ch == '니') {
				break;
			}
		}

		// continue ex1

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 1) {
				continue; // i가 짝수가 아닐때 밑으로 내려가지않음 계속하라는 느낌보다 건너뛰라는 느낌
			}				// 즉 홀수는 건너뛰고 짝수만 출력
			System.out.println(i);
		}
	}

}
