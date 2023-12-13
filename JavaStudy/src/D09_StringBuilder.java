
public class D09_StringBuilder {

	/*
	 		$ StringBuilder
	 		
	 		문자열을 조립할 때 쓰는 기능들이 모여있는 클래스로 누적 연산을 통해 문자열을 조립하는 것보다 속도가 훨씬 빠름
	 		
	 		
	 
	 */
	
	
	public static void main(String[] args) {
		// 한번 만들어진 String은 수정이 불가능하기 때문에 String의 수정은 
		// 실제로는 내부에서 새로운 인스턴스를 계속해서 만드는거라 속도가 느림
		
		String str = "";
		
		str += "a"; // new String("a");  
		str += "b"; // new String("b");
		str += "c"; // new String("c");
		System.out.println(str); // ""을 만들고 a를 만들고 ab를 만들고 abc를 만듬 4개의 인스턴스를 만든거임 지금
		
		StringBuilder sb = new StringBuilder(); // "", 빈문자열로 시작함
		
		StringBuilder sb2 = new StringBuilder("ㅎㅇㅎㅇ"); // "" 에 문자열을 넣으면 이걸로 시작함

		
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append(1000);
		sb.append('d');
		sb.append(true); // 모든 타입 가능
		
		// insert(index, value) : 문자열의 원하는 자리에 내용 추가
		sb.insert(1, '@');
		
		// delete(start index, end index) : 원하는 부분을 삭제함, start 이상 end 미만 
		//sb.delete(2, 4); // start 값만 체크 end 값은 넘어가도 ㄱㅊ
		
		sb.reverse(); // 문자열을 반대로 뒤집음 
		
		System.out.println(sb); // 메서드를 통해 하나의 인스턴스에서 추가된거임
		System.out.println(sb.toString());
		
		String result = sb.toString();
		System.out.println("문자열 조립 : " + result);
		
		
		
	}
}
