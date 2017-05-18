package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExercise3 {
	
	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.err.println("Usage: java JDBCExercize3 1 title body");
			System.exit(1);
		}	
		
		int id = Integer.parseInt(args[0]);
		String title = args[1];
		String body = args[2];
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement();) {
			
			String sql = "insert into article(id, title, body) values(" + id + ", '" + title + "', '" + body + "')";
			int count = st.executeUpdate(sql);
			System.out.println(count);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
			
	}
	
}
