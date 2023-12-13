package myobj.parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cars {

	final private static String[] carTypes = { "장애인", "유아동승", "일반", "화물차", "경차", "중형", "대형", "소형" };

	final static String symbols = "가나다라마바사아자하허호";

	private static LocalDateTime getRandomExTime() {
		return LocalDateTime.now().plus((int) (Math.random() * 500), ChronoUnit.MINUTES);
	}

	private static String getRandomCarType() {
		return carTypes[(int) (Math.random() * carTypes.length)];
	}

	private static String getRandomCarNumber() {
		StringBuilder carNum = new StringBuilder();

		// 1~999
		carNum.append(String.format("%02d", (int) (Math.random() * 999 + 1)));
		carNum.append(symbols.charAt((int) (Math.random() * symbols.length())));
		// 101~9999
		carNum.append(String.format("%04d", (int) (Math.random() * 9899 + 101)));
		return carNum.toString();

	}

	public static Car getRandomCar() {
		return new Car(getRandomCarNumber(), getRandomCarType(), LocalDateTime.now(), getRandomExTime());

	}
}
