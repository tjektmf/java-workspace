package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_Save {

	/*
	 * 컴퓨터와 진행하는 가위바위보를 만듬 종료시 전적을 파일에 저장 실행시 전적을 불러옴 이어짐
	 * 
	 */

	static String[] randompick = { "가위", "바위", "보" };

	static int win;
	static int draw;
	static int lose;

	public static int gameStart() {
		Scanner sc = new Scanner(System.in);

		String def = randompick[(int) (Math.random() * 3)];

		System.out.println("가위바위보 뭐낼래");
		String att = sc.next();
		System.out.println("컴퓨터가 낸거 : " + def);
		if (att.equals("가위")) {
			if (def.equals("바위")) {
				return -1;
			} else if (def.equals("보")) {
				return 1;
			} else {
				return 0;
			}

		} else if (att.equals("바위")) {
			if (def.equals("가위")) {
				return 1;
			} else if (def.equals("바위")) {
				return 0;
			} else {
				return -1;
			}
		} else if (att.equals("보")) {
			if (def.equals("가위")) {
				return -1;
			} else if (def.equals("바위")) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}

	public static void load() {
		Scanner sc = new Scanner(System.in);
		System.out.println("전에 하던거 불러올래? Y/N");
		String check = sc.next();
		if (check.equals("N") || check.equals("n")) {
			return;
		}

		try {
			FileInputStream in = new FileInputStream("myfiles/game.txt");

			byte[] readAll = in.readAllBytes();
			// System.out.println(Arrays.toString(readAll));
			// System.out.println(new String(readAll));
			String readAllPlz = new String(readAll);
			in.close();

			String[] real = readAllPlz.split(" ");

			win = Integer.parseInt(real[2]);
			draw = Integer.parseInt(real[5]);
			lose = Integer.parseInt(real[8]);
			System.out.printf("현재 전적 : %d승 %d무 %d패\n", win, draw, lose);
			// System.out.println(Arrays.toString(real));

//			if(readAllPlz.charAt(i)>=0)

			// 승:53 무:33패:37
//			String winOrLose = "\\.\\.(|[0-9]+)\\s\\.\\.(|[0-9]+)\\s\\.\\.(|[0-9]+)\\s";
//			Matcher matcher = Pattern.compile(winOrLose).matcher(new String(readAll));
//			String a = matcher.group(1);
//			win = Integer.parseInt(matcher.group(1));
//			draw = Integer.parseInt(matcher.group(2));
//			lose = Integer.parseInt(matcher.group(3));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public static void main(String[] args) {
		load();

		while (true) {
			int result = gameStart();
			if (result == -1) {
				System.out.println("졌다");
				lose++;
			} else if (result == 0) {
				System.out.println("비겼다");
				draw++;
			} else {
				System.out.println("이겼다");
				win++;
			}

			try {
				FileOutputStream out = new FileOutputStream("myfiles/game.txt");

				System.out.printf("현재 전적 : %d승 %d무 %d패\n", win, draw, lose);
				out.write(("승 : ").getBytes());
				out.write(("" + win).getBytes());
				out.write(' ');
				out.write(("무 : ").getBytes());
				out.write(("" + draw).getBytes());
				out.write(' ');
				out.write(("패 : ").getBytes());
				out.write(("" + lose).getBytes());

				out.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}
