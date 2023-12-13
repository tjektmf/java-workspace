package quiz;

import java.util.Arrays;

import myobj.PrizeArr;
import myobj.PrizeGoods;
import myobj.PrizeGoods2;

public class C11_PrizeDraw {

	/*
	 * 경품 추첨 프로그램
	 * 
	 * 각 경품들은 한정된 수량이 있으며 경품마다 다름
	 * 
	 * 각 경품이 나올 확률은 모두 다르며 수량이 소진된 상품은 더 이상 당첨 될 수 없음
	 */

	public static void main(String[] args) {

//		PrizeGoods good = new PrizeGoods();
//		for (int i = 0; i < 20; i++) {
//			good.lucky();
//		}
		System.out.println("===========");

		PrizeGoods2 good2 = new PrizeGoods2();
		good2.thxArr();
		for (int i = 0; i < 20; i++) {
			good2.unlucky();
		}
		System.out.println("===========");
		PrizeArr good3 = new PrizeArr();
		
		System.out.println("재고 상황");
		System.out.println(Arrays.toString(good3.thxArr()));

	}

}
