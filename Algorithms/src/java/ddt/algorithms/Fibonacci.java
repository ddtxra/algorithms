package ddt.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	
	public static long recursiveFibonacci(long n){
		if(n <= 2)
			return 1;
		return recursiveFibonacci (n - 1) + recursiveFibonacci (n - 2);
	}
	
	
	private static Map<Long,Long> cache = new HashMap<Long,Long>();
	public static long recursiveFibonacciCached(long n){
		if(n <= 2)
			return 1;

		System.out.println("Searching for " + n + " " + cache.keySet().size());
		if (cache.containsKey(n)){
			System.out.println("The cache was hitted");
	        return cache.get(n);
		}
	        		
		long value = recursiveFibonacciCached (n - 1) + recursiveFibonacciCached (n - 2);
		cache.put(n, value);
		return value;
	}
	

	public static long fibonacci(long n){
		
		long previous = 0;
		long current = 1;
		long next = 1;
		
		if(n == 0)
			return 0;

		if(n == 1)
			return 1;

		for(int i = 2; i<=n; i++){
			next = current + previous;
			previous = current;
			current = next;
		}
		
		return next;
		
	}

}
