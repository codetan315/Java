package tweet;

public class Main {
	
	public static void main(String[] args) {
		
		// User
		// Tweet
		
		User murayama = new User("murayama");
		User kzm = new User("kzm1127");
		User sano = new User("sanoChan");
		
		murayama.tweet("今日はいい天気");
		murayama.tweet("今日は水曜日");
		kzm.tweet("PHP最高");
		murayama.tweet("今日は金曜日");
		kzm.tweet("Java最高");
		
		sano.tweet("Hello");
		sano.tweet("World");
		
		kzm.showTimeLine();
		murayama.showTimeLine();
		sano.showTimeLine();
		
		}
		
}
