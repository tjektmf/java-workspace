package ans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D07_CountFruits {

	// 다음 과일들로 가득 찬 크기 1000개의 랜덤배열을 생성한 후

	// 각 과일이 몇 번 등장했는지 ㅅ[

	final public static String[] fruits = { "Apple", "Banana", "Orange", "Watermelon", "Strawberry", "Grape", "Melon",
			"peach", "Cherry" }; // 9개

	public static int[] count = new int[9];

	public static void main(String[] args) {

		String[] arr = new String[1000];
		int fruitCount = fruits.length;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			arr[i] = fruits[(int) (Math.random() * fruitCount)];
		}
		System.out.println(Arrays.toString(arr)); // 일단 넣음

//		for (int i = 0; i < count.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (fruits[i].equals(arr[j])) { // String 비교시 equals 활용
//					count[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(count));

		Map<String, Integer> countMap = new HashMap<>(); // 앞에 스트링은 키의 타입 인티저는 밸류타입

		for (String ranFruit : arr) { // 만약 arr에 랜덤으로 안나온게 있으면 ranFruit에서도 키가 생성되지 않음
			if (!countMap.containsKey(ranFruit)) { // containsKey(key) key가 있는지 확인 true/false
				// 처음 나온 과일은 1로 시작
				countMap.put(ranFruit, 1); 
			} else {
				// 이미 나왔던 과일은 1씩 더해서 다시넣음
				countMap.put(ranFruit, countMap.get(ranFruit) + 1); 
			} // countMap.get(ranFruit) 얘는 if true값에서 처음나온 키에 대해 1을 넣어줌 이후 1씩 더하면서 개수 증가
		}
		System.out.println(countMap);

		Map<String, Integer> total = new HashMap<>();
		for (int i = 0; i < fruits.length; i++) {
			total.put(fruits[i], count[i]);
		}

		// map.keySet() : 모든 키들을 Set으로 꺼냄
		// Set<String> keys = info.keySet();

//		for (String ans : fruits) {
//			System.out.printf(" %s : %d \n", ans, total.get(ans));
//
//		}
	}

}
