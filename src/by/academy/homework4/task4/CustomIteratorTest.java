package by.academy.homework4.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomIteratorTest {

	public static void main(String[] args) {

		Integer [] array = {1, 2, 3, 4, 5};

		CustomIterator<Integer> iterator = new CustomIterator<>(array);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator.remove();

		array = iterator.getArray();

		System.out.println(Arrays.toString(array));

		iterator.remove();

		System.out.println(iterator.next());

		iterator.remove();

		array = iterator.getArray();

		System.out.println(Arrays.toString(array));
	}
}
