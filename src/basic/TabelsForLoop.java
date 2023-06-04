package basic;

public class TabelsForLoop {

	public static void main(String[] args) {
		/*
		 Table 1
		 1 2 3 4 5 6 7 8 9 10        | 10 < 11
		 Table 2
		 2 4 6 8 10
		 Table 3
		 Table 4
		 Table 5
		 */
		
		// outer loop
		for(int i=1; i<6; i++) {
			System.out.println("Table.."+i);
			
			//inner loop
			for(int j=1; j<11; j++) {
			
				// printing the multiplication table
				System.out.print(" "+ i*j);
			}
			// new line
			System.out.println("\n");
			}

	}

}
