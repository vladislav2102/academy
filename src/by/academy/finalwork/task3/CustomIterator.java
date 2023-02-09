package by.academy.finalwork.task3;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator {

	private Iterator[] arrayIterator;
	private int index = 0;

	public CustomIterator(Iterator[] arrayIterator) {
		super();
		this.arrayIterator = arrayIterator;
	}

	@Override
	public boolean hasNext() {
		for (int i = 0; i < arrayIterator.length; i++) {
			if (index + i < arrayIterator.length && arrayIterator[index + i].hasNext()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object next() {
		if (arrayIterator[index].hasNext()) {
			return arrayIterator[index].next();
		} else if (arrayIterator[++index].hasNext()) {
			return arrayIterator[index].next();
		} else {
			return null;
		}
	}
}

// И посмотрите пожалуйста еще раз OurListener в 7-й домашке, в Test1 я в 3м тесте сделал намерено ошибку и не выводит
// на нем сообщения об успешном выполнении. С виду костыль тот еще, но вроде работает, Вы просто отметили что работать не будет
