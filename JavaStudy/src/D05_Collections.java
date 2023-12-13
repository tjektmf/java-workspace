import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D05_Collections {

	/*
	 * # java.util.Arrays
	 * 
	 * 배열을 편하게 다룰 수 있는 메서드를 모아놓은 클래스
	 * 
	 * # java.util.Collections
	 * 
	 * 컬렉션을 편하게 달루 수 있는 메서드들을 모아놓은 클래스
	 * 
	 */
	public static void main(String[] args) {

		int[] arr1 = new int[10];

		// Arrays.fill(arr,value) : 전달한 배열을 해당 값으로 초기화한다 arr에 value를 넣음
		Arrays.fill(arr1, 100); // for문 사용해도되지만 더 편함

		System.out.println(Arrays.toString(arr1));

		// Arrays.sort(arr) : 배열의 모든 값을 크기순으로 정렬

		arr1[5] = -99;
		arr1[2] = 30;
		arr1[9] = 30;
		Arrays.sort(arr1);

		// Arrays.binarySearch(arr, value) : 원하는 값의 인덱스를 찾아 반환함 << 정렬 후에 작동
		// 이름부터 이진탐색, 사전에 크기정렬 sort가 필수적

		System.out.println(Arrays.binarySearch(arr1, 30)); // 중복값있으면 제일 앞에있는거

		// Arrays.copyOf(arr, newLength); 전달한 배열의 복사본을 만들어주는 메서드 새로운 길이 설정 가능
		int[] arr2 = Arrays.copyOf(arr1, 20); // arr1 의 배열이 20칸으로 늘어감, 원래 arr1은 10칸이었으니 10칸늘어나서 20칸됨
 
		System.out.println(Arrays.toString(arr2));

		// arrays.compare(arr1, arr2) : 두 배열의 크기를 비교
		int[] stu1 = { 100, 99, 9 };
		int[] stu2 = { 100, 99, 88 };

		System.out.println(Arrays.compare(stu1, stu2)); // 앞에있는 값이 비교우선순위가 높음 왼쪽이 더 크면 1 오른쪽이 더 크면 -1 완전히 같으면 0 <<

		// Collection.addAll(Collection, values ...)
		// 해당 컬렉션에 여러개의 값을 한번에 추가
		List<Integer> numList = new ArrayList<>();
		Set<String> animalSet = new HashSet<>();
		List<String> animalList = new ArrayList<>();
		// 위 예시 문장 맨앞에 List나 Set을 ArrayList나 HashSet으로 안쓰는건 큰의미는 없음 그냥임그냥

		Collections.addAll(numList, 65, 82, 18, 76, 43, 28, 92);
		Collections.addAll(animalSet, "monkey", "lion", "whale", "tiger");
		Collections.addAll(animalList, "monkey", "lion", "whale", "tiger");

		System.out.println(numList);
		System.out.println(animalSet);

		// Collections.sort(List) : 전달한 리스트를 크기순으로 정렬해준다 Set은 순서, index가 없기 때문에 불가능
		Collections.sort(numList);
		Collections.sort(animalList);
		
		System.out.println(numList); // 작은수부터 정렬, 숫자두개 비교해서 자리옮기면서 오름 내림차순 하던거 그냥 이거한번이면 정렬됨
		System.out.println(animalList); // abc 순으로 정렬함

		// Collectins.shuffle(List) : 전달한 리스트의 순서를 섞는다 Set은 순서, index가 없기 때문에 불가능
		
		Collections.shuffle(numList);
		System.out.println(numList);
		
		// Collections.fill(List, value) : 전달한 리스트의 값을 value로 초기화 
		
		Collections.fill(numList, 10);
		System.out.println(numList);
		
		// Collections.frequency(Collection, value) : 해당 컬렉션에서 value 값의 빈도수를 알려줌 List Set 둘다 됨 
		
		int ten = Collections.frequency(numList, 10);
		System.out.println(ten);
		int monkeyCount = Collections.frequency(animalSet, "monkey");
		System.out.println(monkeyCount);
		
	}
}
