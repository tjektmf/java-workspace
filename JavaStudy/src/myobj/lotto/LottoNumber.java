package myobj.lotto;

import java.util.Arrays;

public class LottoNumber {

	// 해당 메서드에서 this. 를 사용할 예정이면 static 사용하지않음

	// 당첨 번호는 7개, 뽑는 번호는 6개
	int[] numbers; // 여기서 선언한 numbers를 여기저기서 사용
	
	public LottoNumber(int[] numbers) { // int[]를 전달하며 인스턴스가 생성됨
		this.numbers = numbers;
	}

	public LottoNumber(boolean winNum) { // 위에꺼랑 오버로딩 타입다른거 두개써서 활용가능

		if (winNum) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}
		generate();
	}
	public int getRandomNumber() { // static 안써도됨
		return (int) (Math.random() * 45 + 1);
	}
	// 현재 인스턴스의 numbers 배열을 중복없는 랜덤숫자로 채움
	public void generate() {
		int len = numbers.length; // 배열은 length뒤에 ()안씀
		for (int i = 0; i < len; i++) {
			numbers[i] = getRandomNumber();
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					--i;
					break; // 중복이 하나라도 있으면 멈춤
				}
			}
		}
	}
	// 당첨번호 인스턴스를 전달받으면 몇 등인지 리턴해줌
	public int check(LottoNumber winNum) { // 타입 자체가 LottoNumber임
		int winLen = winNum.numbers.length;
		int guessLen = this.numbers.length;

		int winCount = 0;
		boolean hasBonus = false;

		if (winLen != 7) {
			return -1;
		}

		for (int i = 0; i < guessLen; i++) {

			for (int j = 0; j < winLen; j++) {

				if (this.numbers[i] == winNum.numbers[j]) {
					++winCount;

					// 마지막 7번째 번호와 일치하면 보너스번호를 맞춘거라 2등임
					if (!hasBonus && j == winLen - 1) {
						hasBonus = true;
					}
					break;
				}
			}
		}
		if (winCount == 6) {
			if (hasBonus) {
				return 2;
			} else {
				return 1;
			}
		}
		winCount = hasBonus ? winCount - 1 : winCount;
		if (winCount == 5) {
			return 3;
		} else if (winCount == 4) {
			return 4;
		} else if (winCount == 3) {
			return 5;
		} else {
			return 0; // 당첨안댐
		}
	}

	public void print() {
		System.out.println(Arrays.toString(numbers));
	}
	
}
