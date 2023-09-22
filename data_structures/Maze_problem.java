package data_structures;

import java.util.ArrayList;

public class Maze_problem {
	static int countpath(int r, int c) {
		if(r == 1 || c ==1) {
			return 1;
		}
		int left = countpath(r - 1, c);
		int right = countpath(r, c - 1);
		
		int count = left + right;
		return count;
	}
	static void printpath(String pro, int r, int c) {
		if(r == 1 && c == 1) {
			System.out.println(pro);
			return;
		}
		//going down
		if(r > 1) {
			printpath(pro + 'D', r - 1, c);
		}
		//going right
		if(c > 1) {
			printpath(pro + 'R', r, c - 1);
		}
	}
	static ArrayList<String> printpathlist(String pro, int r, int c) {
		if(r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(pro);
			return list;
		}
		//creating a locacl list
		ArrayList<String> list = new ArrayList<>();
		
		//going diagonal
		if(r > 1 && c > 1) {
			list.addAll(printpathlist(pro + 'D', r - 1, c));
		}
		//going down
		if(r > 1) {
			list.addAll(printpathlist(pro + 'V', r - 1, c));
		}
		//going right
		if(c > 1) {
			list.addAll(printpathlist(pro + 'H', r, c - 1));
		}
		return list;
	}
	
	//with obstacles
	static void obstacles(String pro, Boolean[][]maze, int r, int c) {
		//maze[0].length: This represents the number of columns in the maze. 
		//Since maze is a 2D array, we access the first row (maze[0]) 
		//and get its length to determine the number of columns in the grid. 
		//It is assumed that all rows have the same number of columns.
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(pro);
			return;
		}
		if(maze[r][c] == false) {
			return;
		}
		
		
		if(r < maze.length - 1) {
			obstacles(pro + 'D', maze, r + 1, c);
		}
		if(c < maze[0].length - 1) {
			obstacles(pro + 'R', maze, r, c + 1);
		}
	}
public static void main(String[] args) {
	System.out.println(countpath(3,3));
	printpath("",3,3);
	System.out.println(printpathlist("",3,3));
	Boolean[][] arr = {
			{true, true, true},
			{true, false, true},
			{true, true, true}
	};
	System.out.println("\nPaths of maze with obstacles:");
	obstacles("",arr,0,0);
}
}
