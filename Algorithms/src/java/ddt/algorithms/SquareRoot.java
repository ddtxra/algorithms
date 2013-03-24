package ddt.algorithms;


public class SquareRoot {

	
	public static void main(String args[]){
		System.out.println(squareRoot(16));
	}
	
	public static double squareRoot(double num){

		double guess = 1;
		
		while(0.1 < Math.abs(guess * guess - num)){
		    guess = (guess + (num / guess)) / 2.0;
		    System.out.println(guess);
		}
		
		return guess;

	}

	
	
}
