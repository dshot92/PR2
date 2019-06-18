import java.util.ArrayList;

public class Stack<E> {
	private ArrayList<E> stack;


	public Stack(){
		this.stack = new ArrayList<>();
	}


	public void push(E element){
		this.stack.add(element);
	}


	public E pop(){
		int index = this.stack.size() - 1;
		E result = this.stack.get(index);
		this.stack.remove(index);
		return result;
	}


	public E get(int i){
		E result = this.stack.get(i);
		return result;
	}


	public int size(){
		return this.stack.size();
	}


	public void clear(){
		this.stack.clear();		
	}
}
