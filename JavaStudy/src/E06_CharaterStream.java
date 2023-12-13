import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E06_CharaterStream {

	/*
	 * # InputStream / OuputStream
	 * 
	 * - byte 단위로 데이터를 입출력하는 클래스, 다소 불편한 점이 있음
	 * 
	 * # Reader / Writer
	 * 
	 * - char 단위로 데이터를 전달하면 클래스에서 byte로 처리해서 스트림으로 전송(Writer)
	 * 
	 * - 스트림으로 읽은 데이터를 전달할 때는 알아서 char로 처리해서 전달함(Reader)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		// 데이터를 문자단위로 다룬다 = Charset을 사용한다
		
		// 똑같은 2진법 데이터라도 해석방식(charset)에 따라 다른 문자가 될 수 있다 
		
		// Charset 종류 : UTF-8, UTF-16, EUC-KR, MS949 ...

		// FileWriter : 문자 단위로 파일에 쓸 수 있는 output
		try {
			FileWriter out = new FileWriter("myfiles/test2.txt", Charset.forName("EUC_KR"));

			// byte 타입으로 변환을 신경쓰지 않고 문자 단위로 데이터를 전송할 수 있다
			out.append('a');
			out.append('b');
			out.append('c');

			out.append("Hello~");
			out.append("헉");

			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader in = null;
		try {
			in = new FileReader("myfiles/test2.txt");

			// .read(char[]) : 전달한 배열 크기만큼 읽음, 읽은 글자의 길이를 반환, 끝에 도달하면 -1 반환

			char[] buff = new char[1024];
			int len = in.read(buff);

			// char[] 로도 문자열 인스턴스 생성가능 byte[] 할때랑 비슷함
			System.out.println(new String(buff, 0, len)); // 러퍼를 0부터 len까지 호출

			// in.read() : 한 문자씩 읽는다 파일에 끝에 도달하면 -1을 반환
//			int ch;
//
//			while ((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// .close()를 finally문에 넣으면 무조건 작동함 그대신 FileReader 선언을 try문 밖에서 해야하고 if문으로 살짝
			// 손봐야함
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
