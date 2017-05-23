package estd;

import org.junit.*;

public class Q1Test {
	@Test
	public void testQ1() {
		Q1 testq1 = new Q1();
		
		int[] array = {1,2,3,4};
		
		Stack<Integer> stack = testq1.toStack(array);
		
		Assert.assertTrue(stack.getSize() == 3);
		
	}
	
}
