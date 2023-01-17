package by.academy.homework5;

import java.util.*;

public class Task5 {

	public static void main(String[] args) {

		String string = "Hello World!";
		System.out.println(string);

		Map<Character, Integer> map = new HashMap<>();

		char[] chars = string.toCharArray();

		System.out.println(chars);

		for (int i = 0; i < chars.length; i++) {
			int k = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] != '\u0000' && chars[i] == chars[j]) {
					k++;
					chars[j] = '\u0000';
				}
			}
			if (chars[i] != '\u0000') {
				map.put(chars[i], k);
			}
		}

		System.out.println(map);
	}
}
