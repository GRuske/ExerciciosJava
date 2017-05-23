package estd;

import java.util.List;

import org.junit.*;

public class Q2Test {
	
	@Test
	public void popTest(){
		
		Stack<Integer> stack = new ArrayStack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		List<Integer> result = stack.pop(2);
		
		Assert.assertTrue(result.size() == 2);
		Assert.assertEquals(result.get(0), Integer.valueOf(4));
		
	}
}
