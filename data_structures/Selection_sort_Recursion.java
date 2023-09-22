package data_structures;

import java.util.Arrays;

public class Selection_sort_Recursion {
	static void selection(int[] arr, int last, int first, int max) {
		if(last == 0) {
			return;
		}
		if(first < last) {
			if(arr[first] > arr[max]) {
				selection(arr, last, first + 1, first);
			}
			else {
				selection(arr, last, first + 1,max);
			}
		}
		else {
			int temp = arr[max];
			arr[max] = arr[last - 1];
			arr[last - 1] = temp;
			selection(arr, last-1,0,0);
		}
		
	}
public static void main(String[] args) {
	int[] arr = {1,56,32,6,89,9,2};
	selection(arr,arr.length,0,0);
	System.out.println(Arrays.toString(arr));
}
}
