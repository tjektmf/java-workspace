package quiz;

import myobj.Game369;

public class C04_369game {

	/*
		 컴터와 번갈아가면서 진행하는 369겜
		 컴터랑 1:1, 선공은 랜덤으로 결정
	 
	 */
	
	//
	
	
	
	public static void main(String[] args) {
		
	// 외부 클래스(369Game)에서 Game369클래스의 메서드를 호출하려면 Game369의 객체를 생성 
		Game369 gameStart = new Game369(); 
		new Game369().game();

		
		
	}
}
