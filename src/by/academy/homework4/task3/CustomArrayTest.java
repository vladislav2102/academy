package by.academy.homework4.task3;

public class CustomArrayTest {

	public static void main(String[] args) {

		CustomArray<Integer> customArray = new CustomArray<>(0);

		customArray.print();
		System.out.println(customArray.getLast());
		System.out.println(customArray.getFirst());
		System.out.println(customArray.size());
		System.out.println(customArray.indexLastNotNull());

		customArray.add(1);
		customArray.add(2);
		customArray.add(3);

		customArray.print();

		System.out.println(customArray.getLast());
		System.out.println(customArray.getFirst());
		System.out.println(customArray.size());
		System.out.println(customArray.indexLastNotNull());

		customArray.removeIndex(1);

		customArray.print();

		customArray.removeObj(3);

		customArray.print();

	}
}
