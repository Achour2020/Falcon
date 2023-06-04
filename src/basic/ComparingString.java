package basic;

public class ComparingString {

	public static void main(String[] args) {
		/*
		  String: is a non primitive/ reference data type. 
		  Store:  we should use double quotation -->  " "
		  
		  Creating String in 2 ways
		  	1. String- variable_name assignment operator and passing string literal value --> String message = "Hello"; 
		  	2. We use new keyword to create an object of the string in a literal value
		  	
		  	Comparison operator --> <, >, ==
		  	equality operator ==  --> return result: boolean (true, false)
		  	
		  	what is the difference between == AND .equal ? 
		 */
		
		// 1. String literal value 
		String message1 = "Hello"; 
		String message2 = "Hello";
		
		System.out.println("Message1: " + message1);
		System.out.println("Message2: " + message2);
		
		// What if i compare the above two string in case if they are equal or not? 
		System.out.println("Are they equal? : " + (message1 == message2));
		
		
		// 2. new keyword --> method of string .equal
		String message3 = new String("Hello");
		
		//System.out.println("Compare message1 vs message3: " + message3 == message1); // false  --> avoid == with new keyword of String
		System.out.println("Compare message1 vs message3: " + message3.equals(message1)); // true

	}

}
