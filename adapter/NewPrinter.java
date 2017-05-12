package adapter;

public class NewPrinter extends LegacyPrinter implements Printable {
	
	public void print(String line) {
		System.out.println(line);
	}
	
}
