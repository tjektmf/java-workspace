import java.util.Date;

public class D11_Date {

	/*
	  	$ java.util.Date
	  	
	  	시간 및 날짜 정보를 저장할 수 있는 클래스
	  	
	  	오래된 클래스이기 때문에 데이터를 보관하는 용도로만 사용하고 메서드는 잘 사용하지 않음
	  	
	  	
	 */
	
	
	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		
		// Long 타입으로 Unix time을 넣어서 시간을 생성할 수도 있음
		Date time1 = new Date(1000L); // 1000이 1초임, 1은 1밀리초
		Date time2 = new Date(1000000L);
		System.out.println(time1);
		System.out.println(time2);
		
		
		/*
		  	# System.currentTimeMillis()
		  	
		  	- 시스템으로부터 현재 유닉스 타임을 받아오는 메서드
		  	Unix Time - 1970년 1월 1일부터 지금까지 몇 밀리초가 지났는지 센 숫자
		 
		 */
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println("타임1이 타임2보다 더 뒤임 "+ time1.after(time2));
		System.out.println("타임1이 타임2보다 더 앞임 "+ time1.before(time2));
		
	}
	
}
