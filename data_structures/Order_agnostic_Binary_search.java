package data_structures;

public class Order_agnostic_Binary_search {
	static int check(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		//find whether the array is ascending or descending
		boolean isAscending = arr[start]<arr[end];
		
		while(start<=end){
				int middle = start + (end-start)/2;
				 
				//common condition 
				if(arr[middle]==target) {
					return middle;
			}
				if(isAscending) {
			     	if(target<arr[middle]) {
					end = middle-1;
				}
				
				else {
					start = middle+1;
				}
				}
				else {
					if(target>arr[middle]) {
						end = middle-1;
					}
					else {
						start = middle+1;
					}
				}
			}
		return -1;
	}
		public static void main(String[] args) {
			int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
			int target = 10;
			int ans = check(arr,target);
			System.out.println(ans);
		}
}
	
