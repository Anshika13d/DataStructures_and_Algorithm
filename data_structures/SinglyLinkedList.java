package data_structures;

//HERE WE ARE ADDING ELEMENTS FROM THE HEAD
class LL{
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	public void insertFirst(int value)
	{
		Node node = new Node(value);  //here a new box is created just a box nothing else
		node.next = head;             //here that new box is connecting to head
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size += 1;
	}
	
	public void insertLast(int value) {
		if(tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insertanywhere(int value, int index) {
		if(index == 0) {
			insertFirst(value);
			return;
		}
		if(index == size) {
			insertLast(value);
		    return;
		}
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}
	
	//INSERT USING RECURSION
	public void insertRec(int index, int value) {
		//in the end you are just gonna return head
		head = insertRec(index, value, head);
	}
	private Node insertRec(int index, int value, Node node) {
		if(index == 0) {
			Node temp = new Node(value, node);
			size++;
			return temp;
		}
		node.next = insertRec(index-1, value, node.next);
		
		return node;
	}
	
	public int deleteFirst() {
		int value = head.value;  
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return value;   //return the value which was removed
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		Node secondLast = get(size - 2);
		int value = tail.value;
		tail = secondLast;
		tail.next = null;
		
		return value;
	}
	public Node get(int index) {
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		return node;
	}
	
	public int deleteanywhere(int index) {
		if(index == 0) {
			
			return deleteFirst();
		}
		if(index == size) {
			
			return deleteLast();
		}
		Node prev = get(index - 1);
		int value = prev.next.value;   //here we need the value which is deleted
		prev.next = prev.next.next;    //here we are pointing 
		return value;
	}
	
	public Node find(int value) {
		Node node = head; //starting to search from head
		while(node != null) {
			if(node.value == value) {  //if value of that node = value return that node
				return node;
			}
			node = node.next; //otherwise move forward
		}
		return null;  //if value not found then return null
	}
	
	//REVERSING A LINKED LIST USING RECURSION
	private void reverserecursion(Node node) {
		if(node == null) {
			head = tail;
			return;
		}
		reverserecursion(node);
		tail.next = node;
		tail = node;
		tail.next = null;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	private class Node{
		private int value;
		private Node next;
		
		Node(int value){
			this.value = value;
		}
		
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertFirst(10);
		list.insertFirst(45);
		
		list.insertLast(89);
		list.insertLast(99);
		
		list.insertanywhere(500, 3);
		
		list.display();
		
		System.out.println("deleted element: "+list.deleteFirst());
		list.display();
		
		System.out.println("deleted element: "+list.deleteLast());
		list.display();
		
		System.out.println("deleted element: "+list.deleteanywhere(2));
		list.display();
		
		list.insertRec(3, 88);
		list.display();

	}

}
