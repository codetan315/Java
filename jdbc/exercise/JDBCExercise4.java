package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExercise4 {
	
	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("Usage: java JDBCExercize4 1 title body");
			System.exit(1);
		}
		
		String id = args[0];
		String title = args[1];
		String body = args[2];
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement ps = con.prepareStatement("insert into article(id, title, body) values(?, ?, ?)");) {
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, title);
			ps.setString(3, body);
			
			int count = ps.executeUpdate();
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
