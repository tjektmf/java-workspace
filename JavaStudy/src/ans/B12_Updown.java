package ans;

import java.util.Scanner;

public class B12_Updown {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int maxChance = 5; // 나중에 찬스늘릴때 이값만 바꿔주면 바로 적용됨 변수활용 중요
		int chance = maxChance;
		boolean userWin = true;

		int answer = (int) (Math.random() * 100 + 1);
		System.out.println(answer);
		while (chance > 0) {
			System.out.print("숫자를 고르");
			int select = sc.nextInt();

			if (select > 100 || select < 1) {
				System.out.println("숫자범위 제대로");
				continue; // continue를 쓰면 이후 코드를 건너뛰기 때문에 아래의 찬스감소가 없음
			}
			--chance;
			if (select > answer) {
				System.out.println("Down");
			} else if (select < answer) {
				System.out.println("Up");
			} else {
				System.out.println("정답");
				userWin = true;
				break;
			}

			System.out.println("남은 chance : " + chance);
		}
		if (userWin) {
			System.out.printf("%d번 만에 맞춤\n", maxChance - chance); // 변수 최대한 활용
		}
	}

}
