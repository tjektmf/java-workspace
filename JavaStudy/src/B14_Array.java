
public class B14_Array {
	
	public static void main(String[] args) {
		
		/*
		 * 		배열
		 * 
		 * 		같은 타입 변수를 여러개 선언하고 싶을 때 사용하는 문법
		 * 		배열을 선언할 때 선언과 동시에 배열의 크기를 정해야 한다
		 * 		배열은 각 변수를 방 번호(index)를 통해 구분함
		 * 		배열의 index는 0번부터 개수 -1까지 있음 (charAt 비슷)
		 * 		일단 만들어지면 이후 크기변경이 불가능함
		 * 		변수와는 다르게 각 방의 모든 값이 초기화되어있음
		 * 		정수 0, 실수 0.0, boolean false, 참조형 null
		 * 		
		 * 		배열 선언 방식
		 * 		
		 * 		1. 타입[] 변수명 = new 타입[크기];
		 * 		2. 타입[] 변수명 = {값1, 값2, 값3, 값4, ... };
		 * 		3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, ... };
		 * 		
		 */
		
		
		double[] weights = new double[30];
		System.out.println(weights[15]);  // 16번째 값, 초기화하지않았지만 0.0이 나옴 일반 변수와 다른점
		
		//대문자로 시작하는 타입은 null로 초기화되어있음
		char[] message = {'H', 'e', 'l', 'l', ' ', 'w'};
		//char[] 는 하나의 문자열이라고 간주할 수 있음
		String[] schools = new String[12];
		System.out.println(schools[5]); // null 나옴
		
		String[] names = {"dd", "ddd", "dddd", "ddddd"};
		float[] heights = {123.12f , 66.66f, 151.34f};
		boolean[] passExam = new boolean[] {true, false, true};
		
		
		
		int [] numbers = new int[1000]; // int타입 변수 1000개 선언(배열 선언)
		//배열의 한 방에 변수 저장하기
		numbers[0] = 10; // int타입 변수 1000개 중 몇 번 변수를 사용할 것인지 선택 가능
		numbers[399] = 8500;
		numbers[999] = -999; // 얘가 마지막임
		//numbers[1000] = 10;
		//배열 방 번호의 범위를 벗어나는 실수는 컴파일러에서 감지하지 못함(빨간줄안나옴)
		//실행시 Array뭐시기 에러뜸
		//배열에 저장되어 있는 값을 꺼내 사용
		System.out.println(numbers[999]);
		System.out.println(numbers[0]+numbers[399]);
		System.out.println("아직 값을 넣지 않음 : " + numbers[30]);
		
		// 반복문으로 배열을 쉽게 사용가능
		// 배열.length : 해당배열 길이알수있음, ()붙이면 안됨
		// "".length() : 문자열의 길이를 알때는 ()를 붙임
		
		for(int i = 0; i < names.length;i++) {
			System.out.println(names[i]);
		}

		String[] fruits = {"apple", "바나나", "orange", "호박"};
		
		for(int i = 0; i < fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
