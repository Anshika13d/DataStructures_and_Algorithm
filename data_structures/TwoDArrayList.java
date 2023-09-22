package data_structures;
import java.util.Scanner;
import java.util.ArrayList;

public class TwoDArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//initialize
		for(int i=0;i<3; i++) {
			list.add(new ArrayList<>());
		}
		
		//add elements
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);
	}

}
