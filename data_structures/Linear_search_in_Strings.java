package data_structures;

import java.util.Arrays;

public class Linear_search_in_Strings {
	static boolean search(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	//using for each loop
	static boolean searchloop(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(char element:str.toCharArray()) {
			if(element==target) {
				return true;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
	String str = "Anshika";
	char target = 's';
	System.out.println(search(str,target));
	System.out.println(Arrays.toString(str.toCharArray()));
	System.out.println(searchloop(str,target));
}
}
