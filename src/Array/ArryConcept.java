package Array;

import java.util.Arrays;

public class ArryConcept {

	public static void main(String[] args) {
		/*
		 Array: queue / cue , single line, single row --> An array is a collection of similar types of data
		  Arrays.toString();
		  Returns a string representation of the contents of the specified array.
		  the string representation consists of a list of the array's elements, enclosed in square brackets (" [] ")
		 */
		
		// declaring arrays & initializing arrays in length (size)
		int[] x = new int [6];
		// initializing the values 
		x[0]= 1;
		x[1]= 2;
		x[2]= 3;
		x[3]= 4;
		x[4]= 5;
		x[5]= 6;
		
		// size
		System.out.println("size" + x .length);
		System.out.println(Arrays.toString(x)); // returns default int --> 0
		
		char[] c= new char [26];
		// initializing the values of arrays 
		c[0]= 'A';
		c[1]= 'B';
		c[25]= 'Z';
		System.out.println(Arrays.toString(c)); // default char --> empty []
		
		String[] names= new String [9];
		names[0]= "Alex";
		names[8]= "John";
		System.out.println(Arrays.toString(names)); // default String --> null
		
		// Another example
		
		double[]salary = new double [5]; // length: size
		salary[0]= 15.99;
		salary[1]= 9.99;
		salary[2]= 25.78;
		salary[3]= 23.56;
		salary[4]= 9.9;
		System.out.println(Arrays.toString(salary));
		
		
		
		
		
		
		
		
		

	}

}
