package by.academy.homework7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		Map<Double, String> list = Stream.generate(() -> new Random().nextLong(0, 100))
				.limit(100)
				.map(i -> i * Math.PI - 20)
				.filter(i -> i < 100)
				.sorted()
				.skip(3)
				.distinct()
				.collect(Collectors.toMap(i -> i, k -> "Number: " + k));
		System.out.println(list);
	}
}
