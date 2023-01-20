package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.lang.Integer;

public class Task2 {

	public static String typeCollection (List<Integer> list) {
		if (String.valueOf(list.getClass()).equals("class java.util.ArrayList")) {
			return "ArrayList";
		} else if (String.valueOf(list.getClass()).equals("class java.util.LinkedList")) {
			return  "LinkedList";
		} else {
			return "list";
		}
	}
	public static void addition (List<Integer> list) {;
		String s = typeCollection(list);
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			list.add(i, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Время добавления 1000000 элементов в коллекцию типа " + s + " = " + (end - start) + " мс");
	}

	public static void getElements (List<Integer> list) {
		String s = typeCollection(list);
		Random random = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.get(random.nextInt(0,1000000));
		}
		long end = System.currentTimeMillis();
		System.out.println("Время получения 10000 случайных элементов из коллекции типа " + s + " = " + (end - start) + " мс");
	}

	public static void main(String[] args) {

		List<Integer> listArr = new ArrayList<>();

		Task2.addition(listArr);

		List<Integer> listLin = new LinkedList<>();

		Task2.addition(listLin);

		Task2.getElements(listArr);
		Task2.getElements(listLin);

	}


}
