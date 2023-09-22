package data_structures;

import java.util.ArrayList;

public class Linear_searchRecursion {
	//given an array find the target element
	static boolean find(int[] arr, int target, int index) {
		if(index == arr.length) {
			return false;
		}
		return arr[index] == target || find(arr, target, index+1);
	}
	static int findnum(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target ) {
			return index;
		}
		else {
		    return findnum(arr, target, index+1);
		}
	}
	static int findfromlastindex(int[] arr, int target, int index) {
		if(index == -1) {
			return -1;
		}
		if(arr[index] == target ) {
			return index;
		}
		else {
		    return findfromlastindex(arr, target, index - 1);
		}
	}
	//to find all index of the target
	static ArrayList<Integer> list3 = new ArrayList<>();
	static void findall(int[] arr, int target, int index) {
		if(index == arr.length) {
			return;
		}
		if(arr[index] == target ) {
			list3.add(index);
		}
		findall(arr,target,index + 1);
	}
	
	//passing the array list in the function itself
	static ArrayList<Integer> findlist(int[] arr, int target, int index, ArrayList<Integer> list2) {
		if(index == arr.length) {
			return list2;
		}
		if(arr[index] == target ) {
			list2.add(index);
		}
		return findlist(arr,target,index + 1,list2);
	}
	
	//IMPORTANT
	//pass the array list in the function body means new list will be created
	//at every function call
	static ArrayList<Integer> al(int[] arr, int target, int index){
		ArrayList<Integer> list3 = new ArrayList<>();
		if(index == arr.length) {
			return list3;
		}
		if(arr[index] == target) {
			list3.add(index);
		}
		ArrayList<Integer> belowcalls = al(arr, target, index + 1);
		
		list3.addAll(belowcalls);
		
		return list3;
	}
public static void main(String[] args) {
	int[] arr = {9,9,8,2,9,18};
	int target = 9;
//	System.out.println(find(arr,target,0));
//	System.out.println(findnum(arr,target,0));
//	System.out.println(findfromlastindex(arr,target,arr.length - 1));
//	System.out.println("All indicies of target: ");
//	findall(arr,target,0);
//	System.out.println(list2);
//	System.out.println(findlist(arr,target,0,new ArrayList<>()));
	//other ways to print list where arraylist is in the function itself
	//ArrayList<Integer> list = new Arraylist<>();
//	ArrayList<Integer> ans = findlist(arr,target,0,list);
//	System.out.println(ans);
//	System.out.println(list);
	System.out.println("Important concept:");
	System.out.println(al(arr,target,0));
	
	
}
}
