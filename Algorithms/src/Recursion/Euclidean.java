package Recursion;

public class Euclidean {
	public static void main(String[] args) {
		
		System.out.println(gcd(8,12));
		
		factorialIterativey(4);
		System.out.println(factorialRecursively(4));
		
	}
	
	public static void factorialIterativey(int base) {
		
		int result = 1;
		for(int i = 1; i <= base; i++) {
			result *= i;
			System.out.println(result);
		}
	
		
	}
	
	public static int factorialRecursively(int base) {
		if (base == 1) {
			return 1;
		}
		return factorialRecursively(base - 1) * base;
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
			
			return gcd(b,a%b);
	}
}
