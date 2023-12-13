package ans;

import java.util.HashSet;

public class D04_isJavaVariable {

	static HashSet<String> reservedKeywords = new HashSet<>();
	static String[] kws = { "abstract", "continue", "for", "new", "switch", "assert", "default", "if", "package",
			"synchronized", "boolean", "do", "goto", "private", "this", "break", "double", "implements", "protected",
			"throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
			"catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class",
			"finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while",
			// literals
			"null", "true", "false" };
	static { // 위의 kws 배열의 모든 내용을 kw에 추가
		for (String kw : kws) {
			reservedKeywords.add(kw);
		}
	}

	boolean checkVarName(String varName) {
		if (reservedKeywords.contains(varName)) {
			System.out.println("자바 예약어 사용불가");
			return false;
		}

		if (Character.isJavaIdentifierStart(varName.charAt(0))) {
			for (int i = 1; i < varName.length(); i++) {
				char ch = varName.charAt(i);
				if (!Character.isJavaIdentifierPart(ch)) {
					System.out.printf("%d번째 문자 %c 사용불가\n", i + 1, ch);
					return false;
				}
			}
			return true;
		} else {
			System.out.printf("첫번째 문자 %s 사용불가\n", varName.charAt(0));
			return false;
		}
	}

	public static void main(String[] args) {

		D04_isJavaVariable quiz = new D04_isJavaVariable();
		System.out.println(quiz.checkVarName("aaa"));
		System.out.println(quiz.checkVarName("7aaa"));
		System.out.println(quiz.checkVarName("a$$&$^*%#^#%aa"));
		System.out.println(quiz.checkVarName("int"));
		System.out.println(quiz.checkVarName("_jkkljv"));
	}
}
