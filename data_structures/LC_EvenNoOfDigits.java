package data_structures;

public class LC_EvenNoOfDigits {
	static int findnumbers(int[] arr) {
		int count = 0;
		for(int elementsof:arr) {
			if(even(elementsof)) {
				count++;
			}
			
		}
		return count;
	}
	static boolean even(int num){
		int numberofdigits = digits(num);
		
		/*another method:
		 
	    if(numberofdigits%2==0) {
			return true;
		}
		return false;*/
		
		return numberofdigits %2 == 0;
	}
	
	//2nd way of finding the digits
	static int digits2(int num) {
		return (int)(Math.log10(num))+1;
	}
	
	static int digits(int num) {
		if(num<0) {
			num = num* -1;
		}
		if(num==0) {
			return 1;
		}
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {12,345,2,6,7896};
		System.out.println(findnumbers(arr));
	}
}
