package data_structures;

public class GCD_LCM {
static int hcf(int a, int b) {
	if(a == 0) {
		return b;
	}
	return hcf(b%a,a);
}
static int lcm(int a, int b) {
	return a * b / hcf(a, b);
}
public static void main(String[] args) {
	System.out.println(hcf(4,8));
	System.out.println(lcm(4,8));
}
}
