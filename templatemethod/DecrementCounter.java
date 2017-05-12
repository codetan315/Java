package templatemethod;

public class DecrementCounter extends TemplateMethod {
	
	public void count(int min) {
		
		start();
		
		for (int i = 100; i >= min; i--) {
			System.out.println(i);
		}
		
		end();
		
	}
	
}
