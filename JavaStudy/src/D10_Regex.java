import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	/*
	 * $ 정규 표현식 (Regular Expression)
	 * 
	 * 문자열이 특정 패턴과 일치하는지 검사할 수 있는 표현식
	 * 
	 * 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙
	 * 
	 * # 자바에서 정규표현식을 활용하기 위한 클래스
	 * 
	 * java.util.regex.Pattern
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// Pattern.matches(regex, text)
		// 해당 문자열이 정규표현식에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));

		// [] : 해당 위치에 들어올 수 있는 문자를 정의하는 정규표현식 문법
		System.out.println(Pattern.matches("s[lh]eep", "sleep")); // 저 자리에 l h 두개 둘다 가능
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "sweep")); // w는 안댐 false
		System.out.println(Pattern.matches("s[lh]e[ea]p", "sheap")); // 두개도 가능

		System.out.println(Pattern.matches("01[01679]-", "010-")); // 폰번호에서 활용
		System.out.println(Pattern.matches("01[01679]-", "017-"));

		// \은 정규표현식 내부에서도 특수한 문법으로 사용되기 때문에 \\\\를 써야함
		// \은 escape문자라 이 문법을 피하려고 2개써서 문자열 \로 나오면 이번엔 정규표현식 문법에 걸려서 \\가 나오게끔 네번써야함
		System.out.println(Pattern.matches("s[abc/\\\\]eep", "s\\eep")); // 뒤는 \\ 두개면됨

		/*
		 * # [] 내부에서 사용하는 문법
		 * 
		 * [abc] : a 또는 b 또는 c를 허용 [a-z] : a 부터 z를 모두 허용 [A-Z] : a부터 Z를 모두 허용
		 * 
		 * [a-zA-Z] : 모든 알파벳 허용 [a-g&&c-p] : 두 조건을 모두 만족하는 문자만 허용
		 */
		System.out.println("======");
		System.out.println(Pattern.matches("[a-z]at", "cat"));
		System.out.println(Pattern.matches("[a-z]at", "fat"));
		System.out.println(Pattern.matches("[a-z]at", "Eat")); // 대문자 컷

		/*
		 * 하나로 여러 문자를 나타내는 문법들
		 * 
		 * . : 모든 문자 허용, [.] 또는 \. 을 사용해야 .만 허용한다는 뜻임
		 * 
		 * \d : 모든 숫자를 허용,
		 * 
		 * \D : 숫자를 제외한 나머지를 모두 허용, 소문자 > 대문자 뒤집는다 이런느낌
		 * 
		 * \s : 모든 공백을 허용 (\t, \n, \r, ' ')
		 * 
		 * \w : 일반적인 문자들을 허용([a-zA-Z0-9_]와 같음
		 * 
		 * \W : \w를 제외한 나머지를 모두 허용
		 * 
		 */
		System.out.println(Pattern.matches(".at", "cat"));
		System.out.println(Pattern.matches(".at", "@at")); // 이거도됨
		System.out.println(Pattern.matches(".at", "Eat"));
		System.out.println(Pattern.matches(".co.kr", "acoakr")); // 점은 주의가 필요함
		System.out.println(Pattern.matches("\\dleven", "1leven"));

		// 숫자하나, 공백하나, 숫자제외암거나 하나, 모든문자 암거나 하나 해서 총 4개
		System.out.println(Pattern.matches("\\d\\s\\D.", "1 zz"));

		/*
		 * # 앞의 패턴을 여러번 적용시키기 위한 문법
		 * 
		 * .{n} : {}앞의 패턴이 n개 일치해야한다
		 * 
		 * .{n,m} : {}앞의 패턴이 n개 이상 m개 이하 일치해야함 여기선 m도 포함임
		 * 
		 * .{n,} : {} 앞의 패턴이 n개 이상 일치해야함
		 * 
		 * .? : ? 앞의 패턴이 0번 또는 한번 나와야함
		 * 
		 * .+ : + 앞의 패턴이 1번 이상 나와야 한다
		 * 
		 * .* : * 앞의 패턴이 0번 이상 나와야 한다 (나오면 안되는걸 체크할 때 사용)
		 * 
		 */

		System.out.println(Pattern.matches("0{3}", "000"));
		System.out.println(Pattern.matches("0{3}\\d", "0005"));
		System.out.println(Pattern.matches("[0-5]{3}\\d", "0005")); // 0~5의 수가 3개 있고 마지막 숫자는 모든 숫자허용(\d)
		System.out.println(Pattern.matches("[0-5]{3}\\d", "6665"));
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "6665"));
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "1265"));
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "118")); // true
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "1118")); // true
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "11118")); // false
		System.out.println(Pattern.matches("[0-5]{2,}\\d", "125")); // true
		System.out.println(Pattern.matches("[0-5]{2,}\\d", "122225")); // true
		System.out.println(Pattern.matches("[0-5]{2,3}\\d", "32155")); // true
		System.out.println(Pattern.matches("ㅇ?", "")); // true 0번
		System.out.println(Pattern.matches("ㅇ?", "ㅇ")); // true 1번
		System.out.println(Pattern.matches("ㅇ?", "ㅇㅇ")); // false 2번
		System.out.println(Pattern.matches("[\\d]{4}", "1234"));

		// 문법을 소괄호()로 묶어서 적용이 가능
		System.out.println("=============");
		System.out.println(Pattern.matches("([a-z]\\d)?", "c9"));

		// 여러개중 하나를 선택
		System.out.println(Pattern.matches("123|456|789", "123")); // true
		System.out.println(Pattern.matches("123|456|789", "456")); // true
		System.out.println(Pattern.matches("123|456|789", "345")); // false
		System.out.println(Pattern.matches("010(-\\d{4}-|\\d{4})\\d{4}", "010-1234-1234"));

		// 1. 해당 문자열이 폰번호인지 체크
		System.out.println("폰번호 : " + Pattern.matches("01[016789](-\\d{3,4}-|\\d{3,4})\\d{4}", "010-1234-7894"));

		// 2. 이메일인지 체크 @한개 도메인길이 63, . 붙여서 사용불가
		System.out.println("이메일 : " + Pattern.matches("\\w[\\w-]*@[\\w-]+(\\.[a-zA-Z]+)*", "abc123@asdf.cc.cc"));
		// [\\w-]는 \\w에 해당하는 문자에 - 까지 나올수 있다는 말

		// 3. IP주소인지 체크 (0.0.0.0) ~ (255.255.255.255)
		System.out.println("아이피 : " + Pattern.matches(
				"((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])",
				"0.05.169.254"));

		System.out.println("==========");
		System.out.println(Pattern.matches("01{1}(0|1|6|7|9)(-\\d{4}-|\\d{4}|-\\d{3}-|\\d{3})\\d{4}", "0192441234")); // true
		System.out.println(Pattern.matches("01{1}(0|1|6|7|9)(-\\d{4}-|\\d{4}|-\\d{3}-|\\d{3})\\d{4}", "010-2445-1234")); // true
		System.out.println(Pattern.matches("(\\w{8,16})@{1}(\\w{1,63})(.{1,63})", "ds010685@naver.co.kr")); // true
		System.out.println(Pattern.matches("(\\w{8,16})@{1}(\\w{1,63}[..]*\\w{1,63})", "ds0106855@@naver..com")); // false
		System.out.println(Pattern.matches(
				"(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])",
				"0.05.169.254")); // true
		System.out.println(Pattern.matches(
				"(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])\\.(2[0-5][0-5]|(|1)(|[0-9])[0-9])",
				"1.10.100.256")); // false

		System.out.println("===================");

		/*
		 * # Matcher
		 * 
		 * - 전체 문자열을 탐색하면서 정규포현식과 매치하는 부분을 찾는 기능을 수행하는 클래스
		 * 
		 * - Pattern 클래스에서 만들어낸 정규표현식 인스턴스를 장착하여 사용
		 * 
		 * - Pattern 클래스는 문자열 정규표현식을 컴파일하여 인스턴스를 생성할 수 있다
		 * 
		 */

		String fruits = "apple/banana/pineapple/blueapple/applemango";

		// 1. 정규표현식을 컴파일, Pattern 인스턴스 생상
		Pattern phonePattern = Pattern.compile("([a-zA-Z]*)(apple)"); // [a-zA-Z]* 이거쓰면 파인애플 블루애플도 찾음

		// 2. pattern 인스턴스에 검사할 문자열을 넣어 matcher 생성
		phonePattern.matcher("apple");
		Matcher matcher = phonePattern.matcher(fruits);

		// 3. 반복문을 통해 패턴과 일치하는 문자열의 위치를 찾는다

		// matcher.find() : 패턴과 일치하는 문자열 찾음
		while (matcher.find()) { // find 는 찾으면 true 못찾으면 false 
			System.out.println("===============");
			System.out.println("이번에 찾은 문자열 : " + matcher.group(2));
			System.out.println("이번에 찾은 문자열 : " + matcher.start());
			System.out.println("이번에 찾은 문자열 : " + matcher.end());
		}
		String[] appleCut = fruits.split("apple");
		System.out.println(Arrays.toString(appleCut)); // 애플이 4개니까 이걸로 자르면 5개됨
		
		
		// 괄호를 이용해 패턴과 일치하는 일부분만 꺼냄
//		System.out.println("group(0)" + matcher.group(0)); // 그룹 0은 전체임
//		System.out.println("group(1)" + matcher.group(1));
//		System.out.println("group(2)" + matcher.group(2));
//		
//		System.out.printf("group(1)의 위치 : %d ~ %d\n", matcher.start(1), matcher.end(1));
//		System.out.printf("group(2)의 위치 : %d ~ %d\n", matcher.start(2), matcher.end(2));
		
	}
}
