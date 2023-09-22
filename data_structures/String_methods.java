package data_structures;

import java.util.Arrays;

public class String_methods {
	public static void main(String[] args) {
		String s = "Anshik  a  ";
		String t = "Das";
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(s.concat(t));
		System.out.println(s.isBlank());
		System.out.println(Arrays.toString(s.split(" ")));
	}

}
