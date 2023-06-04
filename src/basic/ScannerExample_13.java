package basic;

import java.util.Scanner;

public class ScannerExample_13 {

	public static void main(String[] args) {
		// Scanner
		
				Scanner myObj = new Scanner (System.in);
				
				// To ask the user
				System.out.println("Enter your name, age and salary: ");
				
				// String
				String name = myObj.nextLine(); 
				
				// int 
				int age = myObj.nextInt();
				
				// double
				double salary = myObj.nextDouble();
				
				// Output input bye the user
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Salary: " +salary);
				
				//close the scanner
				myObj.close();
		 


	}

}
