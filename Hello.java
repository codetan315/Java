package java8;

import java.util.Arrays;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Tanaka", "Mizuki", "Ogi");
		
//		for (String name : nameList) {
//			System.out.println(name);
//		}
		
		nameList.stream().forEach(n -> System.out.println(n));
		
	}
}
