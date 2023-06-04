package Assignments;

import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
		/*
		 * Create a program to check Vowel or Consonant characters using switch
		 * statement.
		 * 
		 * This program continues to print all the cases if they are vowels ( the
		 * character is a vowel), and if the condition is failed printing (the character
		 * is consonant).
		 * 
		 * Requirements: Use scanner class with switch statement. And add if else
		 * statement condition
		 * 
		 * Logical operator: && AND. || OR
		 * 
		 * Hint:
		 * 
		 * - Create a boolean (isVowel) variable and initialize with false
		 * 
		 * - Vowels cases: a, e, i, o, u, A, E, I, O, U --> return true
		 * 
		 * case U: isVowel = true;
		 */

		// boolean 
		boolean isCharacterVowel = false; 
		
		// Scanner 
		Scanner scan = new Scanner (System.in);
		
		// asking the user to enter a value 
		System.out.println("Enter a character to check if it is a vowel or consonant");
		
		// checking the character value
		char c = scan.next().charAt(0); 

		// switch
		switch (c) {
		
		//upper - case
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		//lower-case
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			isCharacterVowel = true; 
//			System.out.println("This character is a vowel");
//			break;
//			
//			// else 
//			default:
//				System.out.println("This character is a consonant");
		} 
		// && || 
		if (isCharacterVowel == true) {
			System.out.println("This character is a vowel");
		} 
		
		else {        //        true            OR              true
			if (    ( c >= 'A' && c <= 'Z')     || (c >= 'a' && c <= 'z')    ) 
			System.out.println("This character is a consonant"); 
			
			else {
				System.out.println("The value you've inserted is not an alphabet character");
			}
		}
		


	}

}
