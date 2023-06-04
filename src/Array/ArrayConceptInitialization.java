package Array;

import java.util.Arrays;

public class ArrayConceptInitialization {

	public static void main(String[] args) {
		/*
		 Arrays : array in a list to know what elements you want to store | curly bracket {}
		 */
		
		String[]array1 = {"Alex","Dhruv","johan","Sara","Susan"};
		//size
		System.out.println("Array1 in length:" + array1.length);
		System.out.println("Display Array1" + Arrays.toString(array1));
		
		// retrieving the indexes / positions
		System.out.println("Element at position 0 is :"+ array1[0]);
		System.out.println("Element at position 3 is :"+ array1[3]);
		
		// Array of numbers
		int [] numbers = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("\nLength numbers:"+ numbers.length);
		System.out.println("Display numbers:"+ Arrays.toString(numbers));
		System.out.println("O index: " +numbers[0] + " element");
		System.out.println("8 index: " +numbers[8]);  // return the value of 9
	}

}
