package estd;

public class Q1a {

	public int[] invert( int[] a){
		
		Stack<Integer> stack = new ArrayStack<>(a.length);
		
		int[] temp = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			stack.push(a[i]);
		}
		
		for (int x = 0; x < a.length; x++) {
			temp[x] = stack.pop();
		}
		
		return temp;
	}
} 
