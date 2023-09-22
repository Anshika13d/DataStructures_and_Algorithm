package data_structures;

public class Array_recursion {
	//	Q. Given an array find that array is sorted or not
static boolean sor(int[]arr, int index) {
	if(index == arr.length - 1) {
		return true;
	}
	
	return arr[index] < arr[index + 1] && sor(arr, index+1);
}
public static void main(String[] args) {
	int[] arr = {1,29,3,7,0,6};
	System.out.println(sor(arr, 0));
}
}
