package data_structures;

public class N_Queens {
	static int queen(boolean[][]board, int row) {
		if(row == board.length) {
			printboard(board);
			System.out.println();
			return 1;
		}
		int count = 0;
		
		//placing the queen and checking for every row and column
		for(int col=0;col<board.length;col++) {
			//placing the queen if it is safe
			if(isSafe(board,row,col)) {
				board[row][col] = true;
				count += queen(board, row + 1);
				board[row][col] = false;
			}
		}
		
		return count;
	}

	private static boolean isSafe(boolean[][] board, int row, int col) {
		//check vertical
		for(int i=0;i<row;i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//check for diagonally left
		int minL = Math.min(row, col);
		for(int i=1;i<=minL;i++) {
			if(board[row-i][col-i]) {
				return false;
			}
		}
		
		//check for diagonally right
				int minR = Math.min(row, board.length - col - 1);
				for(int i=1;i<=minR;i++) {
					if(board[row-i][col+i]) {
						return false;
					}
				}
				return true;
	}

	private static void printboard(boolean[][] board) {
		for(boolean[] row: board) {
			for(boolean element: row) {
				if(element) {
					System.out.print("Q ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	int n = 4;
	boolean[][] board = new boolean[n][n];
	System.out.println(queen(board,0));
}
}
