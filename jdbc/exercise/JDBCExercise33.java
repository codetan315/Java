package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExercise33 {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.err.println("Usage: java JDBCExercize33 1");
			System.exit(1);
		}	
		
		String id = args[0];
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement();) {
			
			int count = st.executeUpdate("delete from article where id = " + id);
			System.out.println(count);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
