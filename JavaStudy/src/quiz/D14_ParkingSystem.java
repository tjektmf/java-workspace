package quiz;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D14_ParkingSystem {

	public static void main(String[] args) {
		carIn();
		parkingCheck();
		parkingFee();
	}

	static LocalTime nowTime = LocalTime.now();
	static LocalTime start = nowTime;
	static Scanner sc = new Scanner(System.in);
	static String carNumber;
	static boolean enter = false;

	public static void carIn() {
		System.out.println("차번호 입력 :  ");
		carNumber = sc.next();
		enter = true;
	}

	public static LocalTime start() {
		return start;
	}

	public static CharSequence lastNumber() {
		char lastNum = carNumber.charAt(carNumber.length() - 1);
		return "" + lastNum;
	}

	public static void parkingCheck() {

		LocalDate now = LocalDate.now();
		DayOfWeek dow = now.getDayOfWeek(); //
		dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		if (Pattern.matches("[16]", lastNumber())
				&& dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Mon")) {
			System.out.println("월요일엔 뒷자리 1 6 주차가능");
		} else if (Pattern.matches("[27]", lastNumber())
				&& dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Tues")) {
			System.out.println("화요일엔 뒷자리 2 7 주차가능");
		} else if (Pattern.matches("[38]", lastNumber())
				&& dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Wednes")) {
			System.out.println("수요일엔 뒷자리 3 8 주차가능");
		} else if (Pattern.matches("[49]", lastNumber())
				&& dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Thurs")) {
			System.out.println("목요일엔 뒷자리 4 9 주차가능");
		} else if (Pattern.matches("[50]", lastNumber())
				&& dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Fri")) {
			System.out.println("금요일엔 뒷자리 5 0 주차가능");
		} else if (dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Satur")
				|| dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).equals("Sun")) {
			System.out.println("주말엔 프리");
		} else {
			enter = false;
			System.out.println("주차 불가능");
		}
	}

	public static void parkingFee() {

		LocalTime nowTime = LocalTime.now();
		LocalTime fee30Min = start().plusMinutes(30);
		LocalTime fee1Hour = start().plusHours(1);

		int fee = 0;

		if (enter) {
			System.out.println("차량 입장 시간 : " + start());
			System.out.println("차랑 퇴장 시간 : " + nowTime.plusMinutes(180));

		} else {
			System.out.println("너 들어온적 없음");
			return;
		}

		if (start().plusMinutes(30).isBefore(nowTime.plusMinutes(180))) {
			for (int i = 10; i < 40; i += 10) {
				if (fee30Min.plusMinutes(i).isBefore(nowTime.plusMinutes(180))) {
					fee += 200;
				}
			}
			if (start().plusHours(1).isBefore(nowTime.plusMinutes(180))) {
				for (int i = 10; i < 525600; i += 10) {
					if (fee1Hour.plusMinutes(i).isBefore(nowTime.plusMinutes(180))) {
						fee += 300;
					} else {
						break;
					}
				}
			}
			System.out.println("주차요금은 " + fee + "원 입니다");
		} else {
			System.out.println("아직 30분안댐 공짜임~~");
		}
	}
}
