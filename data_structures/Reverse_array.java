package data_structures;

import java.util.Arrays;

public class Reverse_array {
	static void swap(int arr[], int start,int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}
	static void rev(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {12,14,13,89,56,90,45};
		System.out.println(Arrays.toString(arr));
		rev(arr);
		System.out.println(Arrays.toString(arr));
	}

}
