package data_structures;

class CustomQueue{
	private int[] data;
	private static final int DEFAULT_SIZE = 5;
	
	int end = 0;
	
	public CustomQueue(){
		this(DEFAULT_SIZE);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}
	
	private boolean isfull() {
		return end == data.length;
	}
	
	private boolean isEmpty() {
		return end == 0;
	}
	
	//inserting
	public boolean insert(int item) {
		if(isfull()) {
			return false;
		}
		data[end++] = item;
		
		return true;
	}
	
	
	//removing the item
	public int remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int remove = data[0];
		
		//shift all elements to left
		for(int i=1;i<end;i++) {
			data[i-1] = data[i];
		}
		//decreasing the size
		end--;
		return remove;
	}
	
	//displaying front element
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("emptyyyyyyyyyyyy");
		}
		return data[0];
	}
	
	//displaying all the items
	public void display() {
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i] + " ");
		}
		System.out.println("end");
	}
}

public class Custom_Queue {
	public static void main(String[] args) throws Exception {
		CustomQueue queue = new CustomQueue();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		queue.display();
		
		System.out.println();
		System.out.println("item removed - " + queue.remove());
		queue.display();

	}
	
}
