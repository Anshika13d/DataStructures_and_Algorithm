package binary_tree;

import java.util.Scanner;

class Binary_tree{
	
	private static class Node {
		int value;
		Node left;
		Node rigth;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	//creating the root node
	private Node root;
	
	public void populate(Scanner sc) {
		System.out.println("Enter the root value: ");
		int value = sc.nextInt();
		root = new Node(value);  //creating a new node for root
		populate(sc, root);
	}

	private void populate( Scanner sc, Node node) {
		System.out.println("Do you want to insert left value?" + node.value);
		Boolean ans = sc.nextBoolean();
		if(ans) {
			System.out.println("Enter left value: " + node.value);
			int value = sc.nextInt();
			node.left = new Node(value);  //creating new node for left
			
			//calling the recursive function to add on the left side again
			populate(sc, node.left);
		}
		
		System.out.println("Do you want to insert right value? " + node.value);
		Boolean right = sc.nextBoolean();
		if(right) {
			System.out.println("Enter the right value: " + node.value);
			int value = sc.nextInt();
			node.rigth = new Node(value);
			//calling the recursive function to add on the right side again
			populate(sc, node.rigth);
		}
	}
	
	public void display() {
		display(this.root, "");
	}

	private void display(Node node, String indent) {
		if(node == null) {
			return;
		}
		System.out.println(indent + node.value);
		display(node.left, indent + '\t');
		display(node.rigth, indent + '\t');

	}
	
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.rigth);
	}
	
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root2) {
		if(root2 == null) {
			return;
		}
		
		inOrder(root2.left);
		System.out.println(root2.value);
		inOrder(root2.rigth);
	}
	
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node root2) {
		if(root2 == null) {
			return;
		}
		
		postOrder(root2.left);
		postOrder(root2.rigth);
		System.out.println(root2.value);
	}
	
	
}

public class Binary_tree_implement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Binary_tree bt = new Binary_tree();
		bt.populate(sc);
		bt.display();
		bt.preOrder();
	}
}
