package data_structures;

public class Binary_search_recursion {
	static int bs(int[] arr, int target, int s, int e) {
		//base condition
		if(s > e) {
			return -1;
		}
		
		int mid = s + (e - s)/2;
		if(arr[mid] == target) {
			return mid;
		}
		if(target < arr[mid]) {
			return bs(arr, target, s, mid - 1);
		}
		return bs(arr, target, mid + 1, e);
	}
public static void main(String[] args) {
	int[] arr = {12,55,67,90,91,95,100};
	int target = 100;
	
	System.out.println(bs(arr, target, 0, arr.length - 1));
}

}
