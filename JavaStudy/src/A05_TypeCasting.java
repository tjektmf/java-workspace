
public class A05_TypeCasting {
	
	public static void main(String[] args) {
		
		/*
		 * 	타입 캐스팅
		 * 
		 * 	데이터의 타입을 강제로 변환
		 * 	데이터나 변수 앞에 (타입)을 적으면 타입이 강제로 변한다
		 * 
		 * 	자동 타입 캐스팅
		 * 
		 * 	작은 타입에서 큰 타입으로 변하는 경우 (byte에서 int로)
		 * 	타입이 변해도 문제가 발생하지 않는 경우
		 * 	값이 손상될 우려가 없음 <<
		 * 
		 * 	강제 타입 캐스팅
		 * 
		 * 	큰 타입의 값을 작은 타입에 넣는 경우 (int에서 byte로)
		 * 	그 외 타입이 변했을 때 기능이 손실될 수 있는 경우
		 * 	값이 손상될 우려가 있어 에러가 뜨는 경우 무조건 손상되는게 아님
		 * 
		 * 	타입의 크기 순서
		 * 	byte(1) < short(2), char(2) < int(4) < long(8) < float(4) < double(8)
		 * 	
		 * 	소숫점 이하를 버리기 때문에 float와 double 타입의 크기가 더 크다
		 * 	작은 타입의 값을 큰 타입 변수에 넣을 때는 문제가 발생하지 않음
		 * 	큰 타입의 값을 작은 타입의 변수에 넣을 때는 문제가 발생
		 * 
		 */
		
		byte b = 127;
		int i = b; // 자동으로 byte 타입이 int 타입으로 변환 
		//int i = (int) b 와 같은 코드인데 int 생략해도 상관없음 int > byte 라서
		
		System.out.println(b); // 작은 타입의 값을 큰 타입에 넣으면 문제없음
		
		int i2 = Integer.MAX_VALUE;
		int in = 127;
		int in2 = 128;
//		byte by = in; byte에 들어갈 수 있는 크기임에도 int에서 byte로 가면 에러
		// 크기는 상관없는게 어차피 128 넣고 캐스팅하면 한바퀴 돌아서 -128로 값이 출력됨
//
		byte by2 = (byte) in2;
//		System.out.println(by); // Type mismatch: cannot convert from int to byte
		System.out.println(by2); //
		
		int i3 = 256;
		byte by3 = (byte) i3;
		System.out.println(by3);
		
		long L1 = 1000000000000L; 
		// long이라고 무조건 뒤에 L 써야하는게 아니라 인트의 범위를 넘을 경우에만 반드시 사용
		int in3 = (int)L1;
		float f3 = L1; // long은 8바이트 float은 4바이트지만 float이 더 큰 것으로 간주
		
		System.out.println(f3);
		System.out.println(in3);
		
		short s1 = 70; // short와 char는 크기는 같지만 short는 음수값도 존재하므로
		// 자동 타입 캐스팅이 일어나지 않음 (char)를 이용해 강제로 바꿔야함
		// 이 반대의 경우도 char의 양수범위가 short보다 크기 때문에 자동 타입캐스팅은 일어나지 않음
		char ch1 = (char) s1;
		System.out.println(ch1);
		
		//	해당 코드의 문자 형태를 보고 싶은 경우 타입 캐스팅을 활용
		int value = 44800;
		
		System.out.println(value);
		System.out.println((char)value); // 꼀 나옴
		

		
	}

}
