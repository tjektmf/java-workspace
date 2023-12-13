package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	public static boolean three(int a) { // 2

		if (a % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 이렇게 길게 안쓰고 그냥 return a % 3 == 0; 이거만 써도 됨
	// true 라면 boolean에서 true값이 나올거고 false도 마찬가지로 false값이 나옴
	// 아래 예제도 마찬가지, 굳이 이프문으로 길게 쓸필요 없이 그냥 이프문 자체를 리턴값으로 주면 코드가 짧아짐

	public static boolean alpha(char a) { // 1 boolean 타입 함수는 만들어두면 if문 등 조건으로 사용하기에 편함
		if (a >= 'a' && a <= 'z') {
			return true;
		} else if (a >= 'A' && a >= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static String odd(int a) {// 3

		if (a % 2 == 0) {
			return "짝수입니다";
		} else {
			return "홀수입니다";
		}
	}
	// return num % 2 == 0 ? "짜ㅣㄱ수" : "홀수" ; 삼항연산자 나름 편하게 할수있음 간단한 이프문은 오히려 유용함

	public static boolean prime(int a) { // 5
		int primeStack = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				++primeStack;
			}
		}
		if (primeStack != 1) {
			return false;
		} else {
			return true;
		}
	}

	public static int[] small(int a) { // {}의 범위를 넘어서 a 맘대로 계속 써도됨
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				++count;
			}
		}
		int[] arr = new int[count];
		int index = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				arr[index] = i; // index자리에 index++을 사용해도됨 깰꼼
				++index;
			}
		}
		return arr;
	}

	public static void reply(String a, int b) { // 6
		for (int i = 0; i < b; i++) {
			System.out.println(a);

		}
	}

	public static void main(String[] args) {
		boolean aa;
		aa = three(7);
		System.out.println(aa);
		aa = alpha('a');
		System.out.println(aa);
		System.out.println(odd(155));
		reply("dsfa", 4);
		System.out.println(prime(11));
		small(20);
		System.out.println(small(20));
		System.out.println(Arrays.toString(small(20)));
		
	
		}

	}

