package data_structures;

import java.util.ArrayList;

public class Factors {
	static void factors1(int a) {
		for(int i=1;i<=a;i++) {
			if(a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	static void factors2(int n) {
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				if(n/i == i) {
					System.out.print(i+ " ");
				}else {
					System.out.print(i + " " + n/i + " ");

				}
			}
		}
	}
	
	//both time and space will be O(sqrt(n))
	static void factors3(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				if(n/i == i) {
					System.out.print(i+ " ");
				}
				else {
					System.out.print(i + " ");
					list.add(n/i);
				}
			}
		}
		for(int i=list.size() - 1; i>=0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
public static void main(String[] args) {
	factors1(20);
	System.out.println();
	factors2(30);
	System.out.println();
	factors3(30);
}
}
