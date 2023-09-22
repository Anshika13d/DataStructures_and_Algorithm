package data_structures;

class CLL{
	private Node head;
	private Node tail;
	
	public CLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	//DELETION
	public void delete(int value) {
		Node node = head;
		if(node ==  null) {
			return;
		}
		if(node.value == value) {
			head = head.next;
			tail = head;
			return;
		}
		do {
			Node n = node.next;
			
			if(n.value == value) {
				node.next = n.next;
				break;
			}
			node = node.next;
		}while(node != head);
		
	}
	
	public void display() {
		Node node = head;
		if(head != null) {
			do {
				System.out.print(node.value + "->");
				node = node.next;
			}
			while(node != head);
		}
		System.out.println("end");
		
	}
	
	private class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
}

public class CircularLinkedList {
	public static void main(String[] args) {
		CLL list = new CLL();
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		list.insertLast(60);
		
		list.display();
		
		list.delete(40);
		list.display();
	}
	
}
