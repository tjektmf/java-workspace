package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import myobj.Employee;
import myobj.JdbcConnection;

public class J06_DataModelClass {

   /*
    * # 데이터 모델 클래스
    * 
    * - DB에서 꺼낸 데이터를 담아놓는 용도로 사용하는 클래스
    * 
    * - 데이터를 매개변수 등으로 활용하기 편리한 형태로 DTO, VO 등으로 불리기도 함
    * 
    */

   public static void main(String[] args) {

      String sql = "select * from employees";
      try (Connection conn = JdbcConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
         
         // 테이블의 한 행을 인스턴스화 해놓으면 Collection에도 활용할 수 있다
         List<Employee> employees = new ArrayList<>();

         while (rs.next()) {

            Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("first_name"),
                  rs.getString("last_name"), rs.getString("email"), rs.getString("phone_number"));
            System.out.println(emp);
            employees.add(emp);
//            System.out.println(rs.getInt("employee_id"));
//            System.out.println(rs.getString("first_name"));
//            System.out.println(rs.getString("last_name"));
//            System.out.println(rs.getString("email"));
//            System.out.println(rs.getString("phone_number"));
//            System.out.println("-----------------------------");
         }
         System.out.println(employees);

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}