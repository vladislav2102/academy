package by.academy.homework4.task1;

public class CustomDateTest {


	public static void main(String[] args) {

		CustomDate customDate1 = new CustomDate(ValidateDate.dateInput());

		System.out.println(customDate1.toString());

		System.out.println(customDate1.getDay().getDay());

		customDate1.dayWeek();

		CustomDate customDate2 = new CustomDate(ValidateDate.dateInput());

		customDate2.differenceDays(customDate1);

		System.out.println(customDate1.isLeapYear());

	}
}
