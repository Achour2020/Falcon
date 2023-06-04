package JavaMethods;

public class UserDefinedMethodReturn {

	/*
	  return: return a type value (primitive data type)
	  Signature: name of the method with parameters (primitive_data container)  :  sum (int x)
	  
	  static : directly call the method name
	  non static : --> create an object of the class
	 */
	
	static int sum1 (int x) {
		return x + 10; 
	}
	
	// not static in return
	int sum2 (int x) {
		return x + 10; 
	}
	
	// access modifiers --> public, default, private, and protected
	public int sum3 (int x) {
		return x += x + x / x;
		
	}
	
	public static int sum4 (int x) {
		return x + x ;
		
	}
	
	// main method 
	public static void main(String [] args) {
		
		// invoke: calling
		System.out.println("Sum1: " + sum1(5));
		
		// directly calling the sum4 method
		System.out.println("Sum4: " + sum4(100));
		
		// Creating an object of the class to invoke/ call the non static return type 
		UserDefinedMethodReturn obj = new UserDefinedMethodReturn();
		//int result = obj.sum2(2);
		//System.out.println("Sum2: " +result);
		System.out.println("Sum2: " +obj.sum2(4));
		
		// sum3
		int s3 = obj.sum3(1);
		System.out.println("Sum3: " +s3);
	}
}
