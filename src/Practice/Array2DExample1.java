package Practice;

public class Array2DExample1 {

	public static void main(String[] args) {
		// Multidimensional Array: 2/more row/lines
		
				//                    0          1     2 
				int [][] number = {
									{1, 2, 3}, 
									{4, 5}, 
									{7}}; 
				
				System.out.println("Lenght: " +number.length);
				
				//each line with the length
				System.out.println("Row1: " +number[0].length);
				System.out.println("Row2: " +number[1].length);
				System.out.println("Row3: " +number[2].length);
				//System.out.println("Row4: " +number[3].length);
				
				// loop --> nested loop
				
				for(int i=0; i<number.length; i++) {
					for (int j=0; j<number[i].length; j++) {
						System.err.print("  " +number[i][j]);
					}
					// new line 
					System.out.println();
				}

	}

}
