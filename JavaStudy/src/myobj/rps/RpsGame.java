package myobj.rps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RpsGame {

	final private static String[] SHAPE_LABELS = { "바위", "가위", "보" };
	final public static int ROCK = 0;
	final public static int SCISSORS = 1;
	final public static int PAPER = 2;

	int win;
	int draw;
	int lose;

	public RpsGame() {
		// 파일에서 꺼내서 win draw lose를 채움
		try {
			FileInputStream in = new FileInputStream("myfiles/record.sav");

			byte[] arr = new byte[4]; // 인트1개가 바이트배열 4개임
			int len;

			in.read(arr);// .read()는 더이상 값ㅇ ㅣ없으면 -1을 리턴함
			win = byteArrayToInt(arr);

			in.read(arr);
			draw = byteArrayToInt(arr);

			in.read(arr);
			lose = byteArrayToInt(arr);

//			win = (in.read() << 24);
//			win += (in.read() << 16);
//			win += (in.read() << 8);
//			win += in.read();
//
//			draw = (in.read() << 24);
//			draw += (in.read() << 16);
//			draw += (in.read() << 8);
//			draw += in.read();
//
//			lose = (in.read() << 24);
//			lose += (in.read() << 16);
//			lose += (in.read() << 8);
//			lose += in.read();

			in.close(); // inputStream 예외처리 후 이거부터 써서 예외처리 하고 시작함 나중에하면 까먹음
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fight(int shape) {
		int userShape = shape;
		int comShape = (int) (Math.random() * 3);

		System.out.println("YOU\tCOM");
		System.out.printf("%s\t%s\n", SHAPE_LABELS[userShape], SHAPE_LABELS[comShape]);
		if ((userShape + 1) % 3 == comShape) {
			System.out.println("사용자가 이김");
			win++;

		} else if ((comShape + 1) % 3 == userShape) {
			System.out.println("컴퓨터가 이김");
			lose++;

		} else {
			System.out.println("무승부");
			draw++;
		}
		System.out.printf("%d승 %d무 %d패\n", win, draw, lose);

	}

	final public static int byteArrayToInt(byte[] bytes) {

		int value = 0;

		value |= bytes[0] << 24;
		value |= (bytes[1] & 0xFF) << 16;
		value |= (bytes[2] & 0xFF) << 8;
		value |= (bytes[3] & 0xFF);
//		int value = (arr[0] << 24);
//		value += (arr[1] << 16);
//		value += (arr[2] << 8);
//		value += arr[3];

		return value;

	}

	public static final byte[] intToByteArray(int value) {

		// 255 (0000 0000 / 0000 0000 / 0000 0000 / 1111 1111)
		// byte[]로는 {0, 0, 0, -128}
		// 인트 하나를 바이트 4개로 쪼개는 방법
		return new byte[] { (byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8), (byte) (value) };
	}

	// 파일에 현재 전적을 기록
	public void save() {

		try {
			FileOutputStream out = new FileOutputStream("myfiles/record.sav"); // 꼭 text일 필요는 없음

			out.write(intToByteArray(win));
			out.write(intToByteArray(draw));
			out.write(intToByteArray(lose));

			out.close(); // 일단이거먼저 쓰고 예외처리
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
