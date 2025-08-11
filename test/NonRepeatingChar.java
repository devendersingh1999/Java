package test;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
	public static void main(String[] args) {

		String word = "swiss";

		Map<Character, Integer> hm = new HashMap<>();

		for (char ch : word.toCharArray()) {

			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		for (char ch : word.toCharArray()) {

			if (hm.get(ch) == 1) {
				System.out.println("first non repeating character :" + ch);
				return;
			}

		}
	}
}
