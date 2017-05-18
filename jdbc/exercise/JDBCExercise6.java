package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JDBCExercise6 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/example?useSSL=false";
		String user = "root";
		String password = "admin";
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			
			ArticleDAO articleDao = new ArticleDAO(con);
			
			Article article6 = new Article(6, "Title 6", "Body 6");
			articleDao.create(article6);
			printAllArticles(articleDao);
			
			article6.setTitle("Title 6U");
			article6.setBody("Body 6U");
			articleDao.update(article6, article6.getId());
			printAllArticles(articleDao);
			
			articleDao.delete(article6.getId());
			printAllArticles(articleDao);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}
	
	private static void printAllArticles(ArticleDAO articleDao) throws SQLException {
		System.out.println("-----");
		List<Article> articleList = articleDao.findAll();
		for (Article article : articleList) {
			System.out.println(article.getId() + ", " + article.getTitle() + ", " + article.getBody());
		}
	}
}
