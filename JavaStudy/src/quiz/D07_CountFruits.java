package quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D07_CountFruits {

	// 다음 과일들로 가득 찬 크기 1000개의 랜덤배열을 생성한 후

	// 각 과일이 몇 번 등장했는지 ㅅ[

	final public static String[] fruits = { "Apple", "Banana", "Orange", "Watermelon", "Strawberry", "Grape", "Melon",
			"peach", "Cherry" }; // 9개

	public static int[] count = new int[9];

	public static void main(String[] args) {

		String[] arr = new String[1000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = fruits[(int) (Math.random() * 9)];
		}
		System.out.println(Arrays.toString(arr)); // 일단 넣음

		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (fruits[i].equals(arr[j])) { // String 비교시 equals 활용 
					count[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));

		Map<String, Integer> total = new HashMap<>();
		for (int i = 0; i < fruits.length; i++) {
			total.put(fruits[i], count[i]);
		}
		
		// map.keySet() : 모든 키들을 Set으로 꺼냄
		// Set<String> keys = info.keySet();

		for (String ans : fruits) {
			System.out.printf(" %s : %d \n", ans, total.get(ans));

		}

	}

}
