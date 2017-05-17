package util;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample2 {

	public static void main(String[] args) {

		Map<String, String> langMap = new HashMap<>();

		langMap.put("J", "Java");
		langMap.put("P", "PHP");
		langMap.put("R", "Ruby");

		showSizeAndElements(langMap);

	}

	private static void showSizeAndElements(Map<String, String> langMap) {

		System.out.println(langMap.size());

		Set<String> keySet = langMap.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + langMap.get(key));
		}

	}

}
