import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D08_String {

	public static void main(String[] args) {

		String fruits = "apple/banana/orange/kiwi/blueberry";

		// "".split(delimeter) : 문자열을 원하는 기준으로 잘라서 문자열 배열로 만들어 반환

		String[] fruitArr = fruits.split("/");
		System.out.println(Arrays.toString(fruitArr));

		// String.join(delim, iterable) : 모든 요소를 딜리미터로 붙여 하나의 문자열로 반환
		// iterable : 하나씩 꺼내 쓸 수 있는 모든 것, 배열이나 리스트 셋 등 다됨
		String joinResult = String.join(", ", fruitArr);
		System.out.println(joinResult);

		Set<String> snackSet = new HashSet<>();
		snackSet.add("포카");
		snackSet.add("썬칩");
		snackSet.add("초코파이");
		snackSet.add("초코하임");
		String joinResult2 = String.join("--", snackSet);
		System.out.println(joinResult2);

		// "".contains(CharSeq) : 해당 문자열에 전달한 문자열ㅇ ㅣ포함되어 있는지 확인 t/f
		System.out.println("초코하임".contains("초코"));
		System.out.println("초코파이".contains("초코"));
		System.out.println("화이트하임".contains("초코"));
		System.out.println("====");

		// "".startsWith(CharSeq) : 해당 문자열이 전달한 문자열로 시작하는지 확인
		// "".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 확인

		String url = "http://naver.com";
		System.out.println(url.startsWith("https:"));
		System.out.println(url.startsWith("ftp:"));
		System.out.println("====");
		System.out.println(url.endsWith(".com"));
		System.out.println(url.startsWith(".kr"));

		// "".replace(old, new) : 문자열 내부에서 old를 new로 교체함
		String email = "ds123123@naver.com";
		email.replace("naver", "gmail"); // 기존의 email의 값은 그대로임 바뀌지않음
		String replacedEmail = email.replace("naver", "gmail");
		System.out.println(email);
		System.out.println(replacedEmail);

		// "".substring(index) : 문자열을 index부터 끝까지 자른 후 반환
		System.out.println(email.substring(10));

		// "".substring(beginIndex, endIndex) : A <= x < B 를 반환함
		System.out.println(email.substring(0, 4));

		// "".indexOf("str") : 문자열에서 원하는 문자열의 위치를 찾아 반환, 만약 못찾으면 -1을 리턴
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.charAt(20));
		System.out.println(fruits.indexOf("pineapple"));

		System.out.println("이메일 아이디부분 : " + email.substring(0, email.indexOf('@')));
		System.out.println("이메일 도메인부분 : " + email.substring(email.indexOf('@')+1));
		
		// "".trim() : 문자열 바깥쪽의 공백을 제거 (내부는 제거안함) \t \n space 다 제거
		String pw = "ds";
		String input1 = "     ds  ";
		
		System.out.println(pw.equals(input1));
		System.out.println(pw.equals(input1.trim()));
		
		// "".toUpperCase() : 해당 문자열을 모두 대문자로 변환
		// "".toLowerCase() : 해당 문자열을 모두 소문자로 변환
		String message = "HellO, Java WorlD";
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		
		// String.format(fmt, args) :  서식을 만들어 문자열 생성
	}
}
