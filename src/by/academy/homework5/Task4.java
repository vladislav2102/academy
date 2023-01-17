package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		Random random = new Random();

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arrayList.add(i, random.nextInt(1, 11));
		}

		System.out.println(arrayList);

		Iterator<Integer> iterator = arrayList.iterator();

		int max = 0;
		int temp;

		while (iterator.hasNext()) {
			temp = iterator.next();
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println("Самая высокая оценка: " + max);
	}
}
