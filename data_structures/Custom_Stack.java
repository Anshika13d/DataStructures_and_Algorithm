package data_structures;

class CustomStack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int ptr = -1;
	
	public CustomStack(){
		this(DEFAULT_SIZE);
	}

	public CustomStack(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		if(isfull()) {
			System.out.println("Stack is full");
			return false;
		}
		
		ptr++;
		data[ptr] = item;
		return true;
	}
	
	public int pop() throws StackException {
		if(isEmpty()) {
			throw new StackException("Can not pop from an empty stack");
		}
		int removed = data[ptr];
		ptr--;
		return removed;
	}
	
	public int peek() throws StackException{
		if(isEmpty()) {
			throw new StackException("Can not peek from an empty stack");
		}
		return data[ptr];
	}

	public boolean isfull() {
		
		return ptr == data.length -1;
	}
	
	public boolean isEmpty() {
		return ptr == -1;
	}
	
}
class StackException extends Exception{
	public StackException(String message) {
		super(message);
	}
}
public class Custom_Stack{
	public static void main(String[] args) throws StackException {
		CustomStack cs = new CustomStack(5);
		cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(40);
		cs.push(50);

		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());

	}

	
	
}
