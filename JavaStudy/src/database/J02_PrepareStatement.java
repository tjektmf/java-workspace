package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import myobj.JdbcConnection;

public class J02_PrepareStatement {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("검색어 >>   ");
      String keyword = sc.next();

      // 안좋은 방법임 SQL Injection 공격의 위험이 있음
      // String sql = "select * from employees where first_name = '" + keyword + "'";

      // SQL Injection 을 방지하기 위해 채워야 하는 곳을 ?로 비워놓음
      String sql = "select * from employees where first_name = ?";

      try (Connection conn = JdbcConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

         // 쿼리문을 준비시킨 후 ?를 채워줌, 0이 아닌 1부터 시작함에 주의
         pstmt.setString(1, keyword); // 1번째 ? 에 keyword를 넣는다 뭐 이런느낌임

         // AutoClose를 위한 try문, 밖에 catch있어서 또안써도됨
         try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
               System.out.printf("%s %s %s \n", rs.getString("first_name"), rs.getString("last_name"),
                     rs.getDate("hire_date"));

            }
         }

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

}