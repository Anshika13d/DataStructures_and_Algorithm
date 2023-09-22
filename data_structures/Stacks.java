package data_structures;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//LIFO
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
