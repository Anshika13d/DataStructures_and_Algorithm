package data_structures;

import java.util.Arrays;

public class Merge_sort {
	static int[] divide(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
		int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}

	private static int[] merge(int[] left, int[] right) {
		int[] mix = new int[left.length + right.length];
		
		//pointer for 1st array
		int i = 0;
		//pointer for 2nd array
		int j = 0;
		//pointer for new array
		int k = 0;
		
		while(i < left.length && j < right.length) {
			if(left[i] < left.length) {
				mix[k] = left[i];
				i++;
				
			}
			else {
				mix[k] = right[j];
				j++;
				
			}
			k++;
		}
		
		//if any of the array has more length then just add the remaining elements at the end
		//either one of the loop will run
		while(i < left.length) {
			mix[k] = left[i];
			i++;
			k++;
		}
		while(j < right.length) {
			mix[k] = right[j];
			j++;
			k++;
		}
		
		return mix;
	}
	
	//in-place
	static void divideinplace(int[] arr, int s, int e) {
		if(e - s == 1) {
			return;
		}
		
		int mid = (s + e)/2;
		
		divideinplace(arr, s, mid);
		divideinplace(arr, mid, e);
		
		mergeinplace(arr, s, mid, e);
	}

	private static void mergeinplace(int[] arr, int s, int m, int e) {
		int[] mix = new int[e - s];
		
		//pointer for 1st array
		int i = s;
		//pointer for 2nd array
		int j = m;
		//pointer for new array
		int k = 0;
		
		while(i < m && j < e) {
			if(arr[i] < arr[j]) {
				mix[k] = arr[i];
				i++;
				
			}
			else {
				mix[k] = arr[j];
				j++;
				
			}
			k++;
		}
		
		//if any of the array has more length then just add the remaining elements at the end
		//either one of the loop will run
		while(i < m) {
			mix[k] = arr[i];
			i++;
			k++;
		}
		while(j < e) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l=0;l<mix.length;l++) {
			arr[s+l] = mix[l];
		}
	}
public static void main(String[] args) {
	int[] nums = {5,2,3,1};
	//nums = divide(nums);
	System.out.println(Arrays.toString(divide(nums)));
	
	int[] arr = {5,2,3,1};
	divideinplace(arr,0,arr.length);
	System.out.println(Arrays.toString(arr));
}
}
