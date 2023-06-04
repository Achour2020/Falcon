package basic;

public class CheckEvenoddNumbers {

	public static void main(String[] args) {
		/*
		   Even numbers: 2, 4 , 6, 8, 10
		   Odd numbers: 1, 3, 5, 7, 9 
		   
		   
		   Algorithm: if the number is divisible by 2 and equal equal to 0 is even or else odd numbers
		   
		   left operand == right operand   --> true 
		   left operand != right operand  --> false
		      0  == 0  -- > Even number 
		       1  == 0  -- > Odd number 
		   number % 2 == 0 
		   
		   Example: System.out.println(9 % 2 == 0 ); // 1  == 0 
		 */
		
		int number = 1; 
		
		if (number % 2 == 0) { // true block 
			System.out.println("EVEN Number: " +number);
		} else { // false block
			System.out.println("ODD Number: " +number);
		}
		
		
		// Arithmetic  Operation +, - , /, %, * 
		
//		int x1 = 9; 
//		int x2 = 3; 
//		
//		int result = x1 % x2; 
//		
//		// 0 == 0; 
//		
//		// System.out.println("Division: " + x1 / x2);
//		System.out.println("Modulus: " + result);
//		
//		if (result == 0) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
		


	}

}
