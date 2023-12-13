package myobj;

public class Student {

	String name;

	static int sid = 0;
	String s_id;
	static int s_count = 0;
	Subject subject;

	public Student() {
		name = NameGenerator.getRandomName();

		// printf()는 콘솔에 출력
		// String.format()은 해당 형식의 문자열을 사용할수있게 반환해줌
		s_id = "EZEN" + String.format("%08d", s_count++); // 앞에 8자리만큼 0채우기 %08d

		int coin = (int) (Math.random() * 2);
		if (coin == 1) {
			subject = new SubScience();
		} else {
			subject = new SubLiberal();
		}
	}

	public void printReportCard() {
		System.out.println(name + "의 성적표[" + s_id + "]");
		System.out.println("총점: " + subject.getTotal());
		System.out.printf("평균: %.2f\n", subject.getAvg());
		System.out.printf("등급: %s\n", subject.getGrade());
		subject.printScores();

	}

}
