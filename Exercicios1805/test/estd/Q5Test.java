package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {
	@Test
	public void closeTest() {
		
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		Stack<Integer> clone = stack.cloneStack();
		
		Assert.assertTrue(clone.getSize() == stack.getSize());
		
	}

}
