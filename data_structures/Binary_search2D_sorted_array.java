package data_structures;

import java.util.Arrays;

public class Binary_search2D_sorted_array {
	static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
		while(cstart <= cend) {
			int mid = cstart + (cend - cstart) /2;
			
			if(matrix[row][mid] == target) {
				return new int[] {row,mid};
			}
			if(matrix[row][mid] < target) {
				cstart = mid + 1;
			}
			else {
				cend = mid - 1;
			}
		}
		return new int[] {-1,-1};
	}
	static int[] sortedsearch(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length; //caution : matrix maybe empty
		
		if(rows == 1) {
			return binarySearch(matrix, 0, 0, cols-1, target);
		}
		
		int rStart = 0;
		int rEnd = rows - 1;
		int cMid = cols / 2;
		
		//run loop till 2 rows are remaining
		while(rStart < (rEnd -1)) {
			int mid = rStart + (rEnd - rStart) /2;
			if(matrix[mid][cMid] == target) {
				return new int[] {mid, cMid};
			}
			if(matrix[mid][cMid] < target) {
				rStart = mid;
			}
			else {
				rEnd = mid;
			}
		}
		
		//now we have two rows
		//check whether the target is in the column of 2 rows
		if(matrix[rStart][cMid] == target) {
			return new int[] {rStart, cMid};
		}
		if(matrix[rStart + 1][cMid] == target) {
			return new int[] {rStart + 1, cMid};
		}
		
		//search in all 4 parts now loop has broken
		
		//1st part
		if(matrix[rStart][cMid - 1] >= target) {
			return binarySearch(matrix, rStart, 0, cMid - 1, target );
		}
		
		//2nd part
		if(matrix[rStart][cMid + 1] <= target && matrix[rStart][cMid - 1] >= target) {
			return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
		}
		
		//3rd part
		if(matrix[rStart + 1][cMid -1] >= target) {
			return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
		}
		
		//4th part
		else {
     		return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
		}
//		if(matrix[rStart + 1][cMid + 1] <= target && matrix[rStart + 1][cMid + 1] >= target) {
//			return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//		}
}
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		System.out.println(Arrays.toString(sortedsearch(arr, 11)));
	}
}