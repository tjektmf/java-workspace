package myobj.yacht;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YachtDice {

	ArrayList<Integer> dices = new ArrayList<>();

	public YachtDice() {
		for (int i = 0; i < 5; i++) {
			dices.add(randomDice());
		}
	}

	private int randomDice() {
		return (int) (Math.random() * 6 + 1);
	}

	@Override
	public String toString() {
		return dices.toString();
	}

	public void showAvailableRanks() {
		List<Integer> counts = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			counts.add(Collections.frequency(dices, i + 1));
		}
		System.out.println("주사위 개수 : " + counts); // toString() override를 통해 설정해둠

		int availNum = 1;

		if (counts.contains(5)) {
			System.out.println(availNum++ + " : Yacht");
		}
		if (Collections.max(counts)>=4) {
			System.out.println(availNum++ + " : four of a kind");
		}
		if (Collections.max(counts)>=3) {
			System.out.println(availNum++ + " : three of a kind");
		}
		if (counts.contains(3) && counts.contains(2)) {
			System.out.println(availNum++ + " : full house");
		}

		// Collections.max(Collection) : 해당 Collection에서 최댓값을 구함
		// list.set(index, item) : 해당 index의 값을 item으로 대체한다

		List<Integer> continuousCount = new ArrayList<>();
		Collections.addAll(continuousCount, 0, 0, 0, 0, 0, 0);
		int continuousIndex = 0;
		for (Integer count : counts) {
			if (count > 0) {
				continuousCount.set(continuousIndex, continuousCount.get(continuousIndex) + 1);
			} else {
				continuousIndex++;
			}
		}
		int maxConCount = Collections.max(continuousCount);
		if (maxConCount == 5) {
			System.out.println(availNum++ + " : Large Straight");
		}
		if (maxConCount >= 4) {
			System.out.println(availNum++ + " : Small Straight");
		}
	}
}
