package by.academy.homework5;

import java.util.Iterator;

public class Task3Help<T> implements Iterator<T> {

	private T array[][];
	private int index1 = 0;
	private int index2 = 0;

	public Task3Help() {
		super();
	}

	public Task3Help(T[][] array) {
		this.array = array;
	}

	public T[][] getArray() {
		return array;
	}

	public void setArray(T[][] array) {
		this.array = array;
	}

	public int getIndex1() {
		return index1;
	}

	public void setIndex1(int index1) {
		this.index1 = index1;
	}

	public int getIndex2() {
		return index2;
	}

	public void setIndex2(int index2) {
		this.index2 = index2;
	}

	@Override
	public boolean hasNext() {
		return index1 < array.length && index2 < array[index1].length;
	}

	@Override
	public T next() {
		if (index1 < array.length && index2 < array[index1].length) {
			T temp = array[index1][index2];
			if (index2 + 1 < array[index1].length) {
				index2++;
			} else if (index2 + 1 >= array[index1].length && index1 + 1 < array.length) {
				index1++;
				index2 = 0;
			} else {
				index1 = 0;
				index2 = 0;
				System.out.println("Достигнут последний элемент массива");
			}
			return temp;
		} else {
			return null;
		}
	}
}