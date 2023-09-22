package data_structures;

import java.util.Arrays;

public class Bubble_sort_Recursion {
	static void bubble(int[] arr, int last, int first) {
		if(last == 0) {
			return;
		}
		if(first < last) {
			if(arr[first] > arr[first + 1]) {
				int temp = arr[first];
				arr[first] = arr[first + 1];
				arr[first + 1] = temp;
			}
			bubble(arr, last, first + 1);
		}
		else {
			bubble(arr, last - 1, 0);
		}
	}
public static void main(String[] args) {
	int[] arr = {4,3,5,2,1};
	bubble(arr, arr.length - 1,0);
	System.out.println(Arrays.toString(arr));
}
}
