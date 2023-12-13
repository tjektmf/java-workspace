package ans;

import myobj.lotto.LottoGame;
import myobj.lotto.LottoNumber;

public class C04_LottoGame {

	public static void main(String[] args) {

		LottoNumber winNum = new LottoNumber(true);
	//     클래스     변수명  = new     메서드   (메서드의 boolean 값)
	// 타 클래스의 메서드를 불러오기 위해 클래스명을 입력(파란색)
	// 일단 불러왔으면 그 이후 선언한 변수에서 불러온 클래스에 있는 메서드를 사용가능(연두색)

		for (int i = 0; i < 100; i++) {
			LottoNumber guess = new LottoNumber(false);
			winNum.print();
			guess.print();
			int result = guess.check(winNum);
			System.out.println(result);
		}

		new LottoGame().play();
		
	}

}
