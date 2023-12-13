import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream in = new FileInputStream("myfiles/emails.txt");

			// read() : 한 바이트씩 읽어냄. 마지막에 도달하면 -1 리턴
			int b = in.read(); // int로 해야함

			while ((b = in.read()) != -1) {
				System.out.print((char)b);
			}

			// read(byte[]) : 내가 전달한 배열의 크기만큼 읽어주는 메서드
			// 파일의 마지막 EOF에 도달하면 -1을 리턴함 이걸 while문에 활용할 수 있음
			// 읽은 내용이 있다면 몇 byte를 읽었는지 길이를 리턴함
//			byte[] buffer = new byte[4096];
//			int len = in.read(buffer);
//
//			while ((len = in.read(buffer)) != -1) {
//				System.out.println("유효 길이 : " + len);
//				System.out.println(Arrays.toString(buffer));
//
//				// byte[] 에서 유효한 길이까지만 문자열로 만들 수 있다
//				System.out.println(new String(buffer, 0, len));
//
//			}
			// readAllBytes() : 해당 파일의 모든 데이터를 byte[]로 읽음
			// byte[] allBytes = in.readAllBytes();

			// byte[]도 다시 String으로 바꿀 수 있음
			// System.out.println(Arrays.toString(allBytes));
			// System.out.println(new String(allBytes));
			// String 변환은 String()하면됨 앞에다 (String) 이런거로 강제타입변환 안해도됨
			// 오버라이드 되어있음

			// 다 썼으면 close
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
