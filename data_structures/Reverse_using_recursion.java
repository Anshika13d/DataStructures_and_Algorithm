package data_structures;

public class Reverse_using_recursion {
	static int sum = 0;
	static void rev(int n) {
		if(n == 0) {
			return;
		}
		int rem = n % 10;
		sum = sum * 10 + rem;
		rev(n/10);
	}
	
	//sometimes you might need additional functions in the arguments 
	// in that case make another function
	static int rev2(int n) {
		int digits = (int)(Math.log10(n)) + 1;
		return digits(n, digits);
	}
private static int digits(int n, int digits) {
		if(n%10 == n) {
			return n;
		}
		int rem = n%10;
		return rem * (int)(Math.pow(10, digits - 1)) + digits(n/10, digits - 1);
	}

//check palindrome
  static boolean palindrome(int n) {
	return n == rev2(n);
}
public static void main(String[] args) {
	rev(3412);
	System.out.println("original = 3412");
	System.out.println("reversed = "+sum);
	
	System.out.println("\n"+rev2(1234));
System.out.println(palindrome(3411213));
}
}
