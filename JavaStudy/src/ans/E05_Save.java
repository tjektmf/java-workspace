package ans;

import myobj.rps.RpsGame;

public class E05_Save {

	public static void main(String[] args) {

//		byte b1 = -33;
//
//		// byte 타입의 부호가 고정되는 것을 막기 위해 0xFF를 &연산해 int 타입 숫자로 바꿈
//		System.out.println(b1 & 0xFF);

		RpsGame game = new RpsGame();
		for (int i = 0; i < 100; i++) {
			game.fight((int) (Math.random() * 3));
		}
		
		game.save();

	}

}
