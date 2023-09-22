package data_structures;

public class Linear_search_trueORfalse {
	static boolean linearSearch1(int [] arr, int target) {
		if(arr.length==0) {
			return false;
		}
		
		for(int element: arr) {
		
			if(element==target) {
				return true;
			}
		}
		return false;
	}
public static void main(String[] args) {
	int[] nums= {13,06,4,14,9,99,56,78,90};
	int target = 14;
	boolean ans = linearSearch1(nums, target);
	System.out.println(ans);
}
}
