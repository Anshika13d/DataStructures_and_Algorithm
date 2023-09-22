package data_structures;

import java.util.Arrays;

public class Maximum_in_array {
	//to find maximum in a range
	static int maxRange(int[] arr, int start, int end) {
		
		if(end>start) {
			return -1;
		}
		if(arr==null) {
			return -1;
		}
		int maxNum=arr[start];
		for(int i=start;i<=end;i++) {
			if (maxNum<arr[i]) {
				maxNum=arr[i];
			}
		}
		return maxNum;
	}
	
	static int max(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int maxVal=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(maxVal<arr[i]) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
	
	public static void main(String[] args) {
		int[] arr= {14,9,99,13,6,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		System.out.println(maxRange(arr,1,4));
	}

}
