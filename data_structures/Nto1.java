package data_structures;

public class Nto1 {
	static void fun(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	static void funrev(int n) {
		if(n == 0) {
			return;
		}
		
		funrev(n-1);
		System.out.println(n);
	}
	
	//concept
	static void concept(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		concept(--n);
		 
		//this will give error because it will first pass the value and then it will subtract
		//concept(n--);
	}
public static void main(String[] args) {
	fun(5);
	System.out.println();
	funrev(5);
	System.out.println();
	concept(5);
}
}
