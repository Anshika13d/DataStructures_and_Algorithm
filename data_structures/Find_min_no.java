package data_structures;

public class Find_min_no {
	static int minimum(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		return ans;
	}
public static void main(String[] args) {
	int[] nums = {12,5,89,90,2,32,69,43,67};
	
	System.out.println(minimum(nums));
}
}
