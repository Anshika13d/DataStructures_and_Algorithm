package data_structures;

public class Sum_of_digits {
	static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		int rem = n % 10;
		return rem + sum(n/10);
	}
	static int mul(int n) {
		if(n%10 == n) {
			return n;
		}
		int rem = n % 10;
		return rem * sum(n/10);
	}
public static void main(String[] args) {
	int a = 2313;
	System.out.println(sum(a));
	System.out.println();
	System.out.println(mul(a));
}
}
