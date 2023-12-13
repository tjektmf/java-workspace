package database.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.event.model.Prize;

public class EventDao {

	// 1. 모든 상품을 리스트로 읽어오는 메서드
	public List<Prize> selectAllPrizes() {

		try (Connection conn = DBConnector.getConnection()) {
			String sql = "select * from eventprizes";
			try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery();) {
				List<Prize> list = new ArrayList<>();

				while (rs.next()) {
					list.add(new Prize(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5)));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// 2. 상품의 수량을 1 감소시키는 메서드
	public int reduceRemainQty(int pk) {
		try (Connection conn = DBConnector.getConnection();) {
			String sql = "update eventprizes set remain_qty = remain_qty -1 where prize_id = ?"; // 당첨됐으니 보유수량에서 -1
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setInt(1, pk); // 특정 상품을 지정해야 하므로 pk값이 필요함 인덱스가 아니라 데이터값
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 3. 해당 상품의 정보를 불러오는 메서드
	public Prize getPrize(int pk) {
		try (Connection conn = DBConnector.getConnection();) {
			String sql = "select * from eventprizes where prize_id = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setInt(1, pk);
				try (ResultSet rs = pstmt.executeQuery();) {
					rs.next();
					return new Prize(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 4. 남은 모든 상품의 수량을 조회하는 메서드 
	public int getAllPrizesReaminQty() { // 모든 상품이므로 매개변수에 pk가 없음
		try (Connection conn = DBConnector.getConnection();) {
		String sql = "select sum(remain_qty) from eventprizes";
		try(PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			rs.next();
			return rs.getInt(1);
			
		}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

}
