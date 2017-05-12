package templatemethod;

public class IncrementCounter extends TemplateMethod {
	
	public void count(int max) {
		
		start();
		
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
		
		end();
		
	}
	
}
