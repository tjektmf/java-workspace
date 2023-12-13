import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator {

	/*
	 * $ Comparable
	 * 
	 * 이 인터페이스를 구현한 클래스는 크기 비교가 가능함
	 * 
	 * $ Comparator
	 * 
	 * 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
	 * 
	 */

	static int compareGrade(String g1, String g2) {
		char firstCh1 = g1.charAt(0);
		char firstCh2 = g2.charAt(0);

		if (firstCh1 == firstCh2) {

			int len1 = g1.length();
			int len2 = g2.length();

			if (len1 == len2) {
				return 0;
			} else if (len1 > len2) {
				return 1;
			} else {
				return -1;
			}
		} else if (firstCh1 > firstCh2) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		System.out.println();

		Grape g1 = new Grape(3300, 20, 5, "포도밭", 1);
		Grape g2 = new Grape(5800, 35, 10, "포도나무", 3);

		System.out.println(g1.compareTo(g2)); // 객체의 크기가 같아 0이 나옴 g2가 5800으로 더 크니 -1나옴

		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 99, 1, 88, 8, 13, 5, 78, 24);
		Collections.sort(numbers);
		System.out.println(numbers);

//		peaches.add(new Peach());
//		peaches.add(new Peach());
//
//		리스트 정렬을 하기 위해서는 리스트의 내용물이 크기 비교의 기준이 있는 객체여야함
//		Integer의 경우 정수니까 걍 큰게 큰거고 작은게 작은거임 기준있음, 실제로 구현도 되어야ㅣㅆ음
//		Collections.sort(peaches);

		List<Grape> grapes = new ArrayList<>();

		grapes.add(new Grape(3300, 22, 5, "자연은", 1));
		grapes.add(new Grape(2500, 25, 7, "델몬트", 4));
		grapes.add(new Grape(6800, 30, 8, "가야", 3));
		grapes.add(new Grape(8100, 33, 4, "웰치스", 2));
		grapes.add(new Grape(4700, 38, 9, "환타", 5));

		// Comparable 인터페이스가 구현된 클래스만 sort가 가능함
		Collections.sort(grapes);
		Collections.sort(grapes, new GrapeFarmNameComparator());
		Collections.reverse(grapes);

		System.out.println(grapes);

		System.out.println("====================");

		List<Peach> peaches = new ArrayList<>();

		// 익명 내부 지역 클래스로 Comparator 상속받아 만들기

		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				int result1 = o1.farm.compareTo(o2.farm);
				if (result1 == 0) {
					return compareGrade(o2.grade, o1.grade);
				} else {
					return result1;
				}
			}
		});
		Comparator<Peach> myComparator1 = new Comparator<>() {
			// 걍 대충한번쓰고 버릴 인스턴스

			@Override
			public int compare(Peach o1, Peach o2) {

				String g1 = o1.grade;
				String g2 = o2.grade;

				int result1 = compareGrade(o1.grade, o2.grade);

				if (result1 == 0) {
					return Integer.compare(o2.price, o1.price);
				} else {
					return result1;
				}
//				char firstCh1 = g1.charAt(0);
//				char firstCh2 = g2.charAt(0);
//
//				if (firstCh1 == firstCh2) {
//					// 앞의 등급이 같으면 뒤 +까지 비교
//					int len1 = g1.length();
//					int len2 = g2.length();
//
//					if (len1 == len2) { // 등급이 같으니 추가로 가격을 비교
//						return Integer.compare(o2.price, o1.price); // 이미 만들어져있는 compare 사용함
//						// 정수의 크기비교는 그냥 비교하면됨 이미 다 만들어져있음
//						// Integer, Double, String의 크기비교는 이미 다 만들어져있음 걍 컴페어 박으면댐
//					} else if (len1 > len2) {
//						return 1;
//					} else {
//						return -1;
//					}
//				} else if (firstCh1 > firstCh2) {
//					return -1;
//				} else {
//					return 1;
//				}
			}
		};

		peaches.add(new Peach(200, "D", 12, "네팔"));
		peaches.add(new Peach(120, "B+", 21, "스위스"));
		peaches.add(new Peach(150, "C+", 18, "알프스"));
		peaches.add(new Peach(150, "B+", 18, "알프스"));
		peaches.add(new Peach(150, "C", 18, "황도"));
		peaches.add(new Peach(100, "A", 27, "황도"));
		peaches.add(new Peach(180, "D", 82, "알프스"));
		peaches.add(new Peach(300, "D+", 82, "네팔"));

		Collections.sort(peaches); // sort는 기본적으로 더 큰걸 뒤로보내고 작은걸 앞으로 보냄 즉 오름차순이 기본임
		Collections.reverse(peaches); // 2번
		System.out.println(peaches); // 2번 무게 내림차순

		Collections.sort(peaches, new PeachInfo()); // 4번 농장이름 오름차순 , 같으면 등급기준 오름차순
		System.out.println(peaches); // 4번 농장 오름차순 등급 오름차순

		Collections.sort(peaches, new PeachInfo2()); // 3번 등급기준으로 오름차순 , 같으면 가격기준 내림차순
		System.out.println(peaches); // 3번 농장 오름차순 등급 오름차순
	}
}

class GrapeFarmNameComparator implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		if (o1.numOfFruits == o2.numOfFruits) { // 같으면 0을 리턴
			return 0;
		} else if (o1.numOfFruits > o2.numOfFruits) { // 현재 객체가 크다면 1을 리턴
			return 1;
		} else {
			return -1; // 매개변수 객체가 더 크다면 -1을 리턴
		}
	}
}

class Grape implements Comparable<Grape> {
	int price;
	int numOfFruits;
	int sweet;
	String farm;
	int grade;

	public Grape(int price, int numOfFruits, int sweet, String farm, int grade) {
		this.price = price;
		this.numOfFruits = numOfFruits;
		this.sweet = sweet;
		this.farm = farm;
		this.grade = grade;
	}

	@Override
	public int compareTo(Grape o) { // Grape o 가 전달받은 객체임
		// 이곳에서 현재 인스턴스와 전달되는 인스턴스의 비교 결과를 정의한다
		// 두 객채의 크기가 같다면 0을 리턴, 현재 객체의 크기가 더 크다면 1을 리턴, 매개변수로써 전달받은 객체의 크기가 더 크다면 -1을 리턴
		// 비교의 기준은 내가 설정하기 나름임(Override)

		if (this.price == o.price) {
			return 0;
		} else if (this.price > o.price) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {

		return String.format(" [%d/%d/%d/%s/%s]\n", price, numOfFruits, sweet, farm, grade);
	}
}

// 예제 1 : 복숭아 클래스 마저 정의  / 가격, 등급, 무게, 공장이름 의 필드를 가짐 등급은 A+ A B+ B C+ C 

// 예제 2 : 복숭아를 정렬하면 무게를 기준으로 내림차순 정렬

// 예제 3 : 복숭아를 등급 기준으로 오름차순 정렬하고, 등급이 같으면 가격기준으로 내림차순 정렬

// 예제 4 : 농장이름 오름차순으로 정렬하고, 같은 농장인 경우 등급 기준으로 오름차순

class Peach implements Comparable<Peach> {
	int price;
	String grade;
	int weight;
	String farm;

	public Peach(int price, String grade, int weight, String farm) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farm = farm;

	}

	@Override
	public int compareTo(Peach o) {
		// Integer, Double, String 은 이미 Comparable이 구현되어 있음
		// return Double.compare(this.weight, o.weight); 하면 그냥 됨

		if (this.weight == o.weight) {
			return 0;
		} else if (this.weight > o.weight) {
			return 1;
		} else {
			return -1;
		}
	} // 이 작업이 이미 compare에 들어가있음 weight는 int니까
		// 그냥 Integer.compare(this.weight, o.weight); 하면 같은 결과가 나옴

	@Override
	public String toString() { // String.format이랑 printf랑 문법의 형태가 비슷함

		return String.format("[가격 : %d 등급 : %s 무게 : %d 농장 : %s]\n", price, grade, weight, farm);
	}
}

class PeachInfo implements Comparator<Peach> { // 4번 농장이름 오름차순 , 같으면 등급기준 오름차순

	@Override
	public int compare(Peach o1, Peach o2) {
		if (o1.farm.charAt(0) == o2.farm.charAt(0) && o1.farm.length() == o2.farm.length()) {
			if (o1.grade.charAt(0) > o2.grade.charAt(0) && o1.grade.length() == o2.grade.length()) {
				return -1;
			} else if (o1.grade.charAt(0) == o2.grade.charAt(0) && o1.grade.length() < o2.grade.length()) {
				return -1;
			} else {
				return 1;
			}
		} else if (o1.farm.charAt(0) == o2.farm.charAt(0) && o1.farm.length() > o2.farm.length()) {
			return -1;
		} else if (o1.farm.charAt(0) < o2.farm.charAt(0)) {
			return -1;
		} else {
			return 1;
		}
	}
}

class PeachInfo2 implements Comparator<Peach> { // 3번 등급기준으로 오름차순 , 같으면 가격기준 내림차순
	@Override
	public int compare(Peach o1, Peach o2) {
		if (o1.grade.charAt(0) == o2.grade.charAt(0) && o1.grade.length() == o2.grade.length()) {
			if (o1.price < o2.price) {
				return 1;
			} else {
				return -1;
			}
		} else if (o1.grade.charAt(0) == o2.grade.charAt(0) && o1.grade.length() > o2.grade.length()) {
			return 1;
		} else if (o1.grade.charAt(0) < o2.grade.charAt(0)) {
			return 1;
		} else {
			return -1;
		}
	}

}
