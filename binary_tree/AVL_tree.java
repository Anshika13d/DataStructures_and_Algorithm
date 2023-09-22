package binary_tree;

import binary_tree.BST.Node;

class AVL{
	public class Node{
		private int height;
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value = value;
		}
		

		public int getValue() {
			return value;
		}
	}
	
	private Node root;
	
	AVL(){
		
	}
		
	public int height() {
		return height(root);
	}
	
	public int height(Node node) {
		if(node == null) {
			return -1;
		}
		
		return node.height;
	}
	
	
	public void insert(int value) {
		root = insert(value, root);
	}
	
	private Node insert(int value, Node node) {
		if(node == null) {
			node = new Node(value);
			return node;
		}
		
		if(value < node.value) {
			node.left = insert(value, node.left);
		}
		if(value > node.value) {
			node.right = insert(value, node.right);
		}
		
		node.height = Math.max(height(node.left), height(node.right)) + 1;
		
		return rotate(node);
		//this line actually means it is fixing the tree and returning the node itself
	}
	
	private Node rotate(Node node) {
		//left case
		if(height(node.left) - height(node.right) > 1) {
			if(height(node.left.left) - height(node.left.right) > 0) {
				 return Rightrotate(node);
			}
			if(height(node.left.left) - height(node.left.right) < 0) {
				node.left = Leftrotate(node.left);
				return Rightrotate(node);
			}
		}
		
		if(height(node.left) - height(node.right) < -1) {
			if(height(node.right.left) - height(node.right.right) < 0) {
				 return Leftrotate(node);
			}
			if(height(node.right.left) - height(node.right.right) > 0) {
				node.right = Rightrotate(node.right);
				return Leftrotate(node);
			}
		}
		
		return node;
	}

	private Node Rightrotate(Node p) {
			//right rotate
				Node c = p.left;
				Node t3 = c.right;
				
				c.right = p;
				p.left = t3;
				
				p.height = Math.max(height(p.left), height(p.right) + 1);
				c.height = Math.max(height(c.left), height(c.right) + 1);

		
		return c;
	}

	
	private Node Leftrotate(Node c) {
	
				Node p = c.right;
				Node t2 = p.left;
				
				
				p.left = c;
				c.right = t2;
				
				p.height = Math.max(height(p.left), height(p.right) + 1);
				c.height = Math.max(height(c.left), height(c.right) + 1);


		return p;
	}
	public void populate(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			this.insert(nums[i]);
		}
	}
	
	public void populateSorted(int[]nums) {
		populateSorted(nums, 0, nums.length);
	}
	
	private void populateSorted(int[] nums, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int mid = (start + end) / 2;
		
		this.insert(nums[mid]);
		populateSorted(nums, start, mid);
		populateSorted(nums, mid+1, end);
	}

	
	public boolean balanced(Node node) {
		return baalanced(root);
	}
	
	public boolean baalanced(Node node) {
		if(node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <= 1 && baalanced(node.left) && baalanced(node.right);
	}
	
	public void display() {
		display(this.root,"Root node: ");
	}

	private void display(Node node, String details) {
		if(node == null) {
			return;
		}
		System.out.println(details + node.value);
		display(node.left,"left of " + node.value + "is: ");
		display(node.right, "right of " + node.value + "is: ");
	}
}

public class AVL_tree {
	public static void main(String[] args) {
		AVL avl = new AVL();
		
		//inserting 1000 nodes
		for(int i=0;i<10;i++) {
			avl.insert(i);
		}
		
		//returning the height
		System.out.println(avl.height());
	}

}
