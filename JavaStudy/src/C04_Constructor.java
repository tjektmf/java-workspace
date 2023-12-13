import myobj.Apple;
import myobj.Phone;
public class C04_Constructor {
	
	/*
	 * 		클래스의 생성자 (Constructor)
	 * 		
	 * 		해당 클래스의 새 인스턴스를 생성할 때 new와 함께 호출하는 것
	 * 
	 * 		해당 클래스 이름과 동일한 이름으로 사용하며 리턴타입은 적지않음
	 * 
	 * 		클래스 내부에 선언한 생성자가 하나도 없는 경우 자동으로 기본생성자를 생성
	 * 
	 */

	public static void main(String[] args) {
		
		Apple a1 = new Apple(300,9,12,"red");
		Apple a2 = new Apple(220,5,7,"yellow");

		
		Apple a3 = new Apple(400, 11,6.8,"blue");
		Apple a4 = new Apple(400);
		a1.info();
		a2.info();
		a3.info();
		a4.info();
		Apple a5 = new Apple(400,50);
		a5.info();
		
		Phone p1 = new Phone("galaxy", 255);
		p1.total();
		
		
		
		
	}
	
}


