package data_structures;

public class Pattern {
	static void pattern1(int n) {
		//run outer for loop
		for(int row=1;row<=n;row++) {
			//inner for loop
			for(int col=1;col<=row;col++) {
				//what to print
				System.out.print("* ");
			}
			//when one row is printed, add a new line
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int index=1;index<=n;index++) {
			for(int column=n;column>=index;column--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		
		for(int i=0;i<2*n;i++) {
			int cols = i > n ? 2 * n - i: i;
			//if i>n is true then perform 2*n-i else print i
			for(int j=0;j<cols;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		//row
		for(int i=0;i<2*n;i++) {
			int col = i > n ? 2 * n - i : i;
			int spaces = n - col;
			//spaces
			for(int s=0;s<spaces;s++) {
				System.out.print(" ");
			}
			//columns
			for(int j =0;j<col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern7(int n) {
		for(int row=1;row<=n;row++) {
			for(int space=0;space<n-row;space++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int cols=2;cols<=row;cols++) {
				System.out.print(cols);
			}
			System.out.println();
		}
	}
	static void pattern8(int n) {
		for(int row=1;row<=2*n;row++) {
			int c = row > n ? 2 * n - row: row;
			for(int space=0;space<n-c;space++) {
				System.out.print(" ");
			}
			for(int col=c;col>=1;col--) {
				System.out.print(col);
			}
			for(int cols=2;cols<=c;cols++) {
				System.out.print(cols);
			}
			System.out.println();
		}
	}
	static void pattern9(int n) {
		int realN = n;
		n = 2 * n ;
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				int everyindex = realN - Math.min(Math.min(row, col),Math.min(n-row, n-col));
				System.out.print(everyindex+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);
		System.out.println();
		pattern8(5);
		System.out.println();
		pattern9(4);
	}

}
