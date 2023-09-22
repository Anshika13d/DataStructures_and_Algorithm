package binary_tree;

class BST{
	public class Node{
		private int value;
		private int height;
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
	
	BST(){
		
	}
	
	public int height(Node node) {
		if(node == null) {
			return -1;
		}
		
		return node.height;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int value) {
		root = insert(value, root);
	}
	
	public Node insert(int value, Node node) {
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
		
		//change the height also
		node.height = Math.max(height(node.left), height(node.right))+1;
		
		return node;
	}
	
	public void populate(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			this.insert(nums[i]);
		}
	}
	
	//for sorted array
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

	public boolean balanced() {
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

public class Binary_Search_Tree {
	public static void main(String[] args) {
		BST tree = new BST();
		int[] nums = {3,9,5,2,10,4,13,8};
		tree.populate(nums);
		tree.display();
	}

}
