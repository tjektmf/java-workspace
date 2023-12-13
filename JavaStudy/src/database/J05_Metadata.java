package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import myobj.JdbcConnection;

public class J05_Metadata {

   public static void main(String[] args) {

      String sql = "select * from employees";

      try (Connection conn = JdbcConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
         // 조회한 ResultSet에 대한 정보를 볼 수 있다
         ResultSetMetaData meta = rs.getMetaData();
         System.out.println("컬럼이 몇개? " + meta.getColumnCount());
         System.out.println("첫번째 컬럼의 이름은? " + meta.getColumnLabel(1));
         System.out.println("두번째 컬럼의 이름은? " + meta.getColumnLabel(2));
         System.out.println("-------------------");
         for (int i = 1; i <= meta.getColumnCount(); i++) { // db관련은 인덱스가 1부터 시작함 맨처음이 0이 아님
            System.out.printf("%-20s\t%s(%d)\n", meta.getColumnName(i), meta.getColumnTypeName(i),
                  meta.getColumnDisplaySize(i));
         }

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

}