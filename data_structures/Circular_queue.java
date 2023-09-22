package data_structures;

class CircularQueue{
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	protected int end = 0;
	protected int front = 0;
	private int size = 0;
	
	CircularQueue(){
		this(DEFAULT_SIZE);
	}

	public CircularQueue(int size) {
		this.data = new int[size] ;
	}
	
	public boolean isFull() {
		return size == data.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		
		data[end++] = item;
		end = end % data.length;
		size++;
		return true;
	}
	
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int remove = data[front++];
		front = front % data.length;
		size--;
		return remove;
	}
	
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("emptyyyyyyyyyyyy");
		}
		return data[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("emptyyyy");
			return;
		}
		int i = front;
		
		do {
			System.out.println(data[i]);
			i++;
			i %= data.length;
		}
		while(i != end);
		System.out.println("end");
	}
}

public class Circular_queue {
	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue();
		queue.insert(45);
		queue.insert(55);
		queue.insert(65);
		queue.insert(25);
		queue.insert(75);
		
		queue.display();
		
		
		System.out.println("\n" + queue.remove());

		queue.display();
	}

}
