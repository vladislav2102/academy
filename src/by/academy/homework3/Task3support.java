package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3support {

	static Pattern pattern = Pattern.compile("[0-3][0-9][///-][0-1][0-9][///-][0-9]{4}");

	public static void test(String date) {
		Matcher matcher = pattern.matcher(date);
		if (matcher.matches()) {
			String date1 = date.replaceAll("/|-", "");
			System.out.println("День: <" + date1.substring(0, 2) + ">\n" +
					"Месяц: <" + date1.substring(2, 4) + ">\n" +
					"Год: <" + date1.substring(4, 8) + ">\n");
		} else {
			System.out.println("Дата введена в неверном формате");
		}
	}
}
