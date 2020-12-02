package recursion;

public class Factorial {
	
	public static long factorial(long n) {
	
		if(n == 1) {
			return 1;
		}
	
		long valorIntermedio = n * factorial(n -1);
		
		
		return valorIntermedio;
		
	}

}
