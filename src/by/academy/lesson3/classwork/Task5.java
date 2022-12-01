package by.academy.lesson3.classwork;

public class Task5 {
	public static void main(String[] args) {

		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;
		int week;

		sec = s % 60;

		m = (s - sec) / 60;

		min = m % 60;

		h = (m - min) / 60;

		hour = h % 24;

		d = (h - hour) / 24;

		day = d % 7;

		w = (d - day) / 7;

		System.out.println(w + " недель " + day + " суток " + hour + " часов " + min + " минут " + sec + " секунд");
	}
}
