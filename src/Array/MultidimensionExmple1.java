package Array;

public class MultidimensionExmple1 {

	public static void main(String[] args) {
		/*
		   row 1 -->   0  0  0 
		   row 2 -->   0  0  0 
		   row 3 -->   0  0  0 
		   
		 */
		
//		int [][] number = { 
//				{1, 0, 0}, {4, 5, 6}, {7, 8, 0},
//				{1, 0, 0}, {4, 5, 6}, {7, 8, 0},
//				{1, 0, 0}, {4, 5, 6}, {7, 8, 0},
//				{1, 0, 0}, {4, 5, 6}, {7, 8, 0},
//				{1, 0, 0}, {4, 5, 6}, {7, 8, 0}
//		 
//		};
		int [][] number = new int [15][3]; // 0 
		
		System.out.println("Lengnth: " +number.length);
		// System.out.println("Display: " +Arrays.toString(number));
		
		// for loop
		// out loop --> row1, 2, 3 
		for(int i=0; i<15; i++) {
			//inner loop --> records
			for (int j=0; j< 3; j++) {
				System.out.print("  "+number[i][j]);
			}
			// new line 
			System.out.println();
		}


	}

}
