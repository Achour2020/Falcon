package Practice;

public class Array2DExample2 {

	public static void main(String[] args) {
		// 2D array 
		
				char [][] c = {
						         {'A', },
						         {'D', 'E', }, 
						         {'G', 'H', 'I'}
							}; 
				
				System.out.println("Length: "+c.length);
				
				// loop
				for(int i=0; i<c.length; i++) {
					// System.out.println("Row: " +i);
					for(int j=0; j<c[i].length; j++) {
						System.out.print(" " +c[i][j]);
					}
					// new line 
					System.out.println();
				}

	}

}
