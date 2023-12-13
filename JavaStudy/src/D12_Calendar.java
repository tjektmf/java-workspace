	import java.util.Calendar;
import java.util.Date;

public class D12_Calendar {

	/*
	 * # java.util.Calendar
	 * 
	 * 달력을 구현한 클래스로 날짜 및 시간을 쉽게 계산할 수 있는 기능을 가짐
	 * 
	 * 생성자를 사용할 수 없고 getInstance()라는 스태틱 메서드로 현재시간을 받아옴
	 * 
	 */

	public static void main(String[] args) {

		// Calendar now = new Calendar(); // Cannot instantiate the type, 추상클래스라서 생성자
		// 사용불가
		Calendar now = Calendar.getInstance();

		System.out.println(now);

		// get(field) : 해당 캘린더 인스턴스로부터 원하는 항목의 값을 가져옴

		System.out.println(now.get(Calendar.YEAR)); // 지금 2023년임
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(11));

		// MONTH 는 예외로 1 감소된 값으로 나옴
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(Calendar.JANUARY);

		// DAY_OF_WEEK 요일 // 5요일은 목요일 일요일이 1 토요일이 7
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

		// 요일관련 상수
		System.out.println(Calendar.SUNDAY); // 1
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.SATURDAY); // 7

		// calendar.getTIme() 에서 Date 타입 인스턴스 꺼내기
		Date date = now.getTime();
		System.out.println(now.getTime());

		// cal.set(fieldNumber, value) : 캘린더 인스턴스 시간 변경
		// 
		System.out.println();
		System.out.println(now.getTime());
		System.out.println();
		now.set(Calendar.HOUR, 35);
		System.out.println(now.getTime());
		System.out.println();

		// cal.add(fieldNumber, value) : 시간 추가
		// 다른 필드들도 알맞게 수정된다 
		now.add(Calendar.HOUR, 300); 
		System.out.println(now.getTime()); // 위에서 3시간 추가했더니 이렇게됨
		
		// 캘린더의 필드들
		
		now = Calendar.getInstance();
		System.out.println("년 : " + now.get(Calendar.YEAR));
		System.out.println("월 : " + now.get(Calendar.MONTH));
		System.out.println("일 : " + now.get(Calendar.DATE));
		System.out.println("이번달 며칠 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("이번년 며칠 : " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("이번주 며칠(요일) : " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("이번달 몇주 : " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달 몇번째 요일 : " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전/오후 : " + now.get(Calendar.AM_PM));
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("시24 : " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		System.out.println("밀리초 : " + now.get(Calendar.MILLISECOND));


	
	}
}
