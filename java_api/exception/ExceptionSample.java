package exception;

public class ExceptionSample {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.toUpperCase());
			System.out.println("try");
		} catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}

}
