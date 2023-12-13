import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class E08_BufferedStream {

	/*
	 * # Bufferd (버퍼)
	 * 
	 * - 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송함
	 * 
	 * - BufferdReader/Writer : 버퍼를 사용하고 문자단위로 데이터를 입출력
	 * 
	 * - BufferdInputStream / OutputStream : 바이트 단위로 데이터를 입출력
	 * 
	 */

	public static void main(String[] args) {

		File f = new File("myfiles/emails.txt");

		// try 안에서 열면 알아서 닫아줌 in.close();
		try (FileReader fin = new FileReader(f); 
			 BufferedReader in = new BufferedReader(fin);) {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		new BufferedInputStream();
//		new BufferedWriter();
//		new BufferedOutputStream();
		
		// System.in은 inputStream이기 때문에 콘솔에서 발생한 입력을 byte단위로 받음
		BufferedInputStream in = new BufferedInputStream(System.in);
		try {
			System.out.print(">>");
			int data = in.read(); // 여기서 입력받음
			System.out.println(data);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 바이트 단위의 inputStream을 문자단위로 조립해주는 중간클래스
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			System.out.println("isr : ");
			int ch = isr.read(); // 여기서 입력받음
			System.out.println((char)ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 콘솔의 내용을 문자로 다루면서 한 줄씩 입력받기위해 BufferedReader로 업글해서 사용
		BufferedReader bin = new BufferedReader(isr);
		try {
			System.out.println("buffered : ");
			String line = bin.readLine();
			System.out.println(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 버퍼리더를 쓰려면 파일리더가 선행되어야하고 한줄씩 읽으므로 String타입으로 readLine()을 이용함
		// 

	}

}
