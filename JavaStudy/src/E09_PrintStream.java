import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E09_PrintStream {

	/*
	 * # PrintStream
	 * 
	 * - 문자를 편리하게 출력할 수 있는 기능을 가진 클래스
	 * 
	 * - println(), printf(), print()
	 * 
	 * - BufferedStream, BufferedWriter > 성능 증가
	 * 
	 * - PrintStream, PrintWriter > 편리함 증가
	 * 
	 */

	public static void main(String[] args) {

		// PrintWriter로 출력
		try (FileWriter fout = new FileWriter(new File("myfiles/test.txt"));
				BufferedWriter bout = new BufferedWriter(fout);
				PrintWriter out = new PrintWriter(bout);) {
			
			out.printf("%s는 %d원 입니다.\n", "사과", 800);
			out.println("hello wold");
			out.println("hello wold2");
	//		out.println("hello wold3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
