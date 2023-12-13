package quiz;

public class C09_School {

	/*
	 * 1. 이과 국 영 수1 수2 과학
	 * 
	 * 2. 문과 국 영 수1 국사 도덕 세계사
	 * 
	 * 3. 100명의 랜덤학생 생성, 과 점수 이름 모든 내용 랜덤, 학번은 중복없이 생성
	 * 
	 * 4. 성적 출력 메서드를 통해 각 학생의 [학번 이름 과목별점수 총점 평균 등급] 출력
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Under s1 = new Under();
		for (int i = 0; i < 100; i++) {

			s1.grade();

		}

	}
}

class Student {

	int kor;
	int eng;
	int math1;
	int korHis;
	int right;
	int worldHis;
	int math2;
	int sci;
	int studentNum = 1;
	char studentName;

	public int sci() {
		return sci = (int) (Math.random() * 101);
	}

	public int kor() {
		return kor = (int) (Math.random() * 101);
	}

	public int eng() {
		return eng = (int) (Math.random() * 101);
	}

	public int math1() {
		return math1 = (int) (Math.random() * 101);
	}

	public int math2() {
		return math2 = (int) (Math.random() * 101);
	}

	public int korHis() {
		return korHis = (int) (Math.random() * 101);
	}

	public int worldHis() {
		return worldHis = (int) (Math.random() * 101);
	}

	public int right() {
		return right = (int) (Math.random() * 101);
	}

	public char exam2() {
		return (char) ((Math.random() * 25) + 65);
	}

	public int studentType() {
		int type = (int) (Math.random() * 2);
		if (type == 0) {
			return 0; // 문
		} else {
			return 1; // 이
		}

	}

	public boolean scienceType() {
		if (studentType() == 1) {
			return true; // 이과
		} else {
			return false; // 문과
		}
	}
}

class Under extends Student {
	public int typeSum() { // 이과
		if (scienceType()) {
			return kor + eng + math1 + math2 + sci;
		} else {
			return kor + eng + korHis + math1 + right + worldHis;
		}
	}

	public int avg() {
		if (scienceType()) {
			return typeSum() / 5; // 이과
		} else {
			return typeSum() / 6; // 문과
		}
	}

	public void grade() {
		if (scienceType()) {
			System.out.printf("이과 > %d / %s > 국어:%d 영어:%d 수1:%d 수2:%d 과학:%d 총점:%d 평균:%d \n", studentNum++, exam2(),
					kor(), eng(), math1(), math2(), sci(), typeSum(), avg());

		} else {
			System.out.printf("문과 > %d / %s > 국어:%d 영어:%d 수1:%d 국사:%d 윤리:%d 세계사:%d 총점:%d 평균:%d \n", studentNum++,
					exam2(), kor(), eng(), math1(), korHis(), right(), worldHis(), typeSum(), avg());
		}

	}

}
