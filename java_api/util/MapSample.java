package util;
import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {

		Map<String, String> langMap = new HashMap<>();
		langMap.put("J", "Java");
		langMap.put("P", "PHP");
		langMap.put("R", "Ruby");

		System.out.println(langMap.size());

		System.out.println(langMap.get("J"));
		System.out.println(langMap.get("P"));
		System.out.println(langMap.get("R"));

	}

}
