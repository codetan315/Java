package tweet;

public class Main {
	
	public static void main(String[] args) {
		
		// User
		// Tweet
		
		User murayama = new User("murayama");
		User kzm = new User("kzm1127");
		User sano = new User("sanoChan");
		
		murayama.tweet("�����͂����V�C");
		murayama.tweet("�����͐��j��");
		kzm.tweet("PHP�ō�");
		murayama.tweet("�����͋��j��");
		kzm.tweet("Java�ō�");
		
		sano.tweet("Hello");
		sano.tweet("World");
		
		kzm.showTimeLine();
		murayama.showTimeLine();
		sano.showTimeLine();
		
		}
		
}
