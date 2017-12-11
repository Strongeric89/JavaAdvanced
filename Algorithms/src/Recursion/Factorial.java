package Recursion;

public class Factorial {
	
	public static void main(String[] args) {
		int num = 7;
		
		//! factorial
		System.out.println(factorial(num));
		
		//Fibonacci
		System.out.println("first " + num + " terms of fib sequence...");
		System.out.println("=" + fibonaci(num));
		
		
	}	
	
	
	public static int fibonaci(int num) {
		
	
		if(num == 0) {
			
			return 0;
		}else if(num == 1) {
			//System.out.print(num + " + ");
			return 1;
		}else {
			//System.out.println(num + " + ");
			return fibonaci(num - 1) + fibonaci(num - 2);
		}
		
		
		
	}
	
	public static int factorial(int num) {
		
		if(num == 1) {
			System.out.print("1 = ");
			return 1;
		}
			System.out.print(num + " * ");
			return factorial(num - 1) * num;
	
		
			
	}

}


