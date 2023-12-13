import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exam2 {
	static boolean baby = false;
	static boolean handicap = false;
	static boolean sos = false;

	public String whatIsToday() {
		LocalDate now = LocalDate.now();
		DayOfWeek dow = now.getDayOfWeek();
		return dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
	}

	public void honeyPass() {
		int random = (int) (Math.random() * 100) + 1;
		if (random < 6) {
			baby = true;
		} else if (random < 11) {
			handicap = true;
		} else if (random < 16) {
			sos = true;
		}
	}
	

	public String switchTest() {
		switch (whatIsToday()) {
		case "Mon":
			return "1 or 6";
		case "Tue":
			return "2 or 7";
		case "Wed":
			return "3 or 8";
		case "Thur":
			return "4 or 9";
		case "Fri":
			return "5 or 0";
		default:
			return "주말엔 가능";
		}

	}

	public boolean freePass(String carNumber) {
		String lastNumber = "" + carNumber.charAt(carNumber.length() - 1);
		if (whatIsToday().equals("Mon") && (lastNumber.equals("1") || lastNumber.equals("6"))) {
			return true;
		} else if (whatIsToday().equals("Tue") && (lastNumber.equals("2") || lastNumber.equals("7"))) {
			return true;
		} else if (whatIsToday().equals("Wed") && (lastNumber.equals("3") || lastNumber.equals("8"))) {
			return true;
		} else if (whatIsToday().equals("Thur") && (lastNumber.equals("4") || lastNumber.equals("9"))) {
			return true;
		} else if (whatIsToday().equals("Fri") && (lastNumber.equals("5") || lastNumber.equals("0"))) {
			return true;
		} else {
			return false;
		}

	}

	public boolean specialPass() {
		if (baby || handicap || sos) {
			return true;
		} else {
			return false;
		}
	}

	public String makeNumber() {
		String completeNumber = "";

		for (int i = 0; i < 4; i++) {
			int carNum = (int) (Math.random() * 10);
			completeNumber += carNum;
		}

		return completeNumber;
	}

	public String lastMakeNumber(String lockNum) {
		return "" + lockNum.charAt(makeNumber().length() - 1);

	}

	public Exam2() {

	}

	public static void main(String[] args) {
		Exam2 play = new Exam2();
		String lockNum = play.makeNumber();
		System.out.println("랜덤으로 만든 차량 번호 : " + lockNum);
		play.honeyPass();
		System.out.println("장애인 어린이 긴급은 각 5% 확률로 true");

		if (play.freePass(lockNum) || play.specialPass()) {
			System.out.printf("장애인 : %s, 어린이 : %s, 긴급 : %s, 입장 가능한 번호 : %s, 차량 끝자리 : %s / 입장 가능 ", handicap ? "장애인임":"장애인아님", baby ? "애 맞음": "애 아님", sos ? "긴급함":"여유로움",
					play.switchTest(), play.lastMakeNumber(lockNum));
		} else {
			System.out.printf("장애인 : %s, 어린이 : %s, 긴급 : %s, 입장 가능한 번호 : %s,차량 끝자리 : %s / 입장 불가능", handicap ? "장애인임":"장애인아님", baby ? "애 맞음": "애 아님", sos ? "긴급함":"여유로움",
					play.switchTest(), play.lastMakeNumber(lockNum));
		}

	}
}