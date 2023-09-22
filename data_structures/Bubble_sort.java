package data_structures;

import java.util.Arrays;

public class Bubble_sort {
	static void bubble(int[] arr) {
		boolean swap;
		
		//run steps n-1 times
		for(int i=0;i<arr.length;i++) {
			swap = false;
			//for each step max item will come at last index
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					swap = true;
				}
			}
			//if you did not swap for a particular value of i it means the array is sorted hence stop the i
			if(!swap) {
				break;
			}
		}
	}
public static void main(String[] args) {
	int[] arr = {8,2,90,4,6};
	bubble(arr);
	System.out.println(Arrays.toString(arr));
}
}
