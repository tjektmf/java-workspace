package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import myobj.JdbcConnection;

public class J03_ExecuteUpdate {

   /*
    * # pstmt.executeQuery()
    * 
    * - select 문에만 사용한다. 결과로 ResultSet이 나온다
    * 
    * # pstmt.executeUpdate()
    * 
    * - INSERT, UPDATE, DELETE문에 사용한다. 결과로 int값이 나온다. - int 값으로는 반영된 행의 개수가 리턴
    * 
    */

   public static void main(String[] args) {

      try (Connection conn = JdbcConnection.getConnection();) {
         // 기본키를 넣을 때는 자바쪽에서 시퀀스를 불러 사용한다 fruit_id_seq.nextval
         String sql1 = "insert into " + "fruits(fruit_id, fruit_name, fruit_price)"
               + " values(fruit_id_seq.nextval,?,?)";
         try (PreparedStatement pstmt = conn.prepareStatement(sql1);) {
            pstmt.setString(1, "Peach");
            pstmt.setInt(2, 1500);

            // INSERT, UPDATE, DELETE는 executeUpdate()로 실행해야함
            int row = pstmt.executeUpdate();
            System.out.println(row + "행이 변경됨");
         }

         String sql2 = "update fruits set fruit_price = fruit_price+100 where fruit_id<130";
         try (PreparedStatement pstmt = conn.prepareStatement(sql2)) {
            int row = pstmt.executeUpdate();
            System.out.println(row + "개의 과일 가격이 100원 오름");
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }
}