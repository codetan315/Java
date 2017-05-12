package tweet;

public class Main {
	
	public static void main(String[] args) {
		
		// User
		// Tweet
		
		User murayama = new User("murayama");
		User kzm = new User("kzm1127");
		User sano = new User("sanoChan");
		
		murayama.tweet("¡“ú‚Í‚¢‚¢“V‹C");
		murayama.tweet("¡“ú‚Í…—j“ú");
		kzm.tweet("PHPÅ‚");
		murayama.tweet("¡“ú‚Í‹à—j“ú");
		kzm.tweet("JavaÅ‚");
		
		sano.tweet("Hello");
		sano.tweet("World");
		
		kzm.showTimeLine();
		murayama.showTimeLine();
		sano.showTimeLine();
		
		}
		
}
