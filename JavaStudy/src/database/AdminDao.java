package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO (Database Access Object) - DB에 쿼리문 보내고 결과를 반영하는 객체
public class AdminDao {

	// 1. 새로운 상품을 추가하는 메서드

	public int addPrize(String prize_name, Double prize_rate, Integer init_qty) {

		try (Connection conn = DBConnector.getConnection();) {

			conn.setAutoCommit(false);
			String sql = "insert into eventprizes(prize_id, prize_name, prize_rate, remain_qty, init_qty) values(event_prize_id_seq.nextval, ?,?,?,?)";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, prize_name);
				pstmt.setDouble(2, prize_rate);
				pstmt.setInt(3, init_qty); // 새로 추가했으니 현재수량 = 남은수량
				pstmt.setInt(4, init_qty);

				pstmt.executeUpdate();
			}
			// 값을 넣은 후 확률이 총 100퍼인지 확인이 필요함
			String sql2 = "select sum(prize_rate) as \"total_rate\" from eventprizes";
			try (PreparedStatement pstmt = conn.prepareStatement(sql2); ResultSet rs = pstmt.executeQuery();) {
				// 한 행 꺼내기

				rs.next();
				Double total_rate = rs.getDouble(1);

				if (total_rate > 1) {
					System.out.println("총 확률이 100퍼가 넘음 상품추가 취소");
					conn.rollback();
					throw new SQLException("rate 에러"); // 캐치문으로 넘어감
				} else {
					System.out.println("상품이 정상적으로 추가됨");
					conn.commit();
				}

			}
			return 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;
	}

	// 2. 기존의 상품을 삭제하는 메서드

	public int deletePrize(int pk) {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "delete from eventprizes where prize_id = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 3. 기존 상품의 초기 수량을 변경하는 메서드

	public int updateqty(int pk, int qty) {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "update eventprizes set init_qty = ? where prize_id = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setInt(1, qty);
				pstmt.setInt(2, pk);
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	// 4. 기존 상품의 확률을 변경하는 메서드

	public int updateRate(int pk, double rate) {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "update eventprizes set prize_rate = ? where prize_id = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setDouble(1, rate);
				pstmt.setInt(2, pk);
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	// 5. 기존의 상품 중 하나의 수량을 리셋하는 메서드

	public int reset(int pk) {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "update eventprizes set remain_qty = init_qty where prize_id = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 6. 기존의 모든 상품의 수량을 리셋하는 메서드
	
	public int resetAll() {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "update eventprizes set remain_qty = init_qty";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				return pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static void main(String[] args) {
		AdminDao dao = new AdminDao();
		// System.out.println(dao.deletePrize(1));
//		dao.addPrize("청소기", 0.06, 15);
//		dao.addPrize("컴퓨터", 0.08, 5);
//		dao.addPrize("냉장고", 0.05, 5);
		dao.updateRate(3, 0.04); // pk는 인덱스가 아니라 그냥 데이터값 그 자체임 3하니까 냉장고가 아닌 첫번째 pk값이 3인 청소기가 바뀜
		dao.resetAll();
		
	}
}
