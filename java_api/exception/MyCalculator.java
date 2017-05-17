package exception;

public class MyCalculator {

	public int divide(int x, int y) throws MyException {
		if (y == 0) {
			throw new MyException("by 0");
		}
		return x / y;
	}

}
