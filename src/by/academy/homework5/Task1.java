package by.academy.homework5;

import java.util.*;

public class Task1 {

	public static <T> void listUniversal1 (List<T> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) != null && list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
	}

	public static <T> Set<T> listUniversal2 (List<T> list) {
		return new TreeSet<>(list);

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);

		System.out.println(list);
		System.out.println(Task1.listUniversal2(list));

		Task1.listUniversal1(list);

		System.out.println(list);

		List<Integer> listL = new LinkedList<>();
		listL.add(1);
		listL.add(1);
		listL.add(2);
		listL.add(2);
		listL.add(3);
		listL.add(3);

		System.out.println(listL);

		System.out.println(Task1.listUniversal2(listL));

		Task1.listUniversal1(listL);

		System.out.println(listL);
	}
}
