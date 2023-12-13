package database.quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.event.EventDao;
import database.event.model.Prize;

public class J06_PrizeEvent {

	/*
	 * # DB와 연동되는 경품 추첨 이벤트를 구현
	 * 
	 * 1. DB에 경품들의 이름, 당첨 확률, 남은 수량 등 필요한 정보를 저장할 수 있는 테이블 생성
	 * 상품id/상품명/당첨확률/남은수량/초기수량
	 * 
	 * 2. 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들어야함
	 * 
	 * 3. 상품이 소진된 상태로 뽑으면 이벤트 종료를 알리며 프로그램 종료
	 * 
	 * 4. 리셋기능을 실행하면 DB의 상품이 다시 충전
	 * 
	 */
	List<Prize> box = new ArrayList<>();
	EventDao eventDao = new EventDao();

	public J06_PrizeEvent() {

		List<Prize> prizeList = eventDao.selectAllPrizes();
		System.out.println(prizeList);

		int count = 0;

		for (Prize p : prizeList) {
			int r = (int) (p.getPrize_rate() * 1000); // 일단 순서대로 있는 개수만큼 다 때려박음
			for (int i = 0; i < r; i++) {
				box.add(p);
				++count;
			}
		}
		while (count < 1000) {
			box.add(null);
			++count;
		}
		System.out.println(box); // 청소기 컴퓨터 냉장고 순서로 들어가고 나머지 뒤에있는 값들이 null로 가득참

	}

	public Prize draw() throws SQLException {

		if (eventDao.getAllPrizesReaminQty() <= 0) {
			throw new SQLException("모든 상품 소진");
		}
		Prize p = box.get((int) (Math.random() * 1000)); // 위에 순서대로 박스에 담았지만 여기서 랜덤으로 뽑음 
		// 그냥 box에서 하나 꺼내온거같지만 콘솔출력과 다르게 box에는 toString 오버라이드 이전에 Prize 클래스 생성자에 부여한 모든 매개변수의 정보가 들어있음
		// Prize(int prize_id, String prize_name, double prize_rate, int remain_qty, int init_qty)
		// 이 많은 값중에 p.getPrize_id를 사용해 pk값만 뽑아내서 활용함
		
		// DB에 수량 감소 반영
		if (p != null) { // p가 널이 아님 = 상품에 당첨됨, 상품개수 -1
			// 수량이 이미 0이라 감소에 실패한경우 
			int result = eventDao.reduceRemainQty(p.getPrize_id()); // p값에 해당하는 pk값을 가지는 getPrize_id를 불러옴
			
			
			if(result == -1) {
				System.out.println("이미 수량이 0임");
				return p;
			}
			// 현재 수량을 읽어서 반영
			Prize p2 = eventDao.getPrize(p.getPrize_id());
			p.setRemain_qty(p2.getRemain_qty());
		}
		return p;
	}

	public static void main(String[] args) {
		J06_PrizeEvent pe = new J06_PrizeEvent(); // 여기서 1000개 만듬

		for (int i = 0; i < 100; i++) {
			Prize p;
			try {
				p = pe.draw();

				if (p != null) {
					System.out.println(p); // 100개 뽑음
				}

			} catch (SQLException e) {
				System.out.println("모든상품소진");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}