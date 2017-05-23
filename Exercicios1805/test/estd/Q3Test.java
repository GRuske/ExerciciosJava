package estd;

import org.junit.*;

public class Q3Test {
	@Test
	public void q3Test(){
		Q3 q3 = new Q3();
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		int[] result = q3.toArray(stack);
		
		Assert.assertTrue(result[0] == 4);
	}
}
