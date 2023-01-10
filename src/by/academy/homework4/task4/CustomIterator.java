package by.academy.homework4.task4;

import java.util.Arrays;
import java.util.Iterator;

public class CustomIterator<T> {


	private T[] array;
	private int index = -1;

	private boolean isHelp;

	public CustomIterator() {
	}

	public CustomIterator(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean hasNext() {
		if ((index + 1) < array.length) {
			return true;
		} else {
			return false;
		}
	}

	public T next() {
		if ((index + 1) < array.length && array[index + 1] != null) {
			index++;
			isHelp = true;
			return array[index];
		} else if ((index + 1) == array.length) {
			index = 0;
			isHelp = true;
			return array[index];
		} else {
			return null;
		}
	}

	public void remove() {
		if (index != -1 && isHelp) {
			T[] arrayTemp = Arrays.copyOf(array, array.length - 1);
			System.arraycopy(array, index + 1, arrayTemp, index, array.length - index - 1);
			array = arrayTemp;
			isHelp = false;
			index--;
		}
	}
}

// Посмотрете DEAL в 3-й домашке, на исправление оценки не претендую, хотя бы для себя.

