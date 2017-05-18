package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise32 {
	
	public static void main(String[] args) {
		
		if (args.length != 4) {
			System.out.println("Usage: java JDBCExercize32 1 title body 1");
			System.exit(1);
		}
		
		String postId = args[0];
		String title = args[1];
		String body = args[2];
		String preId = args[3];
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement();) {
			int count = st.executeUpdate("update article set id = " + postId + ", title = '" + title + "', body = '" + body + "' where id = " + preId);
			System.out.println(count);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
