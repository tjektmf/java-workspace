
public class C05_Static {

	/*
	 * static (정적 영역, 클래스 영역)
	 * 
	 * 인스턴스 영역과 대조되는 개념 같은 클래스로 만들어진 모든 인스턴스들이 함께 사용하는 공동 영역 앞에 static이 있는 변수나 메서드는
	 * 모든 인스턴스들이 다같이 사용함
	 * 
	 * 고정 영역을 만들어 다같이 쓴다 이런느낌
	 * 
	 */

	public static void main(String[] args) { // 메인은 각 파일당 하나니까 static

		// 객체를 100개 담을 수 있는 배열 생성
		Wall[] walls = new Wall[100];

		// new 로 실체를 만들어 배열에 담음
		for (int i = 0; i < walls.length; i++) {
			walls[i] = new Wall();
		}
	}
}

class Wall {
	// 생성된 모든 벽에서 동일한 값에 static
	static int def;
	static int maxHp;
	// 벽마다 다른 값
	int hp;
	int x;
	int y;
}


class Coffee { // 클래스 첫문자는 대문자
	static int maxVolume;
	int volume;
	String name;
	int price;
}

class Earth {
	static int gravity;
	int time;
	String ocean;
	String continent;
}