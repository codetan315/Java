public class InMemoryBlog implements Blog {

	private Article[] articles = {};

	@Override
	public Integer createArticle(Article newArticle) {
		newArticle.setId(getNextId());
		Article[] newArticles = new Article[this.articles.length + 1];
		for (int i = 0; i < this.articles.length; i++) {
			newArticles[i] = this.articles[i];
		}
		newArticles[newArticles.length - 1] = newArticle;
		this.articles = newArticles;
		return 1;
	}

	@Override
	public Article[] getArticles() {
		if (this.articles != null) {
			return this.articles;
		}
		return null;
	}

	@Override
	public Article getArticle(Integer id) {
		for (int i = 0; i < articles.length; i++) {
			if (this.articles[i].getId() == id) {
				return this.articles[i];
			}
		}
		return null;
	}

	@Override
	public Integer updateArticle(Article updateArticle, Integer id) {
		int updateCount = 0;
		Article[] newArticles = new Article[this.articles.length];
		for (int i = 0; i < this.articles.length; i++) {
			if (this.articles[i].getId() == id) {
				newArticles[i] = updateArticle;
				updateCount++;
			} else {
				newArticles[i] = articles[i];
			}
		}
		this.articles = newArticles;
		return updateCount;
	}

	@Override
	public Integer deleteArticle(Integer id) {
		Article[] newArticles = new Article[this.articles.length - 1];
		for (int i = 0; i < this.articles.length; i++) {
			if (this.articles[i].getId() != id) {
				newArticles[i] = articles[i];
			}
		}
		this.articles = newArticles;
		return -1;
	}

	private Integer getNextId() {
		Integer nextId = 0;
		for (int i = 0; i < this.articles.length; i++) {
			if (nextId < this.articles[i].getId()) {
				nextId = this.articles[i].getId();
			}
		}
		return nextId + 1;
	}

}
