package tweet;

public class User {

	String name;
	Tweet[] tweets = {}; // �v�f0�̔z��
	
	User(String name) {
		this.name = name;
	}
	
	void tweet(String message) {
		
		Tweet tweet = new Tweet(message);
		
		addTweet(tweet);
		
		System.out.print(this.name);
		System.out.print(" ");
		
		tweet.print();
	}

	private void addTweet(Tweet tweet) {
		int len = this.tweets.length;
		len = len + 1;
		Tweet[] tmpTweets = new Tweet[len];
		
		for (int i = 0; i < tweets.length; i++) {
			tmpTweets[i] = this.tweets[i];
		}
		tmpTweets[len - 1] = tweet; // 17�s�ڂ�tweet�������Ă���B�@len - 1 �͗v�f���Ɨv�f�ԍ���1�̂�����l���������́B
		this.tweets = tmpTweets;
	}
	
	void showTimeLine() {
		System.out.println(name);
		for (int i = 0; i < this.tweets.length; i++) {
			// System.out.println(this.tweets[i].message + this.tweets[i].date);
			Tweet tweet = this.tweets[i];
			tweet.print();
		}
	}
	
}
