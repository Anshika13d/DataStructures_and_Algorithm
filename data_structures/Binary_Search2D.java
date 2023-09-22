package data_structures;

import java.util.Arrays;

public class Binary_Search2D {
	static int[] BS(int[][] matrix, int target) {
		//define start and end
		int startR = 0;
		int endC = matrix.length - 1;
		
		while(startR < matrix.length && endC >= 0) {
			if(matrix[startR][endC] == target) {
				return  new int[] {startR,endC};
			}
			if(matrix[startR][endC] < target) {
				startR++;
			}
			else {
				endC--;
			}
		}
		return new int[] {-1,-1};
	}
public static void main(String[] args) {
	//sorted array by row and column not totally sorted
	int [][] arr = {
			{10, 20, 30, 40},
			{15, 25, 35, 45},
			{28, 29, 37, 49},
			{33, 34, 38, 50}
	};
	
	System.out.println(Arrays.toString(BS(arr,37)));
}
}
