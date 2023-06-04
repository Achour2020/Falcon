package Keywords;

public class FinalVariable {

	/*
	   final: the literal value will not change --> stable (not dynamic)
	   
	   1. final variable 
	 */
	
	public static void main(String[] args) {
		
		final double pi = 3.14; 
		// pi = 5; // CAN NOT re-initialization the final variable
	 
		System.out.println("X: " +pi);
	}
}
