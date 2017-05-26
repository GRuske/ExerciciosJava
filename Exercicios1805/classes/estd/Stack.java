package estd;

import java.util.List;

public interface Stack<E> {
	
	
	void push(E e);
	
	E pop();
	
	E top();
	
	int getSize();
	
	boolean isEmpty();	
	//3
	List<E> pop(int n);
	//4
	E[] clear();
	//5
	Stack<E> cloneStack();
}
