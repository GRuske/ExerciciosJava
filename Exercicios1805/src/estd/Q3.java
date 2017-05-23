package estd;

public class Q3 {
	public int[] toArray(Stack<Integer> stack) {

		int[] array = new int[stack.getSize()];
		int x = 0;

		while (!stack.isEmpty()) {
			int aux = stack.pop();
			if (aux % 2 == 0) {
				array[x++] = aux;
			}

		}

		return array;
	}
}
