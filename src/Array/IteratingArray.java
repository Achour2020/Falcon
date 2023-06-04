package Array;

import java.util.Arrays;

public class IteratingArray {

	public static void main(String[] args) {
		/*
		 Arrays of character
		 */
		
		char[]character = {'A','C','B','Z','T'};
		System.out.println("Length:"+character.length);
		System.out.println("Display:" + Arrays.toString(character));
		
		// Iterating the array element 
		//for loop
		for (int i=0 ; i<character.length; i++) {
			System.out.println("Character:" + character[i]);
		}
		
		//
		System.out.println("\n");
		
		int[]num = {10,20,30,40,50,60,70,80,90,100};
		for(int i=0; i<num.length; i++) {
			System.out.println("number:"+ num[i]);
		}
		// Arrays.toString(name_of_array)
				System.out.println("\nNumber: "+ Arrays.toString(num));
				
				// String array of names
				System.out.println("\n");
				String [] names = new String [10];  
				names [0] = "Alex"; // 0 index --> 1 element 
				names [4] = "Ahmad";
				names [7] = "Sara";
				names [9] = "John";
				
				for (int i =0; i <names.length; i++) {
					System.out.println("Name: " +names[i]);
			}
	}

}
