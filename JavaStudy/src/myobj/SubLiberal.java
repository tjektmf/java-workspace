package myobj;

public class SubLiberal extends Subject {

	// 문과 국 영 수1 국사 도덕 세계사

	int kor;
	int eng;
	int math1;
	int koreaHistory;
	int right;
	int worldHistory;

	static int getRandomScore() {
		return (int) (Math.random() * 101);
	}

	public SubLiberal() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		koreaHistory = getRandomScore();
		right = getRandomScore();
		worldHistory = getRandomScore();
	}

	@Override
	public double getAvg() {
		return getTotal() / 6;
	}

	@Override
	public String getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

	@Override
	public int getTotal() {
		return kor + eng + math1 + koreaHistory + right + worldHistory;
	}

	@Override
	public void printScores() {
		System.out.println("국어\t영어\t수1\t국사\t도덕\t세계사");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math1, koreaHistory, right, worldHistory);
	}

}
