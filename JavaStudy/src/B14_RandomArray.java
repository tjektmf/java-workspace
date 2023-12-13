import java.util.Scanner;

public class B14_RandomArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력  :  ");
		String word = sc.next();

		int len = word.length(); // 입력받은 문자열의 길이 1~x
		int[] ranIndex = new int[len]; // 배열 변수 하나 만들어주고

		// 문자열의 길이가 10일때 0~9까지 중복없는 랜덤순서 생성
		for (int i = 0; i < word.length(); ++i) { // 0~x-1까지 이므로 1~x와 개수가 같다
			ranIndex[i] = (int) (Math.random() * len); // 입력받은 문자열의 길이와 같은 개수의 랜덤배열을 만듬 중복이 있을수도있음
			for (int j = 0; j < i; j++) { // j와 i가 같아지면 무조건 중복이 생기므로 j<=i 하면 안됨
				if (ranIndex[i] == ranIndex[j]) {
					--i; // 중복이면 i를 1줄여서 다시 랜덤숫자롤 뽑음
					break;
				}
			}
		}
		for (int i = 0; i < word.length(); i++) { // word의 길이와 ranIndex의 개수는 같음
			System.out.printf("%s", word.charAt(ranIndex[i]));
		}
		System.out.println();
		String input = "strawberry"; // 10글자
		System.out.println(input.length()); // input.length()는 10임
		char[] words = new char[input.length()]; // 배열 총 0~9개
		for (int i = 0; i < input.length(); i++) { // i는 0부터니까 9까지 총 10개로 동일
			words[i] = input.charAt(i);
		}
		for (int i = 0; i < 100; i++) { // word.length는 10이니까 Math.random()*10이면 숫자는 0<= n < 10
			int ran = (int) (Math.random() * (words.length - 1) + 1); // strawberry니까 0~9 랜덤숫자 꺼냄
			// 랜덤 한개를 뽑아서 0번위치랑 바꿀거니까 0번은 나오면안되므로 +1하고
			// 마찬가지로 0번이 나오면 안되니 0~9해서 10개가 아니라 1~9해서 9개가 나와야하므로 word.length-1 = 9
			char temp = words[0];   // 랜덤위치의 글자하나 뽑아서 0번위치의 글자와 바꿈
			words[0] = words[ran]; //  그럼 그 해당자리에 0번에 있던 글자가 들어감 
			words[ran] = temp;		// 뽑는 글자가 랜덤이니 대충 랜덤이라고 봐도될듯
		}
		System.out.println(words);

		int[] abc = new int[5]; // > 0 1 2 3 4 해서 총 5개 5까지가 아니라 5개를 만듬
		int lens = abc.length; // 01234해서 길이는 5, 5개를 만들었으니 길이도 그냥 5임
		System.out.println(lens);
	}

}
