package Array;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// 
		
				int [] number = {1, 2, 3, 4, 5}; 
				System.out.println("Display Arrays.toSring(): " + Arrays.toString(number));
				
				// for loop
				for(int i=0; i < number.length; i++) {
					System.out.println("  " + number[i]);
				}

				// for each loop/ for enhanced loop/ for advanced loop
				for(int n: number) {// run n inside the array until it become false
					System.out.println("Number: --> " + n);
				}

	}

}
