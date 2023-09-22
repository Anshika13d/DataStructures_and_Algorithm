package data_structures;

public class BitWise {
	//Q1. Given a number 'n' find if it is odd or even 
	static boolean isOdd(int n) {
		return (n & 1) == 1; //means we are setting it to odd
	}
	//Q2. You are given an array of numbers and every number appears twice except fine so find that number.
	private static int ans(int[] arr) {
		int unique = 0;
		for(int element : arr) {
			unique ^= element;
		}
		return unique;
	}
	//	Q. If every number is appearing 3 times except one so find that one number arr = [2,2,3,2,7,7,8,7,8,8]
	static int thrice(int[] a) {
		int unique = 0;
		for(int i=0;i<a.length;i++) {
			unique += a[i]; 
			if(unique % 3 != 0) {
				return a[unique];
			}
		}
		return unique;
	}
	
//	Q. Given a number n find the number of set bits in it
	// just find the number of 1s in the binary of the given number
	private static int setBits(int n) {
		int count = 0;
//		while(n > 0) {
//			count ++;
//			n -= (n & -n);
//		}
		
		while(n > 0) {
			count ++;
			n = n & (n - 1);
		}
		return count;
	}
	
	//XOR of all numbers between a and b
	//gives XOR  from 0 to a
	static int xor(int a) {
		if(a % 4 == 0) {
			return a;
		}
		if(a % 4 == 1) {
			return 1;
		}
		if(a % 4 == 2) {
			return a + 1;
		}
		return 0;
	}
public static void main(String[] args) {
	int n = 59;
	System.out.println("The number is odd: "+isOdd(n));
	int[] arr = {2,3,3,4,2,6,4};
	System.out.println("The unique element is: "+ans(arr));
	int[] th = {2,2,3,2,7,7,8,7,8,8};
	System.out.println("The unique element is: "+thrice(th));
	
	//Find the nth magic number (amazon question)
	int num = 6;
			int a=0;
			int base = 5;
			while(num > 0) {
				int last = num & 1;
				num = num>>1;
				a += last * base;
				base = base * 5;
				
			}
	
	System.out.println("6th magic number is: "+a);
	
	//	Q. Find number of digits in base b
	int number = 123; //this will be converted in binary form and then the number of digits in that binary form will be represented if base is 2
	int b = 10;
	
	int ans = (int)(Math.log(number) / Math.log(b)) + 1;
	System.out.println("The number of digits are: " + ans);
	
	//	Q. You are given a number find out if it is power of 2 or not
	int z = 16; //note: fix for z = 0
	boolean answer = (z & (z-1)) == 0;
	System.out.println("True if power of 2 otherwise false: "+answer);
	
	//Calculate a^b
	int basee = 2;
	int power = 8;
	
	int res = 1;
	while(power > 0) {
		if((power & 1) == 1) {
			res *= basee;
		}
		basee *= basee;
		power = power >> 1;
	}
	System.out.println("a^b is: "+res);
	
	//setBits
	//this function shows the binary representation of a number
	int s = 10;
	System.out.println(Integer.toBinaryString(s));
	
	int x = 45;
	System.out.println("set bits: "+setBits(x));
	

	//range xor for a till b = xor(b) ^ xor(a - 1)
	int y = 3;
	int r = 9;
	
	int result = xor(r) ^ xor(y - 1);
	System.out.println("XOR will be:"+ result);
}
}
