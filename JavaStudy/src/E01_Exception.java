import java.util.Scanner;

public class E01_Exception {

	/*
	 * # 예외 (Exeption)
	 * 
	 * - 프로그램 실행 도중 문제가 생기는 에러를 예외라고 부름(빨간 밑줄)
	 * 
	 * - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러임, 컴파일 에러 발생시 아예 실행이 되지 않음
	 * 
	 * - 발생할 수 있는 예외를 미리 예상하여 대비할 수 있다
	 * 
	 * # 예외처리 (try-catch-finally)
	 * 
	 * - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
	 * 
	 * - try문 내부에서 예외가 발생하지 않으면 평소대로 정상 작동한다
	 * 
	 * - try문 내부에서 예외가 발생하면 즉시 try문을 중단하고 발생한 예외에 해당하는 catch문으로 이동한다
	 * 
	 * - 예외 처리의 기본 동작은 에러 발생 당시 상황을 콘솔에 출력하고 프로그램을 강제종료하는 하는거임
	 * 
	 * - System.exit();, return;
	 * 
	 * - finally문은 try문 내부에서 예외 발생 여부와 상관없이 무조건 실행함
	 * 
	 */

	public static void main(String[] args) {

		// ant a; ant가 아니라 int임 자바 문법이 틀려서 실행자체가 안됨 - 컴파일 에러
		int[] arr = new int[10];
		// System.out.println(arr[10]); 실행은 되는데 배열인덱스는 9가 끝임 - 예외

		try {
			System.out.println("1 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("2 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("3 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("4 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("5 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("6 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("7 : " + arr[(int) (Math.random() * 11)]);
			System.out.println("8 : " + arr[(int) (Math.random() * 11)]);

			Scanner sc = new Scanner(System.in);
			
		
			System.out.println("자연수 입력ㄱㄱ");
			int value = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) { // 배열크기 초과 예외
			System.out.println("예외가 발생함");
			// 예외 객체에 담겨있는 당시의 상황을 콘솔에 출력
			// 예외 처리의 기본 동작
			e.printStackTrace(); 
		} catch(java.util.InputMismatchException e) { // 인풋 불일치 예외
			System.out.println("자연수요 자연수");
			System.out.println("아 걍꺼버림");
			// System.exit(0); // 프로그램 종료, finally 출력안댐
			return; // 메인 메서드를 종료, finally 출력됨
		} finally {
			System.out.println(" 퇴끼");
			System.out.println(" 퇴끼");	
		}
		System.out.println("프로그램 정상종료");

	}
}
