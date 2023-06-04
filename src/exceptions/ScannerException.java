package exceptions;

import java.util.Scanner;

public class ScannerException {

	public static void main(String[] args) {
		/*
		  Read the information by the user input  ---> Scanner
		 */
		
		int number1; 
		int number2; 
		Scanner scan = new Scanner(System.in);
		
		// Display to the user
		System.out.println("Enter your First Number for division!");
		number1 = scan.nextInt(); 
		
		System.out.println("Enter your Second Number for division!");
		number2 = scan.nextInt();
		
		try {
			int division = number1 / number2; 
			System.out.println("Result: " +division);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Division by zero is not possible!");
			//System.out.println("Exception Message: " +e.toString());
			System.out.println("Message: " +e);
		}


	}

}
