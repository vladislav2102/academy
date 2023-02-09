package by.academy.finalwork.task1;

public class Task1 {
	public static String stringConversion(String string) {
		StringBuilder sb = new StringBuilder(string);
		int count = 1;
		for (int i = 0; i < sb.length(); i++) {
			if (i == sb.length() - 1) {
				sb.append(count);
				break;
			} else if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i + 1);
				count++;
				i--;
			} else if (sb.charAt(i) != sb.charAt(i + 1)) {
				sb.insert(i + 1, count);
				i++;
				count = 1;
			}
		}
		if (sb.length() < string.length()) {
			return sb.toString();
		} else {
			return string;
		}
	}

	public static void main(String[] args) {

		String s = "ааbсссссааа";
		String s1 = stringConversion(s);
		System.out.println(s1);
	}
}
