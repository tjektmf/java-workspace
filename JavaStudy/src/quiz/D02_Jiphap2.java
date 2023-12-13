package quiz;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_Jiphap2 {

	public static Collection arr1() {
		Collection arr1 = new HashSet<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add("사과");
		arr1.add("포도");

		return arr1;
	}

	public static Collection arr2() {
		Collection arr2 = new HashSet<>();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add("사과");
		arr2.add("어린쥐");
		return arr2;
	}

	public static Set sum(Collection arr1, Collection arr2) {
		HashSet sum = new HashSet();
		sum.addAll(arr1);
		sum.addAll(arr2);

		return sum;
	}

	public static Set same(Collection arr1, Collection arr2) {
		HashSet same = new HashSet();
		arr1.removeAll(minus(arr1(), arr2()));
		
		return (Set) arr1;

	}

	public static Set minus(Collection arr1, Collection arr2) {
		arr1.removeAll(arr2);
		return (Set) arr1;
	}

	public static void main(String[] args) {
		System.out.println(sum(arr1(), arr2()));
		System.out.println(same(arr1(), arr2()));
		System.out.println(minus(arr1(), arr2()));
		System.out.println(minus(arr2(), arr1()));
	}
}
