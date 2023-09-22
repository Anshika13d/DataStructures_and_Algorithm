package data_structures;

import java.util.Arrays;

public class Selection_sort {
	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//find max element and swap with correct index
			int last = arr.length - i - 1;
			int minIndex = getMaxIndex(arr, 0 , last);
			swap(arr, minIndex, last);
		}
	}

	private static int getMaxIndex(int[] arr, int start, int end) {
		int min = start;
		for(int i=start;i<=end;i++) {
			if(arr [min] < arr[i] ){
			 min = i;
			}
		}
		
		return min;
	}
static void swap(int[]arr, int first, int second) {
	int temp = arr[first];
	arr[first] = arr[second];
	arr[second] = temp;
}
public static void main(String[] args) {
	int[] arr = {2,5,7,9,1,0,6};
	selection(arr);
	System.out.println(Arrays.toString(arr));
}
}
