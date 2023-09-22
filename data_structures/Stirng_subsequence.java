package data_structures;

import java.util.ArrayList;

public class Stirng_subsequence {
	static  void subse(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.print(processed + " ");
			return;
		}
		
		char ch = unprocessed.charAt(0);
		
		//either take it
		subse(processed + ch, unprocessed.substring(1));
		//or ignore it
		subse(processed, unprocessed.substring(1));
	}
	static ArrayList<String> subsereturn(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(processed);
			return list;
		}
		
		char ch = unprocessed.charAt(0);
		
		//either take it
		ArrayList<String> left = subsereturn(processed + ch, unprocessed.substring(1));
		//or ignore it
		ArrayList<String> right = subsereturn(processed, unprocessed.substring(1));
		
		left.addAll(right);
		return left;
	}
	static  void subseASCII(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed + " ");
			return;
		}
		
		char ch = unprocessed.charAt(0);
		
		//either take it
		subseASCII(processed + ch, unprocessed.substring(1));
		//or ignore it
		subseASCII(processed, unprocessed.substring(1));
		
		subseASCII(processed + (ch + 0), unprocessed.substring(1));

	}
	static ArrayList<String> subsereturnASCII(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(processed);
			return list;
		}
		
		char ch = unprocessed.charAt(0);
		
		//either take it
		ArrayList<String> first = subsereturnASCII(processed + ch, unprocessed.substring(1));
		//or ignore it
		ArrayList<String> second = subsereturnASCII(processed, unprocessed.substring(1));
		
		ArrayList<String> third = subsereturnASCII(processed + (ch + 0), unprocessed.substring(1));
		
		first.addAll(second);
		first.addAll(third)
;		return first;
	}
public static void main(String[] args) {
	subse("","abc");
	System.out.println(subsereturn("","abs"));
	System.out.println();
	subseASCII("","abc");
	System.out.println();
	System.out.println(subsereturnASCII("","abc"));
}
}
