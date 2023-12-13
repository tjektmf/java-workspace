package quiz;

import java.util.HashSet;

public class D02_Jiphap {

	public static HashSet<Integer> arr1() {
		HashSet<Integer> arr1 = new HashSet<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);

		return arr1;
	}

	public static HashSet<Integer> arr2() {
		HashSet<Integer> arr2 = new HashSet<>();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		return arr2;
	}

	public static HashSet<Integer> sum(HashSet<Integer> arr1, HashSet<Integer> arr2) {
		HashSet<Integer> sum = new HashSet<>();
		sum.addAll(arr1);
		sum.addAll(arr2);

		return sum;
	}

	public static HashSet<Integer> same(HashSet<Integer> arr1, HashSet<Integer> arr2) {
		HashSet<Integer> same = new HashSet<>();
		for (Integer pick : arr2) {
			if (arr1.contains(pick)) {
				same.add(pick);
			}
		}
		return same;
	}

	public static HashSet<Integer> minus(HashSet<Integer> arr1, HashSet<Integer> arr2) {
		arr1.removeAll(arr2);
		return arr1;
	}

	public static void main(String[] args) {
		System.out.println(sum(arr1(), arr2()));
		System.out.println(same(arr1(),arr2()));
		System.out.println(minus(arr1(), arr2()));

	}
}