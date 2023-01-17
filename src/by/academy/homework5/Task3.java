package by.academy.homework5;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {

		Integer[][] array = {{1, 2, null}, {3, 4}, {5, 6, 7, 8}};

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

			Task3Help<Integer> iterator = new Task3Help<>(array);

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			System.out.println(iterator.hasNext());
			System.out.println(iterator.next());

			Integer[][] arrayTest = new Integer[0][0];

			Task3Help iteratorTest = new Task3Help<>(arrayTest);

			System.out.println(Arrays.toString(arrayTest));

			System.out.println(iteratorTest.next());

	}
}
