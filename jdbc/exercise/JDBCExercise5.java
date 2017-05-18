package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class JDBCExercise5 {
	public static void main(String[] args) {
		
		Article article4 = new Article(4, "Title 4", "Body 4");
		Article article5 = new Article(5, "Title 5", "Body 5");
		
		List<Article> articleList = Arrays.asList(article4, article5);
		
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			
			con.setAutoCommit(false);
			
			try (PreparedStatement ps = con.prepareStatement("insert into article(id, title, body) values(?, ?, ?)")) {
				
				int count = 0;
				for (Article article : articleList) {
					ps.setInt(1, article.getId());
					ps.setString(2, article.getTitle());
					ps.setString(3, article.getBody());
					count += ps.executeUpdate();
				}
				
				con.commit();
				System.out.println(count);
				
			} catch (SQLException e) {
				
				con.rollback();
				throw e;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
}
