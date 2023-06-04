package basic;

import java.util.Scanner;

public class UserInput_12 {

	public static void main(String[] args) {
		/*
		  Scanner class: is used to get the user input, and it is available in the java.util package
		  --> use new keyword: create an object the class
		  --> .nextLine method should be use only on the very first line
		  
		  .nextLine();    --> is used to read the next line if it is letters or numbers
		  .next();   --> to read only String
		  .nextInt();   --> Reads a int value from the user
		  .nextBoolean();  --> reads a boolean (true, false) from the user
		  .nextDouble();   --> reads a double value from the user
		  .nextLong();
		  .nextShort(); 
		  .nextByte();
		  
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		
		// scan with the Data Type: input
		String name = scan.nextLine();
		System.out.println("Name: " +name);
		
		// to close the Scanner class: --> .close(); 
		scan.close(); 

	}

}
