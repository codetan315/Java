package util;
import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {

		Set<String> langSet = new HashSet<>();
		langSet.add("Java");
		langSet.add("PHP");
		langSet.add("Ruby");

		showSizeAndElements(langSet);

		langSet.remove("Java");

		showSizeAndElements(langSet);

	}

	private static void showSizeAndElements(Set<String> langSet) {

		System.out.println(langSet.size());
		for (String lang : langSet) {
			System.out.println(lang);
		}
//		Iterator<String> it = langSet.iterator();
//		while (it.hasNext()) {
//			String lang = it.next();
//			System.out.println(lang);
//		}

	}

}
