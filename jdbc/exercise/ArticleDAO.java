package exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
	
	protected Connection con;
	
	public ArticleDAO(Connection con) {
		this.con = con;
	}
	
	public List<Article> findAll() throws SQLException {
		try (PreparedStatement ps = con.prepareStatement("select id, title, body from article")) {
			ResultSet rs = ps.executeQuery();
			List<Article> articleList = new ArrayList<>();
			while (rs.next()) {
				Article article = new Article(rs.getInt("ID"), rs.getString("TITLE"), rs.getString("BODY"));
				articleList.add(article);
			}
			return articleList;
		}
	}
	
	public Article findByPrimaryKey(int id) throws SQLException {
		try (PreparedStatement ps = con.prepareStatement("select id, title, body from id where id = ?")) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Article article = new Article(rs.getInt("ID"), rs.getString("TITLE"), rs.getString("BODY"));
				return article;
			}
			throw new DataNotFoundException();
		}
	}
	
	public int create(Article article) throws SQLException {
		try (PreparedStatement ps = con.prepareStatement("insert into article(id, title, body) values(?, ?, ?)")) {
			ps.setInt(1, article.getId());
			ps.setString(2, article.getTitle());
			ps.setString(3, article.getBody());
			int count = ps.executeUpdate();
			return count;
		}
	}
	
	public int update(Article article, int id) throws SQLException {
		try (PreparedStatement ps = con.prepareStatement("update article set id = ?, title = ?, body = ? where id = ?")) {
			ps.setInt(1, article.getId());
			ps.setString(2, article.getTitle());
			ps.setString(3, article.getBody());
			ps.setInt(4, id);
			int count = ps.executeUpdate();
			return count;
		}
	}
	
	public int delete(int id) throws SQLException {
		try (PreparedStatement ps = con.prepareStatement("delete from article where id = ?")) {
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			return count;
		}
	}
	
}
