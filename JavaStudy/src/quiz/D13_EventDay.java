package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D13_EventDay {

	/*
	 * 실행하면 오늘부터 앞으로 1년간 모든 이벤트 날짜를 출력해주는 프로그램
	 * 
	 * 1+1 : 매월 18일
	 * 
	 * 20퍼할인 : 홀수번째 금요일
	 * 
	 * 겹치면 둘다 알려줌
	 */
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
//		String result = sdf.format(Calendar.g);
//		System.out.println(result);
		int today = 1;
		for (int i = 0; i < 366; i++) {
			now.add(Calendar.DATE, today);
			if (now.get(Calendar.DATE) == 18) {
				if (now.get(Calendar.WEEK_OF_MONTH) % 2 != 0 && now.get(Calendar.DAY_OF_WEEK) == 6) {
					System.out.println(sdf.format(now.getTime()));
					System.out.print(now.get(Calendar.MONTH) + 1 + " 월 " + now.get(Calendar.DATE) + " 일\t");
					System.out.println("1+1 에 20퍼 할인 같이함ㄷㄷㄷ");
				} else {
					System.out.println(sdf.format(now.getTime()));
					System.out.print(now.get(Calendar.MONTH) + 1 + " 월 " + now.get(Calendar.DATE) + " 일\t");
					System.out.println("1+1 행사중");
				}
			} else if(now.get(Calendar.WEEK_OF_MONTH) % 2 != 0 && now.get(Calendar.DAY_OF_WEEK) == 6) {
				System.out.println(sdf.format(now.getTime()));
				System.out.print(now.get(Calendar.MONTH) + 1 + " 월 " + now.get(Calendar.DATE) + " 일\t");
				System.out.println("20퍼 할인 행사중");
			}
	
		}
	}
}
