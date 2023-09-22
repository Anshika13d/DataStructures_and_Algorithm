package data_structures;

public class LinearSearch_in_range {
	static int linearSearch1(int [] arr, int target, int start, int end) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=start;i<end;i++) {
		int element=arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] nums= {12,45,688,90,-2,11,33,1,-890};
	int target = -2;
	System.out.println(linearSearch1(nums,target,2,7));
}
}
