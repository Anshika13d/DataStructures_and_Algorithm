package recursion;

//time - O(n)
public class Ques {
	//print your name 5 times
	public static void name(int i, int n) {
		//base condition
		if(i > n) {
			return ;
		}
		System.out.println("anshika");
		name(i+1, n);
	}
	
	//another way
	public static void another(int l, String name) {
		if(l > 0) {
			System.out.println(name);
			another(l-1,name);
		}
	}
	
	//print numbers till i
	public static void numb(int i) {
		if(i < 1) {
			return;
		}
		numb(i-1);
		System.out.println(i);
	}
	 //print numbers till n in reverse
	public static void reverse(int n) {
		if(n > 5) {
			return;
		}
		reverse(n+1);
		System.out.println(n);
		
	}
	
	//sum of n numbers 
	//1 method - parameterized
	public static void sum(int n, int sum) {
		if (n < 1) {
			System.out.println(sum);
			return ;
		}
		
		 sum(n - 1, sum + n);
	}
	
	//2 method - function
	public static int fun(int n) {
		if(n == 0) {
			return 0;
		}
		 return n + fun(n - 1);
	}
	
	//factorial using recursion
	public static int factoria(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * factoria(n - 1);
	}
	
	//reverse an array
	public static void arr(int[] arr, int l, int r) {
		if(l >= r) {
			return;
		}
			swap(l,r);
			arr(arr, l+1, r-1);
		
	}
	public static void swap(int l, int r) {
		int temp = l;
		l = r;
		r = temp;
	}

	//reverse an array only taking one variable
	public static void onevar(int[] arr, int i, int n) {
		
		if(i >= n/2) {
			return;
		}
		swap(arr[i],arr[n-i-1]);
		onevar(arr, i+1, n);
		
	}
	
	
	//palindrome
	public static boolean palin(String s, int i, int n) {
		if(i >= n/2) {
			return true;
		}
		if(s.charAt(i) != s.charAt(n - i - 1)) {
			return false;
		}
		
		return	palin(s, i+1, n);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		name(1,6);
		System.out.println();
		another(5,"Das");
		
		numb(5);
		
		System.out.println();
		reverse(1);
		
		System.out.println();
		sum(3, 0);
		
		System.out.println(fun(5));
		System.out.println(factoria(4));
		
		System.out.println();
		int[] arr = {1,2,3,4,2};
		arr(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] arr2 = {1,2,3,4,2};
		int n = arr2.length;
		onevar(arr2, 0, n);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		String s = "madim";
		System.out.println(palin(s, 0, s.length()));
 	}

}
