package quiz;

import java.util.Scanner;

public class E01_CorrectInput {

	/*
	 * 
	 * 사용자로부터 스캐너로 숫자를 입력받되 숫자가 아닌 문자를 입력하더라도 다시 입력받을 수 있는 프로그램
	 */

	public static void main(String[] args) {
		boolean check = true;
		int correct = 0;

		Scanner sc = new Scanner(System.in);
		while (check) {
			try {
				System.out.print("숫자를 입력 : ");
				correct = sc.nextInt();
				break; // 굳이 if문넣어서 while문 true/false값 바꿀 필요 없이 그냥 break 해버리면 빠져나옴

			} catch (java.util.InputMismatchException e) {
				System.out.println("숫자아니자나");
				sc.nextLine(); // sc에 들어있는 값을 비워줌
			} finally {

			}
		}
		System.out.println(correct + " 입력함");
		System.out.println("잘했따");
	}
}
