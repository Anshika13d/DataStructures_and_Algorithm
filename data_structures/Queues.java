package data_structures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		Deque<Integer> deq = new ArrayDeque<>();
		deq.add(90);
		deq.addLast(100);
		System.out.println(deq.remove());
	}

}
