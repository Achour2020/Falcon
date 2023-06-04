package Practice;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		//Generate Random numbers
		
				/*  random numbers from 1 - 10 ?
				          2 5 8 4  
				 */
				
				int count = 5; 
				
				Random r = new Random();
				
				for(int i= 1; i <= count; i++) {
					System.out.println("Random Number: " +r.nextInt(20));
				}

	}

}
