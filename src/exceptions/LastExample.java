package exceptions;

import java.util.Arrays;

public class LastExample {

	public static void main(String[] args) {
		// Exception
		
				int number [] = new int [3]; 
				number [0] = 1; 
				number [1] = 2; 
				number [2] = 3; 
				
				try {
					
				System.out.println("Length: " +number.length);
				System.out.println("Display: " +Arrays.toString(number));
				System.out.println("Index 0: " +number[0]);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Access the index position of the array integer within the range");
				}
				catch (Exception e) {
					System.out.println("Some random Exception");
				}
				
				finally {
					System.out.println("\n End of the program ! ");
				}

	}

}
