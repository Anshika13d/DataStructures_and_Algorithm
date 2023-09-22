package data_structures;

import java.util.Arrays;

public class Backtracking {
	static void back(String pro, Boolean[][]maze, int r, int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(pro);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		
		//going up
		if(r > 0) {
			back(pro + 'U', maze, r - 1, c);
		}
		//going down
		if(r < maze.length - 1) {
			back(pro + 'D', maze, r + 1, c);
		}
		//going right
		if(c < maze[0].length - 1) {
			back(pro + 'R', maze, r, c + 1);
		}
		//going left
		if(c > 0) {
			back(pro + 'L', maze, r, c - 1);
		}
		
		//this is when the function will be over it will return back the value which was before
		//basically before the function gets over it changes the value as it was
		maze[r][c] = true;
	}
	
	static void backprint(String pro, Boolean[][]maze, int r, int c, int[][]path,int step) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			path[r][c] = step;
			for(int[] element: path) {
				System.out.println(Arrays.toString(element));
			}
			System.out.println(pro);
			System.out.println();
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		path[r][c] = step;
		//going up
		if(r > 0) {
			backprint(pro + 'U', maze, r - 1, c, path, step + 1);
		}
		//going down
		if(r < maze.length - 1) {
			backprint(pro + 'D', maze, r + 1, c, path, step + 1);
		}
		//going right
		if(c < maze[0].length - 1) {
			backprint(pro + 'R', maze, r, c + 1, path, step + 1);
		}
		//going left
		if(c > 0) {
			backprint(pro + 'L', maze, r, c - 1, path, step + 1);
		}
		
		//this is when the function will be over it will return back the value which was before
		//basically before the function gets over it changes the value as it was
		maze[r][c] = true;
		path[r][c] = 0;
	}
public static void main(String[] args) {
	Boolean[][] arr = {
			{true, true, true},
			{true, true, true},
			{true, true, true}
	};
	back("",arr,0,0);
	System.out.println();
	int[][] path = new int[arr.length][arr[0].length];
	backprint("",arr,0,0,path,1);
}
}
