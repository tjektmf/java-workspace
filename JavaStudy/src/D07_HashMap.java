import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D07_HashMap {

	/*
	 * # Map
	 * 
	 * - 데이터를 Key/Value 방식으로 저장하는 자료구조
	 * 
	 * - index 번호 대신 key 값을 사용해 사용하기 편하게 만들어진 자료구조
	 * 
	 * - key 값은 중복이 허용되지 않지만 Value는 중복이 허용된다 당연한듯?
	 * 
	 */

	public static void main(String[] args) {
		int[] information = { 3000, 25, 5 };

		System.out.println("돈 : " + information[0]);
		System.out.println("나이 : " + information[1]);
		System.out.println("구매 : " + information[2]);

		// 데이터를 구분하기 쉬운 키 값으로 넣기 대문에 인덱스를 외울 필요가 없음
		Map<String, Integer> info = new HashMap<>();
		
		// map.put(key, value) : 맵에 데이터를 추가 혹은 수정함 
		info.put("money", 3000);
		info.put("age", 15);
		info.put("purchaseCount", 5);
		info.put("score", 3000); // 스코어 3천이랑 머니3천은 아무상관없음 
		info.put("money", 50000); // 이미 위에 머니 3천이 있는데 5만을 또 추가하면 값을 덮어써서 5만이됨
		
		// map.get(key) : 해당 키를 사용해 value를 꺼냄
		System.out.println("money : " + info.get("money"));
		System.out.println("age : " + info.get("age"));
		
		// 존재하지 않는 키를 사용하면 null 이 나옴
		System.out.println("없는 키 : " + info.get("son"));
		
		// map.putIfAbsent(key, value) : 해당 키의 value를 리턴하고 값이 없는 경우 value을 추가함
		System.out.println(info.putIfAbsent("money", 5000)); // 이미 값이 5만이 있으므로 5만을 리턴
		System.out.println(info.putIfAbsent("stock", 5)); // 스톡에는 값이 없으므로 5를 추가하고 null이 나옴
		
		System.out.println(info.get("money")); // 이미 5만이 들어가있었으므로 putIfAbsent로 값이 추가되지않음
		System.out.println(info.get("stock")); // 위에서 스톡에 추가된 5가 출력됨
		
		// map.keySet() : 모든 키들을 Set으로 꺼냄
		Set<String> keys = info.keySet();
		
		System.out.println(keys); // key만 꺼냄
		
		// 키를 하나씩 꺼내는 반복문, 향상된 for문을 사용
		for ( String key : keys) {
			System.out.printf("%s = %d\n" , key, info.get(key)); // 순서대로 뽑음
		}
		
		// map.values() : 모든 값을 Collection으로 꺼냄 > 잘안씀 의미가 그닥 없기 때문
		System.out.println();
		System.out.println(info.values()); // 밸류만 꺼내면 뭐가 뭔지 알수가 없음
		
		// map.containsKey(key) : 맵에 해당 키가 있는지 확인
		System.out.println(info.containsKey("money")); // 머니는 있음 true
		System.out.println(info.containsKey("halmoney")); // 할머니는 없음 false
		
		// map.containsValue(value) : 맵에 해당 밸류가 있는지 확인
		System.out.println(info.containsValue(50000)); // 5만이라는 밸류가 있긴함 근데 이걸어따씀
		
		// map.remove(key) : 해당 key와 value를 지우면서 들어있던 값을 리턴
		System.out.println(info.remove("money")); // 머니에 있던 5만이라는 밸류를 삭제하면서 삭제한 값을 리턴
		System.out.println(info.remove("halmoney")); // 할머니에는 값이 원래 없었음 널을 리턴
		System.out.println(info.get("money")); // 위에서 remove로 머니값을 지워서 이제 머니도 널값이 나옴
		
		System.out.println(info.remove(15)); // 15라는 키가 없어서그런가? 
		System.out.println(info.get("age")); // age에 15라는 밸류가 있지만 삭제되지않음 
		
		
	}

}
