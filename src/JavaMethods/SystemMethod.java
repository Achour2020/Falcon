package JavaMethods;

public class SystemMethod {

	public static void main(String[] args) {
		/*
		 Method : a block of code that perform a specific task.
		 2types methods
		           1. system defined method
		           2. user defined method 
		 */
		
		// 1. System defined method
		
		// String
		String text = "hello";
		System.out.println("Upper case:"+ text.toUpperCase());
		System.out.println("lenght:"+text.length());
		System.out.println("Position:"+text.charAt(0));
		
		// Math
		System.out.println("Multiplication:"+ Math.multiplyExact(2,2));
		System.out.println("Pow:"+ Math.pow(2, 3)); // 2*2*2

	}

}
