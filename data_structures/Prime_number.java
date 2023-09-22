package data_structures;

public class Prime_number {
	static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		}
		int c = 2;
		while(c * c <= n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}
public static void main(String[] args) {
	int a = 20;
	for(int i=1;i<=a;i++) {
		System.out.println(i+" "+isprime(i));

	}
}
}
