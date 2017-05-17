package lang;
public class WrapperSample3 {
	public static void main(String[] args) {

		String[] array = {"true", "True", "truE", "yes"};
		for (String s : array) {
			boolean condition = Boolean.parseBoolean(s);
			if (condition) {
				System.out.println(s + " is true");
			} else {
				System.out.println(s + " is not true");
			}
		}

	}
}
