
public class A01_Escape {

	/* 
	 * # Escape 문자
	 * 
	 * '\'와 합쳐져서 특수한 기능을 하는 문자
	 * 그냥 사용하면 문제가 생기는 문자를 표현하기 위해 사용
	 * \와 문자를 합쳐서 두 문자로 보이지만 하나의 문자로 인식됨
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("ㅎㅇ반갑");
		System.out.println("ㅎㅇ\n반갑"); // '\n'로 줄바꿈 따로 ""지정안해줘도됨 그냥 엔터치면 "ㅎㅇ" + "반갑" 형태로 바뀜
										// \n 하니까 뭔가 line 이랑 비슷함 그래서 \n이 줄바꾸는거임
		System.out.println("ㅎ\t" + 2);
		System.out.println("ㅂㅇㅂㅇ\t" + 2); // '\t' 탭키인데 간격맞춰줌 다른사람이 이해하기 쉬움
		
		System.out.println("\\"); // 그냥 \를 출력할 때 '\\' 두개를 씀 그럼 한개만 나옴
		System.out.println("C:\\Program Files\\java\\jkzz"); // 이렇게 \\로 두개를 사용하면 \한개만 출력됨
		
		System.out.println("서\"다\"슬"); // 그냥 " 를 출력할 때 \"를 사용함  "
		
		System.out.println("서'다'슬"); // "" 사이에서 '를 사용하는건 문제가 없음
		System.out.println('\''); // ''를 이용해 '를 나타내려고 할때 문제가 생기므로 \' 사용 
		
		
		
		
		
	}
}
