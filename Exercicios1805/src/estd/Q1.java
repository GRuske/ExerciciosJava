package estd;

public class Q1 {

	public Stack<Integer> toStack(int[] n) {

		Stack<Integer> stack = new ArrayStack<>(n.length);

		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}

		return stack;
	}
}
