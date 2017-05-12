package singleton;

public class Main {
	
	public static void main(String[] args) {
		
		SingletonCounter counter1 = SingletonCounter.getInstance();
		SingletonCounter counter2 = SingletonCounter.getInstance();
		
		counter1.setMax(5);
		counter1.countUp();
		counter2.countUp();
		
	}
	
}
