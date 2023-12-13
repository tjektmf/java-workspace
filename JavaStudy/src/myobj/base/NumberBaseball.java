package myobj.base;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseball {

	int[] answerArr = new int[4];
	Scanner sc = new Scanner(System.in);

	public NumberBaseball() { // 기본규칙은 4개맞추기
		answerArr = selectArr(4); // size에 4개를 넣는게 기본규칙
	}

//	public NumberBaseball(int size) { // 기본규칙 수정기능
//		answerArr = selectArr(size);
//	}

	public int[] selectArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					--i;
					break;
				}
			}
		}
		return arr;
	}

	int[] yourAns = new int[4];
	int ballCount = 0;
	int strikeCount = 0;
	int tryCount = 0;
	int yourNum = 0;
	String Num2 = "";
	int[] realAns = answerArr;

	public void play() {

//		for (int i = 0; i < 4; i++) {
//			yourAns[i] = sc.nextInt();
//		}
		while (tryCount < 10) {
			boolean rangeCheck = true;
			while (rangeCheck) {
				System.out.println("네자리숫자 입력ㄱㄱㄱ");
				yourNum = sc.nextInt();
				if (yourNum > 0000 && yourNum < 9999) {
					rangeCheck = false;
				}


				for (int i = 3; i >= 0; i--) {
					yourAns[i] = yourNum % 10;
					yourNum /= 10;
				}
				System.out.println("내가 고른 숫자 " + Arrays.toString(yourAns));
				for (int i = 0; i < yourAns.length; i++) {
					for (int j = 0; j < i; j++) {
						if (yourAns[i] == yourAns[j]) {
							rangeCheck = true;
							break;
						}
					}
				}
				if(rangeCheck) {
					System.out.println("중복숫자 범위초과 ㄴㄴㄴㄴ");
					
				}
			}
			++tryCount;

			for (int i = 0; i < answerArr.length; i++) {
				for (int j = 0; j < answerArr.length; j++) {
					if (yourAns[j] == answerArr[i] && (j - i == 0)) {
						++strikeCount;
						// 0이 스트라이크임
					} else if (yourAns[j] == answerArr[i] && (j - i != 0)) {
						++ballCount;
					}
				}
			}
			if (strikeCount == 4 && tryCount != 10) {
				System.out.println(strikeCount + "스트라잌 잘했따 정답 / " + tryCount + "번만에 맞춤" );
				break;
			} else if (tryCount < 9) {
				System.out.printf("%d스트라잌 %d볼이야 %d번째임  / ", strikeCount, ballCount, tryCount);
				System.out.println("정답은 " + Arrays.toString(answerArr));
				strikeCount = 0;
				ballCount = 0;
			} else {
				System.out.println("ㅅㄱ끝");
				break;
			}
		}
	}
}