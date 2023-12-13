package myobj;

public class SubScience extends Subject {

	int kor;
	int eng;
	int math1;
	int math2;
	int science;

	static int getRandomScore() {
		return (int) (Math.random() * 101);
	}

	public SubScience() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		math2 = getRandomScore();
		science = getRandomScore();
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
	public double getAvg() {
		return getTotal() / 5.0;
	}

	@Override
	public int getTotal() {
		return (kor + eng + math1 + math2 + science);
	}

	@Override
	public void printScores() {
		System.out.println("국어\t영어\t수1\t수2\t과학");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", kor, eng, math1, math2, science);
	}

}
