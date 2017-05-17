package exception;

public class ExceptionSample3 {

	public static void main(String[] args) {

		try {
			MyCalculator myCalculator = new MyCalculator();
			int result1 = myCalculator.divide(10, 2);
			System.out.println(result1);

			int result2 = myCalculator.divide(10, 0);
			System.out.println(result2);
		} catch (MyException e) {
			System.out.println("catch");
			e.printStackTrace();
		}

	}

}
