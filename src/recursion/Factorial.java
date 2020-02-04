package recursion;

public class Factorial {

	public static void main(String Args[]) {
			System.out.println(factorial(30));
	}
	
	public static long factorial(long n) {
		
		if(n == 0) {
			return 1 ;	
		}else {
			return n*factorial(n-1);
		}
		
	}
}
