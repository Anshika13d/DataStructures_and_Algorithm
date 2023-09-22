package data_structures;

public class Recursion_String {
	static void skip(String ans, String orig) {
		if(orig.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		char ch = orig.charAt(0);
		
		if(ch == 'a') {
			skip(ans, orig.substring(1));
			
		}
		else {
			skip(ans + ch, orig.substring(1));
		}
	}
	static String skip2(String orig) {
		if(orig.isEmpty()) {
			return " ";
		}
		
		char ch = orig.charAt(0);
		
		if(ch == 'a') {
			return skip2(orig.substring(1));
			
		}
		else {
			return ch + skip2(orig.substring(1));
		}
	}
	static String skipString(String orig) {
		if(orig.isEmpty()) {
			return " ";
		}
		
		if(orig.startsWith("apple")) {
			return skipString(orig.substring(5));
			
		}
		else {
			return orig.charAt(0) + skipString(orig.substring(1));
		}
	}
	static String skipappnotapple(String orig) {
		if(orig.isEmpty()) {
			return " ";
		}
		
		if(orig.startsWith("app") && !orig.startsWith("apple")) {
			return skipappnotapple(orig.substring(3));
			
		}
		else {
			return orig.charAt(0) + skipappnotapple(orig.substring(1));
		}
	}
public static void main(String[] args) {
	skip("","badwoman");
	System.out.println(skip2("manhahaha"));
	System.out.println(skipString("mmuappleduh"));
	System.out.println(skipappnotapple("madappleman"));
	System.out.println(skipappnotapple("madapplalalama"));
}
}
