package basic;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// Scanner
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter your First Name");
				
				String firstName = scan.next(); 
				
				System.out.println("Enter your Last Name");
				String lastName = scan.next();
				
				System.out.println("Enter your age.");
				int age = scan.nextInt();
				
				// salary
				System.out.println("Enter your salary");
				double salary = scan.nextDouble();
				
				// location
				System.out.println("Enter your State");
				String location = scan.next();
				
				// output
				System.out.println("\n ****** Output data  ******");
				System.out.println("First Name: " +firstName );
				System.out.println("Last Name: " +lastName);
				System.out.println("Age: " +age);
				System.out.println("Salary: " +salary);
				System.out.println("Location: " +location);
				
				scan.close();

	}

}
