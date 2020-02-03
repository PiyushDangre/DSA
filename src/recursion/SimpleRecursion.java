package recursion;

public class SimpleRecursion {
	
	public static void main(String args[]) {
			foo(6);
		
	}
	
	
	public static void foo(int n) {
		
		if(n < 2) {
			return ;	
		}else {
			foo(n-1);
		}
		
		System.out.println(n);
	}

}
