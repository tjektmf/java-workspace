package quiz;

import java.util.HashSet;

public class D02_LottoSet {

	/*
	 * 1부터 45 사이의 중복없는 6개의 랜덤숫자 생성
	 */

	public static void main(String[] args) {

		HashSet<Integer> lottoNumbers = new HashSet<>();

		while(true) {
			lottoNumbers.add((int) (Math.random() * 45 + 1));
			if(lottoNumbers.size()==6) {
				break;
			}
		}

		System.out.println(lottoNumbers);
	}

}
