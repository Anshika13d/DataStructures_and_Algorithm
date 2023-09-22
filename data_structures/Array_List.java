package data_structures;
import java.util.Scanner;
import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//syntax
		ArrayList<Integer> list = new ArrayList<Integer>(/*initialCapacity:*/ 10);
//		list.add(67);
//		list.add(90);
//		list.add(56);
//		list.add(9);
//		list.add(89);
//		list.add(100);
//		
//		System.out.println(list.contains(90));
//		System.out.println(list);
//		
//		list.set(0,99);
//		
//		list.remove(3);
//		System.out.println(list);
//		
		//input
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		
		//output
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
		}
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
