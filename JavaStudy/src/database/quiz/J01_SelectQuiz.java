package database.quiz;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_SelectQuiz {

	/*
	 * 모든 사원의 사번/이름/부서명/직책명을 읽어 파일로 저장
	 */

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("로드 실패");
			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");

			System.out.println("연결 성공");

			String sql = "select employee_id, first_name, department_name, job_title from employees inner join departments using (department_id) inner join jobs using (job_id) order by employee_id asc";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			FileWriter out = new FileWriter("myfiles/employees.txt");

			while (rs.next()) {
				out.write(String.format("%d %s %s %s\n", rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("department_name"), rs.getString("job_title")));
				System.out.printf("%d %s %s %s\n", rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("department_name"), rs.getString("job_title"));
			}
			out.close();
			rs.close();
			pstmt.close();

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
