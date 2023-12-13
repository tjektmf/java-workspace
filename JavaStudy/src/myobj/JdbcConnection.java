package myobj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	   private static String driverPath = "oracle.jdbc.driver.OracleDriver";
	   private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	   private static String id = "hr";
	   private static String pw = "1234";

	   static {
	      try {
	         Class.forName(driverPath);
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	   }

	   public static Connection getConnection() throws SQLException {
	      return DriverManager.getConnection(url, id, pw);
	   }

	}
