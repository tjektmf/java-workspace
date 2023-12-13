package quiz;

import java.util.Scanner;

import myobj.Changeds;

public class C17_RotateShape {

	/*
	 * 4x4 크기로 이루어진 어떤 모양이 있을 때 해당 모양을 오른쪽으로 90도 회전시키는 프로그램
	 * 
	 * □ ■ □ □ □ ■ ■ □ □ □ □ □ □ □ □ □ 오른쪽 90도로 회전
	 * 
	 */

	public static void main(String[] args) {

		Changeds ds = new Changeds();
		Scanner sc = new Scanner(System.in);
		ds.print();
		boolean colorful = true;
		while (true) {

			while (colorful) {
				System.out.println("색칠 ㄱㄱ  ");
				for (int i = 0; i < 15; i++) {
					String numnum = sc.next();
					ds.color(numnum);
					ds.print();

					System.out.println("색칠끝? Y ");
					String ans = "";
					if (ans.equals("y") || ans.equals("Y")) {
						colorful = false;
					}
					break;
				}
			}
			
		}
	}
}
