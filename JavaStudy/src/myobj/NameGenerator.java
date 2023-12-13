package myobj;

public class NameGenerator {

	static String[] lastNames = { "김", "이", "박", "최", "송", "우", "권", "유", "조" };
	static String[] firstNames = { "철수", "민수", "영희", "뚜비", "나나", "보라" };

	public static String getRandomName() {
		return lastNames[(int) (Math.random() * lastNames.length)]
				+ firstNames[(int) (Math.random() * firstNames.length)];
	}

}
