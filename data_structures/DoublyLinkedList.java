package data_structures;


class DLL{
	
	Node head;
	Node tail;
	
	public void insertFirst(int value) {
		Node node = new Node(value);  //creating a box here
		node.next = head;    //pointing it to head
		node.prev = null;    //pointing previous to null
		if(head != null) {    //if head is null we will have null pointer exception thats why this check
			head.prev = node;
		}
		head = node;   //finally pointing head to node
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		Node last = head;
		
		node.next = null;
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
	    last.next = node;
	    node.prev = last;
	}
	
	//from here this find() method and insertafter() method will be inserting the element
	//after the given value
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
	public void insertAfter(int after, int value) {
		Node p = find(after);
		if(p == null) {
			System.out.println("does not exist");
			return;
		}
		Node node = new Node(value);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		
		if(node.next != null) {
		   node.next.prev = node;
		}
	}
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node != null) {
			System.out.print(node.value + "->");
			last = node;
			node = node.next; //printing the element then moving forward
		}
		System.out.println("END");
		
		System.out.println("Printing in reverse");
		while(last != null) {
			System.out.print(last.value + "->");
			last = last.prev;
		}
		System.out.println("Start");
	}
	
	private class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
		}
		Node(int value, Node next, Node prev){
			this.next = next;
			this.value = value;
			this.prev = prev;
		}
	}
}
public class DoublyLinkedList {
	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertFirst(23);
		list.insertFirst(33);
		list.insertFirst(43);
		list.insertFirst(53);
		list.insertFirst(63);
		list.insertFirst(73);
		list.insertFirst(83);
		
		list.display();
		
		System.out.println();
		list.insertLast(100);
		list.display();
		
		System.out.println();
		list.insertAfter(43, 1000);
		list.display();
		
		
	}
}
