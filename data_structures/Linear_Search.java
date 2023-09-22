package data_structures;

public class Linear_Search {
	//search in the array: return the index if item found else return -1
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			//check the element at every index if it is = target
			int element = arr[i];
			if(element==target) {
				//it will return the index of target
				//return i;
				
				//it will return the element itself
				return element;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {100,200,56,700,650,560,33,567,190};
		int target = 56;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
	}

}
