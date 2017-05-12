
public class BlogFactory {
	
	public static Blog newBlog() {
		Blog blog = new InMemoryBlog();
		return blog;
	}
	
}
