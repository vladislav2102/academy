package by.academy.homework4.task1;

import java.time.LocalDate;

public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String date) {
		super();
		this.year = new Year(date);
		this.month = new Month(date);
		this.day = new Day(date);
	}

	public class Year {

		int year;

		public Year() {
			super();
		}

		public Year(String date) {
			super();
			this.year = Integer.parseInt(date.substring(6, 10));
		}

		public int getYear() {
			return year;
		}
	}

	public class Month {
		int month;

		public Month() {
			super();
		}

		public Month(String date) {
			super();
			this.month = Integer.parseInt(date.substring(3, 5));
		}

		public int getMonth() {
			return month;
		}
	}

	public class Day {
		int day;

		public Day() {
			super();
		}

		public Day(String date) {
			super();
			this.day = Integer.parseInt(date.substring(0, 2));
		}

		public int getDay() {
			return day;
		}
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public void dayWeek() {    //
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		switch (localDate.getDayOfWeek()) {
			case MONDAY:
				System.out.println(DayOfWeek.MONDAY);
				break;
			case TUESDAY:
				System.out.println(DayOfWeek.TUESDAY);
				break;
			case WEDNESDAY:
				System.out.println(DayOfWeek.WEDNESDAY);
				break;
			case THURSDAY:
				System.out.println(DayOfWeek.THURSDAY);
				break;
			case FRIDAY:
				System.out.println(DayOfWeek.FRIDAY);
				break;
			case SATURDAY:
				System.out.println(DayOfWeek.SATURDAY);
				break;
			case SUNDAY:
				System.out.println(DayOfWeek.SUNDAY);
				break;
		}
	}

	public void differenceDays(CustomDate customDate2) {
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		LocalDate localDate2 = LocalDate.of(customDate2.getYear().getYear(), customDate2.getMonth().getMonth(),
				customDate2.getDay().getDay());
		if (localDate.toEpochDay() < localDate2.toEpochDay()) {
			System.out.println("Количество дней в заданном промежутке: " + (localDate2.toEpochDay() - localDate.toEpochDay()));
		} else if (localDate.toEpochDay() >= localDate2.toEpochDay()) {
			System.out.println("Количество дней в заданном промежутке: " + (localDate.toEpochDay() - localDate2.toEpochDay()));
		}
	}

	public boolean isLeapYear() {
		return ((year.getYear() % 4 == 0) && (year.getYear() % 100 != 0)) || (year.getYear() % 400 == 0);
	}
}
