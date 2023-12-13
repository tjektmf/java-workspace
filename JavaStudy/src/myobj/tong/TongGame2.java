package myobj.tong;

import java.util.Scanner;

public class TongGame2 {

	int[] answerArr;
	int stabCount = 0;

	public TongGame2() { // 겜 기본 규칙
		answerArr = makeAnswerArr(20);
	}

	public TongGame2(int size) { // 겜 규칙 수정
		answerArr = makeAnswerArr(size);
	}

	/**
	 * 정답 배열을 만들어서 리턴해주는 메서드, 정답은 size의 1/5개로 설정 0 = 일반구멍, 1 = 폭탄, 2 = 이미 찌른 구멍
	 * 
	 * @param size - 전체 구멍의 개수
	 * @return 생성된 정답 배열
	 */
	public int[] makeAnswerArr(int size) {
		int[] arr1 = new int[size];

		int answerCount = size / 5;

		for (int i = 0; i < answerCount; i++) {
			arr1[i] = 1; // 만약 1이 4개라면 처음 0123자리 4개가 1인데 이걸 섞으려고 셔플 메서드를 이용함
		} // 아래들려서 섞어온 셔플아르르 리턴함
			// 이렇게 중간에 다른 메서드들려서 싹 돌리고 결과값 가져올수있음
		return shuffle(arr1);
	}

	// 위 arr1이랑 아래 arr는 직접적으로 연결된게 아님 서로 다른 {}안에 들어가있음
	// 근데 어차피 저 arr자리에 넣을게 arr1뿐이니까 그냥 편하게 arr로 써도 상관없음
	// 동음이의어 느낌이고 아직 덜익숙해서 그런듯
	public int[] shuffle(int[] arr) { // 전달한 배열의 내용을 무작위로 섞는 기능 arr자리에 arr1을 대입
		for (int i = 1; i < 100; i++) {
			int ran = (int) (Math.random() * (arr.length - 1)) + 1;
			int temp = arr[0]; // arr1쓰면 오류남 선언한적 없는 변수임
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		return arr;
	}

	public void print() {
		for (int i = 0; i < answerArr.length; i++) {
			
			switch(answerArr[i]) {
			default :
				System.out.printf("%-2d : [ ] ", i+1);
				break;
			case 2:
				System.out.printf("%-2d : [X] ", i+1);
				break;
			}
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		System.out.println("\n시도 횟수 : " + stabCount);
	}

	// 찌른자리가 0이면 (잘찌름) 0을 2로 바꿈
	public int stab(int num) {
		int index = num - 1;
		
		if(index<0 ||index>=answerArr.length) {
			return -1;
		}
		
		
		int answer = answerArr[index];

		if (answer == 0) {
			answerArr[index] = 2;
		}
		return answer;
	}

	public void play() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			this.print(); // this를 써서 이 클래스 안의 메서드임을 밝힘 지금은 안써도 상관없긴함
			System.out.print("어디 찌를래? ");
			int result = this.stab(sc.nextInt());
			if(result ==0) {
				System.out.println("살았따");
				++stabCount;
			} else if (result ==1) {
				System.out.println("으앙");
				System.out.println(++stabCount + " 회 찌름");
				break;
			} else if(result ==2) {
				System.out.println("이미 찌름");
			} else if(result == -1) {
				System.out.println("범위밖임 다시 ㄱㄱ");
			}
		}
	}
}

//		switch (answer) {
//		case 0: // case는 세미콜론 말고 콜론씀 :::::::::::
//			System.out.println("성공");
//			answerArr[index] = 2; // 2로 바꿨으니 다음에 찌르면 case 2 가 실행됨
//			return 0;
//		case 1:
//			System.out.println("펑");
//			return 1;
//		case 2:
//			System.out.println("이미 찌름");
//			return 2;
//		default: // 기본값을 넣어야 메서드가 만들어짐, 머 대충 범위밖 찌른거로 치면될듯
//			return -1;
