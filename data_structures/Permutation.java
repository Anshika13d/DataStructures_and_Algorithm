package data_structures;

import java.util.ArrayList;

public class Permutation {
	static void per(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		char ch = unprocessed.charAt(0);
		
		for(int i=0;i<=processed.length();i++) {
			String first = processed.substring(0,i);
			String second = processed.substring(i,processed.length());
			
			//Here, the recursion call is depending on the size of processed string so, 
			//recursion call = size of processed + 1
			per(first + ch + second, unprocessed.substring(1));	
		}
	}
	static ArrayList<String> perList(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(processed);
			return list;
		}
		
		char ch = unprocessed.charAt(0);
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i=0;i<=processed.length();i++) {
			String first = processed.substring(0,i);
			String second = processed.substring(i,processed.length());
			
			//Here, the recursion call is depending on the size of processed string so, 
			//recursion call = size of processed + 1
			ans.addAll(perList(first + ch + second, unprocessed.substring(1)));	
			
			}
		return ans;
	}
	static int perCount(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			return 1;
		}
		
		char ch = unprocessed.charAt(0);
		int count = 0;
		for(int i=0;i<=processed.length();i++) {
			String first = processed.substring(0,i);
			String second = processed.substring(i,processed.length());
			
			//Here, the recursion call is depending on the size of processed string so, 
			//recursion call = size of processed + 1
			count  = count + perCount(first + ch + second, unprocessed.substring(1));			
		}
		return count;
	}
public static void main(String[] args) {
	per("","abc");
	System.out.println();
	System.out.println(perList("","abc"));
	System.out.println();
	System.out.println(perCount("","abcd"));
}
}
