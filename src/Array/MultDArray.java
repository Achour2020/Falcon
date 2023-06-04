package Array;

import java.util.Arrays;

public class MultDArray {

	public static void main(String[] args) {
		/*
		 * Multidimensional array --> more than a row/line
		 */

		// 2 array bracket
		char[][] array1 = {
                //   row 1 = index 0       row 2 = index 1 
				{ 'A', 'B'  }, 
				{ 'E', 'F' }, 
				{ 'H', 'I'  }, 
				{'K', 'L' },
				{ 'A', 'B' }, 
				{ 'E', 'F'  }, 
				{ 'H', 'I'  }, 
				{'K', 'L'}
		};
		
		System.out.println("Length: " + array1.length);
		// Can not print with Arrays.toString method of Arrays class in Multidimensional
		//System.out.println("Display: " +Arrays.toString(array1));
		
		// iterating with for loop
		
		for (int i=0; i < array1.length; i++) {
			//System.out.println("Elements in a row: " +i);
			
			// inner data
			for(int j=0; j< 2; j++) {
				System.out.print(" " + array1[i][j]);
			}
			
			// new line 
			System.out.println();
		}
		
		// i 
		// j
        
	}

}
