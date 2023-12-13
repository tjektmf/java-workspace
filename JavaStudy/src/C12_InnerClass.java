
public class C12_InnerClass {

	/*
	 * # 클래스 내부에도 클래스를 만들 수 있음
	 * 
	 * - 인스턴스가 생성되어야 실체가 있는 설계도
	 * 
	 * - 클래스 내부의 클래스는 상위 클래스의 인스턴스가 보유한 값에 영향을 받아 달라지는 클래스를 설계할 수 있는 장점이 있다
	 * 
	 * # 클래스 내부의 스태틱 클래스
	 * 
	 * - 인스턴스의 영향을 받지 않는 내부 클래스를 생성할 수 있다
	 * 
	 * - 스태틱 변수에는 영향을 받는다
	 */

	int a = 10;

	class Bus {
		int num;
		int fee;

	}

	static class Subway {
		int num2;
	}

	public static void main(String[] args) {

		C12_InnerClass instance = new C12_InnerClass(); // main 상관없이 다른 class에서 불러오듯 불러오면됨
		System.out.println(instance.a); // aa가 인스턴트임

		// inner class는 인스턴스가 있어야 사용가능함
		C12_InnerClass.Bus bos = instance.new Bus();
		// 클래스 안의 클래스(inner class)를 사용하려면 상위 클래스의 인스턴스가 필요

		C12_InnerClass.Subway subway = new C12_InnerClass.Subway();
		// static 클래스는 인스턴스 없이 사용가능
		
		
		TransportMaker maker = new TransportMaker(2000);
		System.out.println(maker.makeBus(500));
		
		maker.defaultFee = 3000;
		System.out.println(maker.makeBus(500));

	}
}

class TransportMaker {
	int defaultFee;

	class Bus {
		int fee;
		int num;

		public Bus(int num) {
			this.num = num;
			fee = defaultFee;
		}
		@Override
		public String toString() {
			return String.format("%d번 버스의 요금은 %d원 입니다\n",num, fee);
		}

	}

	public TransportMaker(int defaultFee) {
		this.defaultFee = defaultFee;
	}
	public Bus makeBus(int num) {
		return new Bus(num);
	}
}




