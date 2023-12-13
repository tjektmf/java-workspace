package quiz;

public class A02_SwapValue {
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 30);
		int b = (int)(Math.random() * 30);
		
		System.out.println("바꾸기 전 a: " + a);
		System.out.println("바꾸기 전 b: " + b);
		
		// 코드를 추가해 두 변수의 값을 바꿔서 출력
		int c = a; // b에 a를 넣기 전에 변수를 하나 더 만들어 a 값을 저장
		
		a = b;
		
		b = c; // c에 넣어둔 a값을 b에 불러옴
		
		
		System.out.println("바꾼 후 a: " + a);
		System.out.println("바꾼 후 b: " + b);
		
	}

}
