package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import myobj.JdbcConnection;

public class J04_Transaction {

   public static void main(String[] args) {

      try (Connection conn = JdbcConnection.getConnection();) {

         // 해당 연결 인스턴스의 자동 커밋을 비활성화 해야 커밋과 롤백을 활용한 트랜잭션 관리가 가능함
         conn.setAutoCommit(false);

         String sql1 = "insert into " + "fruits(fruit_id, fruit_name, fruit_price)"
               + " values(fruit_id_seq.nextval,'Pineapple',5000)"; // 문자열은 '', 숫자는 그냥

         try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
            for (int i = 0; i < 5; i++) {
               pstmt.executeUpdate();
            }
         }
         if ((int) (Math.random() * 2) == 1) {
            System.out.println("파인애플 5개가 추가된 후 커밋");
            conn.commit(); // 커밋
         } else {
            System.out.println("퍼ㅏ인애플 5개가 추가되었다가 롤백"); // 롤백해도 시퀀스 번호는 돌아오지않음
            conn.rollback(); // 롤백
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}