package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// A,F,G,E,D,C,H,B
		// declare + initialize + insert the element
		char[]c= { 'A','F','G','E','D','C','H','B'};
		
		System.out.println("Length:" +c.length);
		System.out.println("Display:"+ Arrays.toString(c));
		for(int i=0; i<c.length; i++) {
			System.out.println("Character :"+ c[i]);
		}
		
		// sorting the array
		// Arrays.sort(); --> sort in ascending order 
		Arrays.sort(c);
		System.out.println("Sorted Display:" + Arrays.toString(c));
		
		// Array of integers
		System.out.println("\n");
		
		int[]arrayOfInt = {9,5,7,8,2,6,3,1,0,4};
		System.out.println("Display:"+ Arrays.toString(arrayOfInt));
		
		// sort the array
		Arrays.sort(arrayOfInt);
		System.out.println("Sorted:"+ Arrays.toString(arrayOfInt));
		
	}

}
