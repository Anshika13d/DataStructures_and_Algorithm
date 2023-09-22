package data_structures;

public class Celling_of_a_number {
	//return the index of smallest number >= target
	static int celling(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		
		//if the target element is greater than the greatest element in the arrray
		if(target > arr[arr.length - 1]) {
			return -1;
		}
		
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
		return start;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		int ans = celling(arr,target);
		System.out.println(ans);
	}


}
