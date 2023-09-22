package data_structures;

public class Factoria {
	static int fact(int n) {
		if(n == 1) {
		return 1;
	}
		
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		int a = 4;
		System.out.println(fact(a));
	}
}
