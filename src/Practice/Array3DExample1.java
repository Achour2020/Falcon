package Practice;

public class Array3DExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int [][][] number = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} }; 
				System.out.println("Length: " +number.length);
				
				for (int i=0; i<2; i++) {
					for(int j=0; j<2; j++) {
						for(int k=0; k<2; k++) {
							System.out.print(" " +number[i][j][k]);
						}
						// new line
						System.out.println();
					}
					System.out.println();
				}
	}

}
