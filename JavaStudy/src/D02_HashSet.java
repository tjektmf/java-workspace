import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	/*
	 * # Set
	 * 
	 * 집합을 구현해놓은 클래스, 중복을 허용하지 않음, Collection 인터페이스를 구현한 클래스임
	 * 
	 * # Hash
	 * 
	 * 같은 값을 넣으면 항상 일정한 값이 나오는 단방향성 알고리즘
	 * 
	 * HashSet은 중복을 체크할 때 해당 객체의 Object.hashCode() 메서드를 사용함
	 * 
	 * 저 메서드를 통해 같은 해시코드가 나오면 중복으로 판단하며 결과가 규칙적이지 않아 순서가 없음 > index가 없음
	 * 
	 * # java.util.HashSet
	 * 
	 * 해쉬 알고리즘을 사용하는 Set, 중복된 데이터를 허용하지 않으며 순서가 없음
	 * 
	 * 
	 */

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<>();

		// Set.add(item) : item 을 추가한다
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(40);
		numbers.add(40);
		numbers.add(40);
		numbers.add(50);
		numbers.add(70);

		System.out.println(numbers); // Set에 의해 중복값은 사라짐

		// HashSet은 index가 없어서 get을 할 수 없다

		// 내용을 사용하고 싶다면 반복문을 통해 하나씩 꺼내는 방법밖에 없음

		// forEach 반복문 : 오른쪽에서 값을 하나씩 꺼내서 반복함 순서대로 꺼냄, 한바퀴 싹돌면 끝남
		for (Integer number : numbers) {
			System.out.println(number + "dd");

			// Object 타입의 hashCode : 주소값 리턴

			// Integer 타입의 hashCode override : 기본형 리턴

			// String 타입의 hashCode override : 문자열 값을 통한 계산값 리턴
		}
		System.out.println("Integer hashCode: " + Integer.valueOf(1234).hashCode());

		System.out.println("abcd".hashCode());

		HashSet<String> animals = new HashSet<>();
		HashSet<String> fruits = new HashSet<>();
		ArrayList<String> animalList = new ArrayList<>();

		animalList.add("몽키");
		animalList.add("몽키");
		animalList.add("몽키");
		animalList.add("토키");
		animalList.add("럭키");
		animalList.add("도키");

		animals.add("dog1");
		animals.add("dog2");
		animals.add("dog3");
		animals.add("dog3");

		fruits.add("사과");
		fruits.add("애플");
		fruits.add("망고");
		fruits.add("양파");

		System.out.println("dog3".hashCode() == "dog3".hashCode());
		System.out.println("dog3".hashCode());
		System.out.println("dog2".hashCode());
		System.out.println("dog3".equals("dog3"));
		System.out.println(animals);
		// equals로 비교하는거보다 hashCode를 사용하는게 속도가 빠름, 중복비교에 있어서 해시가 젤빠름

		// set.addAll(Collection<? extends genericType) : 다른 Collection의 값을 모두 더함 중복값은
		// 제거, set이니깐
		animals.addAll(fruits);
//		animals.addAll(numbers); type mismatch
		System.out.println(animals);

		animals.addAll(animalList);
		System.out.println(animalList);
		System.out.println(animals); // set으로 들어가면서 중복인 몽키가 제거됨

		// Set.removeAll(Collection) : 다른 Collection에 포함된 값을 모두 제거
		animals.removeAll(fruits);
		System.out.println(animals);

		// Set.contains(item) : item의 포함 여부를 반환함 true/false
		System.out.println("몽키있음? " + (animals.contains("몽키") ? "있음" : "없음"));

		// Collection은 다른 Collection으로 변환이 자유롭다 생성자를 사용

		// Set을 List로 변환
		List<String> list1 = new ArrayList<>(animals);
		Set<String> set1 = new HashSet<>(animalList);

		System.out.println("리스트가 된 셋 : " + list1);
		System.out.println("셋이 된 리스트 : " + set1);

	}

}
