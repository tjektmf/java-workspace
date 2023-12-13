import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D14_Time {

	/*
	 * # java.time 패키지
	 * 
	 * - Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스를 모아놓은 패키지
	 * 
	 * - Calendar는 원본 인스턴스를 수정하여 사용하는 방식이고 time 패키지의 인스턴스는 새로운 인스턴스를 반환하는 방식이다
	 * 
	 * # java.time.LocalDate
	 * 
	 * - 날짜만 다루는 클래스
	 * 
	 * # java.time.LocalTime
	 * 
	 * - 시간만 다루는 클래스
	 * 
	 * # java.time.LocalDateTime
	 * 
	 * - 날짜와 시간을 모두 다루는 클래스, 날짜와 시간을 따로 두는게 편한 경우가 있어서 클래스를 이렇게 나눔 Calendar에 비해
	 * 성능좋아짐
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// now() : 현재 시간으로 인스턴스를 생성함

		LocalDate now = LocalDate.now();
		LocalDate captainAmerica = LocalDate.now(ZoneId.of("America/New_York"));

		LocalTime showTime = LocalTime.now();
		LocalTime showTimecaptainAmerica = LocalTime.now(ZoneId.of("America/New_York"));

		LocalDateTime timeIsRunningOut = LocalDateTime.now();
		LocalDateTime timeIsNewyorkOut = LocalDateTime.now(ZoneId.of("America/New_York"));

		System.out.println(now);
		System.out.println(captainAmerica);
		System.out.println();
		System.out.println(showTime);
		System.out.println(showTimecaptainAmerica);
		System.out.println();
		System.out.println(timeIsRunningOut);
		System.out.println(timeIsNewyorkOut);
		System.out.println();

		// of() : 원하는 시점의 인스턴스를 생성, Calendar에는 이 기능이 없어서 현재시간만들고 1년추가하고 그랬음
		LocalDate childrensDay = LocalDate.of(2002, 5, 5);
		LocalTime maTam = LocalTime.of(9, 53, 30);

		LocalDateTime johnDenver = LocalDateTime.of(childrensDay, maTam);
		LocalDateTime westLife = LocalDateTime.of(1945, 8, 15, 2, 30, 36, 3533);

		System.out.println(childrensDay);
		System.out.println(maTam);
		System.out.println(johnDenver);
		System.out.println(westLife);

		// plus() : 해당 시간 인스턴스에 원하는 만큼 더한 새 인스턴스를 반환
		// minus(): 당연히 마이너스도 있음
		// 더한 시간 자체가 바뀌는게 아닌 새 인스턴스를 반환하는거임

		// java.time 패키지 클래스들의 시간 단위는 ChronoUnit 에 상수로 정의되어 있음
		childrensDay.plus(3, ChronoUnit.DAYS);
		System.out.println(childrensDay.plus(3, ChronoUnit.DAYS)); // 3일더한걸 반환
		System.out.println(childrensDay); // 달라지지않음
		System.out.println(childrensDay.plusDays(3)); // 크로노같은ㄱ ㅓ말고 걍 플러스데이쓰면 편함
		System.out.println(childrensDay.plusDays(-3)); // 마이너스안쓰고 걍 플러스데이에 음수넣어도됨

		// ChronoField 클래스에 이것저것 들어있음
		// get() : 원하는 필드값을 꺼낼 수 있음
		// MILLI_OF_DAY : 오늘 시간 전체를 ms로 변환
		// MILLI_OF_SECOND : 현재 ms
		System.out.println(westLife.getLong(ChronoField.MINUTE_OF_DAY));
		System.out.println(westLife.getHour());
		System.out.println(westLife.get(ChronoField.MILLI_OF_DAY));

		// 요일 다루기 / ChronoField 중 하나임

		DayOfWeek dow = now.getDayOfWeek(); // 위에서 현재시간 인스턴스를 now로 만들어놔서 now인거임

		// 요일을 Calendar처럼 int로 다루는게 아니라 클래스로 다루는 이유
		System.out.println(dow);

		// 요일의 이름은 언어별(Locale)로 다르고 길게도 쓰고 Friday 짧게 쓰기도 함 Fri / TextStyle full,short
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN));

		// Month 클래스로 달 다루기
		Month month = now.getMonth();

		System.out.println(month.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println();

		// with() : 원하는 동작으로 시간을 조정한 후 새 인스턴스를 반환
		System.out.println(now.with(ChronoField.DAY_OF_MONTH, 3));
		System.out.println(now); // 새 인스턴스 반환이라 기본 now값은 그대로임
		
		// 미리 정의되어 있는 동작 사용 (TemporalAdjuster)
		// TemporalAdjuster 는 TemporalAdjusters에 모두 상수로 정의되어 있음
		TemporalAdjuster adjuster = TemporalAdjusters.lastDayOfMonth();
		TemporalAdjuster adjuster2 = TemporalAdjusters.firstDayOfNextMonth();
		
		System.out.println(now.with(adjuster)); // 이달의 마지막 날짜가 나옴
		System.out.println(now.with(adjuster2));
		
		// 미리 만들어진 메서드도 있음
		System.out.println(now.withYear(2010)); // 연도만 바꿈
		System.out.println(now.withMonth(5)); // 월만 바꿈
		System.out.println(now.withDayOfYear(50)); // 그 해의 50번째 날, 365까지 가능
		
	}
}
