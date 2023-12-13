package ans;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_EventDay {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance(); // time은 now()
//		Calendar target = Calendar.getInstance();

//		target.add(Calendar.YEAR, 1);

		SimpleDateFormat eventDayFormat = new SimpleDateFormat("yyyy-MM-dd(E)");
		eventDayFormat.format(today.getTime()); // 이건 굳이 안써도됨 
		
		
		
//		while (today.before(target)) {


			for (int i = 0; i < 366; i++) {
				today.add(Calendar.DATE, 1);
				int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
				int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
				int dayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
				if (dayOfMonth == 18 && dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
					System.out.printf("%s\n", eventDayFormat.format(today.getTime()));
					System.out.println("[NOTICE] 1+1, 20퍼 할인 이벤트 행사");
				} else if (dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
					System.out.printf("%s\n", eventDayFormat.format(today.getTime()));
					System.out.println("20퍼 할인");
				} else if (dayOfMonth == 18) {
					System.out.printf("%s\n", eventDayFormat.format(today.getTime()));
					System.out.println("1+1 이벤트 행사");
				}
			}
//		}
	}
}
