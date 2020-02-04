package recursion;

public class Fibonacci {

	/**
	 * 0,1,1,2,3,5,8,13 -- > Fibonacci Series
	 * Program to find nth element in fibonacci series. The first two elements 
	 * have to be compulsorily 0 and 1.
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			System.out.println(fibonacci(8));
	}
	
	public static int fibonacci(int n) throws Exception{
		if(n==0) {
			throw new Exception("Unacceptable !");
		}else if(n == 1 || n ==2) {
			return n-1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
