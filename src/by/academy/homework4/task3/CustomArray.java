package by.academy.homework4.task3;

import java.util.Arrays;

public class CustomArray<T> {

	private static final int DEFAULT_CAPACITY = 16;

	private T[] customArray;

	private int index;
	private int indexIterator;

	public CustomArray() {
		super();
		this.customArray = (T[]) new Object[DEFAULT_CAPACITY];
		index = DEFAULT_CAPACITY;
	}

	public CustomArray(int capacity) {
		super();
		this.customArray = (T[]) new Object[capacity];
		index = capacity;
	}

	public void grow() {
		T[] newCustomArray = (T[]) new Object[customArray.length + 1];
		System.arraycopy(customArray, 0, newCustomArray, 0, customArray.length);
		customArray = newCustomArray;
	}

	public void add(T obj) {
		for (int i = 0; i < customArray.length; i++) {
			if (customArray[i] == null) {
				customArray[i] = obj;
				return;
			}
		}
		grow();
		customArray[index] = obj;
		index++;
	}

	public void print() {
		System.out.println(Arrays.toString(customArray));
	}

	public T get(int i) {
		if (customArray.length <= i) {
			System.out.println("Нет элемента под таким номером.");
			return null;
		}
		return customArray[i];
	}

	public T getLast() {
		if (index == 0) {
			return null;
		}
		return customArray[index - 1];
	}

	public T getFirst() {
		if (index == 0) {
			return null;
		}
		return customArray[0];
	}

	public int size() {
		return customArray.length;
	}

	public int indexLastNotNull() {
		if (index == 0) {
			System.out.println("В массиве нет элементов");
			return -1;
		}
		for (int i = customArray.length - 1; i >= 0; i--) {
			if (customArray[i] != null) {
				return i;
			}
		}
		System.out.println("Все элементы пустые");
		return -1;
	}

	public void removeIndex (int i) {
		T[] tempCustomArray = Arrays.copyOf(customArray, customArray.length - 1);
		System.arraycopy(customArray, i + 1, tempCustomArray, i, customArray.length - i - 1);
		customArray = tempCustomArray;
	}

	public void removeObj (T obj) {
		for(int i = 0; i < customArray.length; i++) {
			if(customArray[i].equals(obj)) {
				removeIndex(i);
				break;
			}
		}
	}
}

