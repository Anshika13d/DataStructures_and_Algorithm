package data_structures;

public class Count {
	static int con(int n) {
		return helper(n, 0);
	}
//special example to return same value to above function calls
	private static int helper(int n, int c) {
		if(n == 0) {
			return c;
		}
		int rem = n % 10;
		if(rem == 0) {
			return helper(n/10, c+1);
		}
		return helper(n/10, c);
	}
public static void main(String[] args) {
	int a = 30204;
	System.out.println(con(a));
}
}
