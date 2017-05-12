package adapter;

public class Main {
	
	public static void main(String[] args) {
		
		String printData = "Hello World";
		
		// Printable printer = new LegacyPrinter();
		Printable printer = new NewPrinter();
		printer.print(printData);
		
	}

}
