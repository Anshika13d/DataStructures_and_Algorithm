package data_structures;

public class Richest_customer_wealth {
	public int maximumWealth(int[][] arr) {
		//person=row
		//account=col
		int ans = Integer.MIN_VALUE;
		
		//using for each loop
		for(int[] element:arr) {
			int rowcount=0;
			for(int anotherelement:element) {
				rowcount += anotherelement;
			}
			//sum the accounts of person and check with overall answer that is min value
			if(rowcount>ans) {
				ans=rowcount;
			}
		}
		return ans;
	}
	
//	
//		for(int person=0;person<arr.length;person++) {
//			int rowcount=0;
//			for(int account=0;account<arr[person].length;account++) {
//				rowcount += arr[person][account];
//			}
//			//sum the accounts of person and check with overall answer that is min value
//			if(rowcount>ans) {
//				ans=rowcount;
//			}
//		}
//		return ans;
//	}

}
