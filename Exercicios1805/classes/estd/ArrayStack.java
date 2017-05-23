package estd;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {

	private E[] array;

	private int position = 0;

	public ArrayStack() {
		array = (E[]) new Object[20];
	}

	public ArrayStack(int l) {
		array = (E[]) new Object[l];
	}

	@Override
	public void push(E e) {
		// system.arraycopy
		if (position == array.length) {
			int len = ((array.length) == 0 ? 1 : array.length);
			E[] temp = (E[]) new Object[len * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}

		array[position] = e;
		position++;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[position - 1];
			array[position - 1] = null;
			position--;
			return aux;
		}
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return array[position - 1];
		}
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return position == 0;
	}

	// 2
	@Override
	public List<E> pop(int n) {
		List<E> list = new ArrayList<>();
		if (n > position) {
			n = position;
		}

		for (int i = 0; i < n; i++) {
			if (!isEmpty()) {
				list.add(pop());
			}
		}

		return list;
	}

	// 4
	@Override
	public E[] clear() {

		E[] array = (E[]) new Object[getSize()];
		int x = 0;
		while (!isEmpty()) {
			array[x++] = pop();
		}

		return array;
	}

	// 5
	@Override
	public Stack<E> cloneStack() {
		Stack<E> stack = new ArrayStack<>(getSize());

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				stack.push(array[i]);
			}

		}

		return stack;
	}
}
