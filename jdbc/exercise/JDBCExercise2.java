package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExercise2 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		
		try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement();) {
			
			ResultSet rs = st.executeQuery("select id, title, body from article order by id desc");
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String title = rs.getString("TITLE");
				String body = rs.getString("BODY");
				System.out.println(id + "," + title + "," + body);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
}
