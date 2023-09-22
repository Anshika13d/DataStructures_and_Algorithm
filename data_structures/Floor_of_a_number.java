package data_structures;

public class Floor_of_a_number {
	static int floor(int[] arr,int target) {
		
		//find the index of greatest number <= target
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
		return end;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		int ans = floor(arr,target);
		System.out.println(ans);
	}

}
