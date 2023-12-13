
public class C06_StaticMethod {
	
		/*
		  	인스턴스 변수(필드, 멤버변수, 인스턴스)
		  	
		  	각 인스턴스마다 다른 값을 가질 수 있는 변수
		  	
		  	인스턴스가 생기기 전에는 사용 불가, new Instance(); 선언없이 사용가능
		  	
		  	인스턴스 메서드(static이 붙지 않은 메서드)
		  	
		  	인스턴스 변수를 활용하여 각 인스턴스마다 다른 결과를 낼 수 있는 메서드
		  	
		  	인스턴스 없이는 사용 불가
		  	
		  	스태틱 변수 (클래스 변수)
		  	
		  	모든 인스턴스에서 사용할 수 있는 변수로 한 클래스에 하나밖에 없음
		  	
		  	인스턴스가 없어도 사용 가능
		  	
		  	스태틱 메서드
		  	
		  	스태틱 변수만 활용할 수 있는 메서드
		  	
		  	인스턴스 변수는 활용할 수 없음
		  	
		  	스태틱 변수만 활용하기 때문에 모든 인스턴스에서 같은 결과가 나옴
		  	
		  	해당 클래스의 인스턴스가 없어도 사용가능
		  	
		 */
	
	public static void main(String[] args) {
		
		Card.height =190; // 인스턴스 없어도 사용가능함 
		Card c1 = new Card('D', 10); // 인스턴스는 여기서 생김
		Card c2 = new Card('H', 5);
		
		c1.shape = 'C';
		c1.width = 80; // c1만 바꿨는데 c2도 같이바뀜
		
		//static 변수는 class에 딸려있어서 클래스에 점찍고 사용가능, 위처럼해도 상관은없음
		Card.width = 80; 
		
		System.out.printf("%c %d\n",c1.shape, c1.num);
		System.out.printf("c1의 너비 : %d\n", c1.width);
		System.out.printf("c1의 높이 : %d\n", c1.height);

		System.out.printf("%c %d\n",c2.shape, c2.num);
		System.out.printf("c1의 너비 : %d\n", c2.width);
		System.out.printf("c1의 높이 : %d\n", c2.height);
		
		
		
	}

}


class Card {
	
	static int width = 100;
	static int height = 200;

	char shape;
	int num;
	
	public Card(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	public static int getAreaSize() { // static 을 안붙여도 되긴함
		return width * height;
	}
}