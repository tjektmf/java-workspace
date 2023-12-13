package ans;

import java.util.Scanner;

public class B03_MakeGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수?");
		int kor = sc.nextInt();
		System.out.print("영어점수?");
		int eng = sc.nextInt();
		System.out.print("수학점수?");
		int math = sc.nextInt();

		
		char korGrade;
		char engGrade;
		char mathGrade;
		double avg;

		// 유효 점수 체크 유효성검사
		if (kor > 100 || kor < 0 || eng > 100 || eng < 0 || math > 100 || math < 0) {
			kor = 0;
			eng = 0;
			math = 0;
			korGrade = 'F';
			engGrade = 'F';
			mathGrade = 'F';
			
		} else {
			// 모든 점수가 유효함 else 안에서 새로운 if문 사용가능함
			if (kor >= 90) {
				korGrade = 'A';
			} else if (kor >= 80) {
				korGrade = 'B';
			} else if (kor >= 70) {
				korGrade = 'C';
			} else if (kor >= 60) {
				korGrade = 'D';
			} else {
				korGrade = 'F';
			}
			if (eng >= 90) {
				engGrade = 'A';
			} else if (eng >= 80) {
				engGrade = 'B';
			} else if (eng >= 70) {
				engGrade = 'C';
			} else if (eng >= 60) {
				engGrade = 'D';
			} else {
				engGrade = 'F';
			}
			if (math >= 90) {
				mathGrade = 'A';
			} else if (math >= 80) {
				mathGrade = 'B';
			} else if (math >= 70) {
				mathGrade = 'C';
			} else if (math >= 60) {
				mathGrade = 'D';
			} else {
				mathGrade = 'F';
			}
			// 두번째 자리에서 반올림
			// double avg = Math.round((kor + eng + math) / 3.0 * 10) / 10.0;
		
			avg = (kor + eng + math) / 3.0;
			// printf 기능을 활용하면 Math.round 없어도 자유롭게 자릿수 정해서 반올림 가능
			// Ctrl + Shift + F : 들여쓰기를 맞춰줌 << 이 기능 매우 중요
			System.out.println("\t점수\t등급");
			System.out.printf("국어\t%d\t%s\n", kor, korGrade);
			System.out.printf("영어\t%d\t%s\n", eng, engGrade);
			System.out.printf("수학\t%d\t%s\n", math, mathGrade);
			System.out.println("=====================");
			System.out.printf("평균\t\t%.1f\n", avg);
		}
	
		
	}
	
}
