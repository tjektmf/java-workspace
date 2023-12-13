import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D13_SimpleDateFormat {

	/*
	 * 
	 * # SimpleDateFormat
	 * 
	 * Date 타입 인스턴스를 서식을 사용해 문자열로 출력할 수 있는 클래스
	 * 
	 * y : 년 
	 * 
	 * M : 월 
	 * 
	 * d : 일 
	 * 
	 * h : 12시 
	 * 
	 * H : 24시 
	 * 
	 * m : 분 
	 * 
	 * s : 초 
	 * 
	 * S : 밀리초 
	 * 
	 * E : 요일 짧 
	 * 
	 * EEEE : 요일 길 
	 * 
	 * a : 오전/오후 
	 * 
	 * z : 타임존
	 * 
	 * 
	 */

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE");

		String result = sdf.format(new Date());
		Calendar now = Calendar.getInstance();
		
		String result2 = sdf.format(new Date());
		
		System.out.println(now.getTime());
		System.out.println(result2);
		now.add(Calendar.DATE, 5000);;
		System.out.println(now.getTime());
		System.out.println(result);

		
	
		
		

//		for (String id : TimeZone.getAvailableIDs()) {
//			System.out.println(id);
//		}
//
//		Calendar newYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
//		System.out.println(newYork.get(Calendar.HOUR_OF_DAY));

	}
}
