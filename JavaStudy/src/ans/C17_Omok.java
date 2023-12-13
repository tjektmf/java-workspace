package ans;

import java.util.Scanner;

import myobj.omok.OmokBoard;

public class C17_Omok {

	public static void main(String[] args) {

		OmokBoard omok1 = new OmokBoard();
		Scanner sc = new Scanner(System.in);

		boolean isBlack = true;
		int turn = 0;

		while (true) {
			System.out.println("<" + (turn+1) + "수>");

			omok1.print();

			System.out.printf("'%s'의 차례입니다 \n", isBlack ? "흑" : "백"); // 삼항 연산자 ㅇㅇㅇ ? true : false
			System.out.print("좌표 입력 >>  ");

			String coord = sc.next();

			if (omok1.put(coord, isBlack)) { // isBlack(현재 턴)에 대한 put값이 트루라면 isBlack을 바꿈(다음턴으로)

				if (omok1.winCheck(coord, isBlack)) {
					System.out.println((isBlack ? "흑" : "백") + "이 이겼습니다");
					break;
				}
				isBlack = !isBlack;
				turn++;

			}
		}
		omok1.print();
	}
}
