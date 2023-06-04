package JavaMethods;

public class UserDefineReturn {
	/*
	  return: specifies what type of value a method return
	  
	  primitive data type --> int, double, 
	 */
	
	// return statement
	public static int square (int x) {
		return x * x ; // 
	}
	
	// method overloading: overload the parameters inside of the function  ()
	public static int square (int x, int y) {
		return x * y ; // 
	}
	
	
	public static int square (int x, int y, int z) {
		return x * y  * z; // 
	}
	// main 
	
	public static void main(String[] args) {
		
		// calling 
		//UserDefinedReturn obj = new UserDefinedReturn();
		int result =  square (3); 
		System.out.println("Result: " +result);
		
		System.out.println("Output MOverload: " + square (5, 2)); 
		
		int multi = square (2, 4);
		System.out.println("Multi:  " +multi);

	}

}
