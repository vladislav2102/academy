package by.academy.homework5;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {

		int[] array = new int[8];

		for(int i = 0; i < 10; i++) {
			try{
				array[i] = i;
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Array is to small, expand the array");
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
