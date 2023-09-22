package data_structures;

import java.util.Arrays;

public class Cycle_sort {
	static void cycle(int[] arr) {
		int i = 0;
		
		while(i < arr.length) {
			int shouldbe = arr[i] - 1;
			if(arr[i] != arr[shouldbe]) {
				swap(arr, i, shouldbe);
			}
			else {
				i++;
			}
		}
	}
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
public static void main(String[] args) {
	int[] arr = {3, 5, 2, 1, 4};
	cycle(arr);
	System.out.println(Arrays.toString(arr ));
}
}
