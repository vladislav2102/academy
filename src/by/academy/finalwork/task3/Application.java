package by.academy.finalwork.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		ArrayList<Integer> arrayList3 = new ArrayList<>();

		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);

		arrayList2.add(4);
		arrayList2.add(5);
		arrayList2.add(6);

		arrayList3.add(7);
		arrayList3.add(8);
		arrayList3.add(9);

		Iterator<Integer> iterator1 = arrayList1.iterator();
		Iterator<Integer> iterator2 = arrayList2.iterator();
		Iterator<Integer> iterator3 = arrayList3.iterator();

		Iterator[] arrayIterator = {iterator1, iterator2, iterator3};

		CustomIterator<Integer> customIterator = new CustomIterator<>(arrayIterator);

		System.out.println(customIterator.hasNext());

		while (customIterator.hasNext()) {
			System.out.println(customIterator.next());
		}

	}
}
