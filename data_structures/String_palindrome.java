package data_structures;
import java.util.Scanner;
public class String_palindrome {
	static boolean isPalindrome(String str) {
		if(str == null || str.length() == 0) {
			return true;
		}
		str = str.toLowerCase();
		for(int i=0;i<str.length()/2;i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);
			
			if(start != end) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String a = sc.nextLine();
		String s = "Anshika";
		System.out.println(isPalindrome(a));
	}

}
