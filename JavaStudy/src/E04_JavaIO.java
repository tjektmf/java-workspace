import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E04_JavaIO {
	
	/*
	 * 		# Java I/O (input/output)
	 * 
	 * 		- 자바에서는 스트림이라는 개념을 통해 프로그램의 입출력을 다룸
	 * 
	 * 		- 프로그램으로 데이터가 들어오는 것을 입력(input)이라 하며 나가는 것을 출력(output)이라 함
	 * 
	 * 		# Stream
	 * 
	 * 		- 데이터가 전송되는 통로
	 * 
	 * 		- 프로그램으로 들어오는 통로는 InputStream 나가는 통로는 OutputStream 이라고 함
	 * 
	 * 		- 데이터가 Stream을 통해 전송되려면 byte타입으로 변환되어야함(byte타입이 0과 1로 변환이 쉽기 때문)
	 * 
	 */

	public static void main(String[] args) {
		
		// java.io.FileOutputStream : 파일로 데이터를 내보내기 위한 스트림
		try {
			FileOutputStream out = new FileOutputStream("myfiles/test.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			// "".getBytes() : 해당 문자열을 byte[]로 바꾼 값을 반환
			out.write("Hello, word\n".getBytes());
			out.write("ㅎㅇㅎㅇ".getBytes());
			
			System.out.println("안녕하세요 : " + Arrays.toString("안녕하세요~".getBytes()));
			
			// 다 사용한 스트림은 반드시 수동으로 닫아야함 자바가 시점을 스스로 정하지 못함
			out.close();
			System.out.println("완");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 경로를 찾을 수 없음");
			
		} catch (IOException e) {
			System.out.println("몬ㄱ ㅏ문제가 생김");
			
		}
	}
	
}
