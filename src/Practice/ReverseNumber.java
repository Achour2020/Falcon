package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		  How to reverse a number? 
		  
		  12345   -- reversed -->54321
		 */
		int number = 0; 
		int reverseNumber =0; 
		
		System.out.println("Enter two or more digits to reverse it");
		Scanner scan = new Scanner(System.in);
		
		number = scan.nextInt(); 
		System.out.println("Number:  " + number);
		
		// logic to find out the reversed number
		while (number != 0) {
			reverseNumber = reverseNumber * 10; 
			reverseNumber = reverseNumber + number % 10; 
			number = number / 10; 
		}
		
		
		System.out.println("Reverse Number: " +reverseNumber);

	}

}
