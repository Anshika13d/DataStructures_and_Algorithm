package data_structures;

public class Binary_Search {
	
	//for ascending order
	static int binarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start<=end) {
			int middle = start + (end-start)/2;
			
			if(target<arr[middle]) {
				end = middle-1;
			}
			else if(target>arr[middle]) {
				start = middle+1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {-9,-5,-2,0,2,6,9,89,90,99,100,101};
		int target = 100;
		int ans = binarySearch(arr,target);
		System.out.println(ans);
	}

}
