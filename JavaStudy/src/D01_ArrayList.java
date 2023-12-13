import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class D01_ArrayList {

	/*
	 * $ java.util.ArrayList
	 * 
	 * - 배열과 비슷하지만 크기가 자동으로 조절되는 자료구조 클래스
	 * 
	 * - 배열처럼 데이터를 순차적으로 저장
	 * 
	 * - 모든 데이터를 순서대로 읽어야 할 때 속도가 가장 빠른 자료구조
	 * 
	 * $ 자료구조 (data structure)
	 * 
	 * - 데이터를 효율적으로 보관하기에 최적화된 구조들
	 * 
	 * - 상황마다 데이터를 가장 효율적으로 다룰 수 있는 방법에 대해 연구한 결과물
	 * 
	 */

	public static void main(String[] args) {

		// 새 리스트를 하나 생성함
		ArrayList list1 = new ArrayList();

		// list.add(item) : 해당 리스트에 item을 추가함
		list1.add("애플"); // 여기다 뭘넣어도 Object로 받음 자동 업캐스팅
		list1.add("키위");
		list1.add("어린쥐");
		list1.add(36);
		list1.add(64);

		System.out.println(list1); // [애플, 키위, 어린쥐] 이렇게 나오는걸로 봐서 toString 메서드가 override 되어있음

		// list.add(index, item) // 해당 리스트의 원하는 index에 item을 추가하는 메서드 나머진 당연히 뒤로밀림 앞으로는 못밀리니까
		list1.add(1, "키위키위");
		list1.add(1, "위키");
		// list.get(index) // index 위치의 item을 꺼내는 메서드
		System.out.println("index2 : " + list1.get(2)); // 얘도 0부터시작
		System.out.println("index3 : " + list1.get(3));
		System.out.println(list1);

		// System.out.println((int)list1.get(3) + (int)list1.get(4)); 
		// 받을때 Object로 받았으니 더하려면 int로 다운캐스팅
		// 문자열에 +로 붙이는건 단순 이어붙이기가 아니라 해당 객체의 toString을 불러와서 갖다붙이는거임

		// list.size() : 해당 리스트의 크기를 반환함
		System.out.println("list1의 크기 : " + list1.size());

		// size() 를 통해 리스트의 모든 요소를 쉽게 탐색가능

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " 번째 : " + list1.get(i));
		}

		// 타입을 지정하면서 리스트 만들기 (제네릭 설정)
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("어린쥐");
		fruits.add("포도");
		fruits.add("호랑이");
		fruits.add(2, "맹고");

		System.out.println(fruits);

		String fruitOne = fruits.get(0);
		System.out.println(fruitOne);
		// <String>을 이용하면 따로 다운캐스팅을 안해도됨 덜귀찬

		// list.contains(item) : 해당 리스트에 item이 포함되어있는지 확인한다 boolean 으로 리턴함
		// 넣는건 .add 	빼는건 .remove	 .contains는 있는지 없는지 확인
		System.out.println("리스트에 포도있어? " + fruits.contains("포도"));
		System.out.println("리스트에 도포있어? " + fruits.contains("도포"));

		if (fruits.contains("피치")) {
			System.out.println("복숭아있서?");
		} else {
			fruits.add("피치");
			System.out.println("없어서 추가함ㅋ");
		} // 이경우 맨뒤로붙음
		System.out.println(fruits);

		// list.remove(index) : 해당 index 위치의 요소를 지우고 그값을 반환함
		// list.remove(item) : 해당 item값을 지는 요소를 지운다
		System.out.println("지우기 전 2번 : " + fruits.get(2));
		String removed = fruits.remove(2);
		System.out.println(fruits);
		System.out.println("방금 지운 값 : " + removed);
		System.out.println("지운 후 2번 : " + fruits.get(2));

		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.add("애펄");
		fruits.remove("애펄"); //  item값을 지우는 기능도 한번에 그거 다지우는게 아니라 맨 앞에 있는 값부터 하나씩 지움
		fruits.remove("프링글스"); // 
		System.out.println("프링글스 삭제 성공? : " + (fruits.remove("프링글스") ? "ㅇㅇ true" : "ㄴㄴ false"));
		System.out.println("애펄 삭제 성공? : " + fruits.remove("애펄"));
		// item값으로 삭제하면 성공여부를 boolean 값으로 반환한다
		// index로 삭제하면 삭제한걸 String 으로 반환함
		
		ArrayList<String> countries = new ArrayList<>();
		ArrayList<String> bigCountries = new ArrayList<>();
		
		countries.add("South Korea");
		countries.add("America");
		countries.add("UK");
		countries.add("Russia");
		countries.add("Japan");
		countries.add("India");
		countries.add("North Korea");
		countries.add("Hongkong");
		bigCountries.add("America");
		bigCountries.add("Russia");
		bigCountries.add("India");
		
		
		System.out.println(countries);
		System.out.println(bigCountries);

		// list.addAll(Collection) : 다른 컬렉션의 내용을 모두 더해준다
		countries.addAll(bigCountries);
		countries.addAll(bigCountries);
		countries.addAll(bigCountries);
		System.out.println(countries); // 기본 countries 뒤에 bigCountries를 중복 상관없이 가져다 붙임
		
		/*
		  	# Collection
		  	
		  	- java에서 제공하는 자료구조 인터페이스
		  	
		  	- Collection 인터페이스를 구현하는 클래스로는 List, Set 등이 있음
		  	
		  	- List는 모두 Collection 인터페이스의 자손임
		  	
		 */

		
		// list.removeAll(Collection) : 전달한 컬렉션에 포함된 내용을 모두 삭제한다 boolean값으로 삭제여부를 반환함
		System.out.println(countries.removeAll(bigCountries)); // 삭제성공 true를 반환함 
		System.out.println(countries); // removeAll로 지우면 중복값까지 다 지워줌 세번추가했는데 싹 다 지우고 기존에 갖고 있던 것도 지워버림
		
		// list.containsAll(collection) : 리스트에 전달한 컬렉션의 '모든 내용'이 포함되어있으면 true
		System.out.println(countries.containsAll(bigCountries));
		
		countries.add("Russia");
		countries.add("America");
		System.out.println(countries.containsAll(bigCountries)); // 모든 내용이 포함된건 아니라서 false
		countries.add("India");
		System.out.println(countries.containsAll(bigCountries)); // 모든 내용이 포함됨 true
		
		// list.set(index, item) : 해당 index의 값을 item으로 대체한다
		countries.set(1, "프링글스");
		System.out.println(countries);
		// list.subList(start, end) : 리스트를 원하는 만큼 자르고 자른 리스트를 반환한다
		List<String> sub = countries.subList(2, 5); // ctrl + alt + o 해줘야함 임포트 // start <= x < end // end값 미만임
		System.out.println(sub); //  2에 위치한게 제펜이고 4가 홍공 5가 러시아임 2 3 4 제펜부터 퐁콩까지 잘라서 반환함
		
		
		ArrayList<String> drinks = new ArrayList<>();
		LinkedList<String> foods = new LinkedList<>();
		
		Collection<String> d1 = drinks;
		List<String> d2 = drinks;
		List<String> f1 = foods;
		
		// LinkedList와 ArrayList는 세부구현 및 성능은 다르지만 같은 List의 자식이라 List의 메서드로 쉽게 사용가능
		
		f1.add("파스타");
		f1.add("피자");
		System.out.println(f1);
	}
}
