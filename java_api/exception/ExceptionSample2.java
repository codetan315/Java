package exception;

public class ExceptionSample2 {

	public static void main(String[] args) {

		try {
			String[] names = {"Java", "PHP", "Ruby"};
			for (int i = 0; i <= names.length; i++) {
				System.out.println(names[i]);
			}
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch");
		}

	}

}
