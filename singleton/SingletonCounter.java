package singleton;

public class SingletonCounter {
	
	private int max;
	
	private static SingletonCounter singleton = new SingletonCounter();
	
	public static SingletonCounter getInstance() {
		return singleton;
	}
	
	public void countUp() {
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
}
