package data_structures;
import java.util.Arrays;
public class SwapArray {
	public static void main(String[] args) {
		int[] arr= {11,33,66,88,90};
		swap(arr, /*index 1*/ 1, /*index 2*/ 3);
		
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
