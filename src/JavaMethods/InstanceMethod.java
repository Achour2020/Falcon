package JavaMethods;

public class InstanceMethod {

	// for execution / displaying 
		public static void main(String[] args) {
			// create an object of the class
			//InstanceMethod object = new InstanceMethod();
			
			// calling the method: calling the signature of the method 
			//System.out.println("Result: " + object.multiplication(5, 3));
			
			//static: does not require to create an object of the class
			System.out.println("Result: " + multiplication(4, 3));

		}
		
		/*
		   creating instance method: specific statements
		   return type: returning the type of primitive type value 
		   parameter: arguments inside the ()
		 */
		 
		public  static int multiplication (int x, int y) {
			int result = x * y; 
			return result; 
		}
}
