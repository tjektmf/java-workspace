package quiz;

import java.util.Scanner;

public class B03_MakeGrade {

	public static void main(String[] args) {

		Scanner examGrade = new Scanner(System.in);

		System.out.print("국어 영어 수학 점수는? ");
		int korean = examGrade.nextInt();
		int english = examGrade.nextInt();
		int math = examGrade.nextInt();

		double examAvg = (Math.round((korean + english + math) / 3.0 * 10.0)) / 10.0;
		double examAvg2 = (korean + english + math) / 3.0; // 세 과목을 더해 3으로 나눔, 평균값
		double examAvg3 = (Math.round(examAvg2 * 10.0) / 10.0);
		// System.out.println(examAvg + "\n" + examAvg2 + "\n" + examAvg3);
		// 불필요한 () 를 많이쓰면 일단 나부터 헷갈림 필요한거만 사용

		if ((korean < 0 || korean > 100) || (english < 0 || english > 100) || (math < 0 || math > 100)) {
			System.out.println("너 F퇴학");
		} else if (korean >= 90) {
			System.out.println("국어 점수는 " + korean + "점이고 등급은 A");
		} else if (korean >= 80) {
			System.out.println("국어 점수는 " + korean + "점이고 등급은 D");
		} else if (korean >= 70) {
			System.out.println("국어 점수는 " + korean + "점이고 등급은 C");
		} else if (korean >= 60) {
			System.out.println("국어 점수는 " + korean + "점이고 등급은 D");
		} else {
			System.out.println("국어 점수는 " + korean + "점이고 등급은 F");
		} // else 는 {}만 사용하며 똑같이 ;로 닫아줌

		if ((korean < 0 || korean > 100) || (english < 0 || english > 100) || (math < 0 || math > 100)) {
			System.out.println("너 F퇴학");
		} else if (english >= 90) {
			System.out.println("영어 점수는 " + english + "점이고 등급은 A");
		} else if (english >= 80) {
			System.out.println("영어 점수는 " + english + "점이고 등급은 D");
		} else if (english >= 70) {
			System.out.println("영어 점수는 " + english + "점이고 등급은 C");
		} else if (english >= 60) {
			System.out.println("영어 점수는 " + english + "점이고 등급은 D");
		} else {
			System.out.println("영어 점수는 " + english + "점이고 등급은 F");
		}

		if ((korean < 0 || korean > 100) || (english < 0 || english > 100) || (math < 0 || math > 100)) {
			System.out.println("너 F퇴학");
		} else if (math >= 90) {
			System.out.println("수학 점수는 " + math + "점이고 등급은 A");
		} else if (math >= 80) {
			System.out.println("수학 점수는 " + math + "점이고 등급은 D");
		} else if (math >= 70) {
			System.out.println("수학 점수는 " + math + "점이고 등급은 C");
		} else if (math >= 60) {
			System.out.println("수학 점수는 " + math + "점이고 등급은 D");
		} else {
			System.out.println("수학 점수는 " + math + "점이고 등급은 F");
		}

		if ((korean < 0 || korean > 100) || (english < 0 || english > 100) || (math < 0 || math > 100)) {
			System.out.println("평균 0점 너 F");
		} else {
			System.out.println("너 평균점수는 " + examAvg3 + "점");
		}

	}
}
