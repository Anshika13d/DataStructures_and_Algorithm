package data_structures;

import java.util.Arrays;

public class Search_in_2D_array {
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	//find maximum in 2D array
	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
//		for(int row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[row].length;col++) {
//				if(arr[row][col]>max) {
//					max=arr[row][col];
//
//				}
//			}
//		}
//		return max;
		
		//using for each loop
		for(int[] inarr:arr) {
			for(int element:inarr) {
				if(element>max) {
					max=element;

				}
			}
		}
		return max;
	}
	
	
	
	
public static void main(String[] args) {
	int arr[][]= {
			{90,89,78,6},
			{56,45,34},
			{23,12,45,67}
	};
	
	int target=67;
	//format of return value {row,col}
	int[] ans=search(arr,target);
	System.out.println(Arrays.toString(ans));
	System.out.println(max(arr));
	}
}

