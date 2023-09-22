package data_structures;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDSA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1D array
//		int[] rnos =new int[5];
//		rnos[0]=4;
//		rnos[1]=5;
//		rnos[2]=67;
//		rnos[3]=8;
//		rnos[4]=100;
//		
//		//methods to print arrays: 
//		for(int i=0;i<rnos.length;i++) {
//			System.out.println(rnos[i]+" ");
//		}
//		
//		//using for each loop
//		for(int e:rnos) {
//			System.out.println(e);
//		}
//		
//		//using toString()method
//		System.out.println(Arrays.toString(rnos));
//		
//		String[] str=new String[5];
//		for(int i=0;i<str.length;i++) {
//			str[i]=sc.next();
//		}
//		System.out.println("enter your string array here");
//		System.out.println(Arrays.toString(str));
		
		
		//2D array - array of array
		//number of rows is mandatory but not columns
		//int[][]arr=new int[3][];
		
//		int[][] arr = {
//				{1,2,3},  //0th index
//				{4,5},    //1st index
//				{7,8,9}   //2nd index
//		};
		
		int[][] arr = new int[3][2];
		System.out.println(arr.length); //number of rows=3
		//take input of 2D array
		for(int row=0;row<arr.length;row++) {
			//for each column in every row
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		//output
//		for(int row=0;row<arr.length;row++) {
//			//for each column in every row
//			for(int col=0;col<arr[row].length;col++) {
//				System.out.print(arr[row][col] +" ");
//			}
//			System.out.println();
//		}
		
		//another way to print 2D array using toString()
//		for(int row=0;row<arr.length;row++) {
//			System.out.println(Arrays.toString(arr[row]));
//		}
//		
		//using for each loop
		for(int[] element:arr) {
			System.out.println(Arrays.toString(element));
		}
	}
}
