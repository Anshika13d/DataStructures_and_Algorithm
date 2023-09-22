package data_structures;

public class Power_of_two231 {
	  public static boolean isPowerOfTwo(int n) {
			 if(n==0){
	            return false;
	        }
					else if(n==1){
	            return true;
	        }
					else if(n%2==0 && isPowerOfTwo(n/2)){
	            return true;
	        }
					else
	        return false;
		}

	public static void main(String[] args) {
		int a = 6;
		System.out.println(isPowerOfTwo(a));
	}
}
