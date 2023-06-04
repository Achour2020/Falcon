package Assignments;

import java.util.Scanner;

public class A1Q1 {

	public static void main(String[] args) {
		/*
		 * Question: How to print sum of two number using scanner class? 

         *Requirements: Follow the below steps and add your screenshot in the Canvas

         *Use Scanner class
         *Use whole numbers (numeric numbers)
         *Use the addition from the arithmetic operators
         *Close the scanner class
		 */

		// integer with whole numbers
		int number1;
		int number2;
		int sum;
		
		// Scanner class
		Scanner scan = new Scanner(System.in);
		
		// Number1
		System.out.println("Enter first number!");
		number1 = scan.nextInt();
		// Number2
		System.out.println("Enter second number!");
		number2 = scan.nextInt();
		// close the scanner
		scan.close();
		//addition --> sum of the two numbers
		sum = number1 + number2;
		// print the sum 
		System.out.println("Sum of the two numbers:"+ sum);
	}

}
