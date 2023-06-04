package exceptions;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		/*
		  
		 */
		
		try {
			//                               0 1 2 3 4 
			int number [] = new int [5] ; // 1 0 0 0 5
			number [0] = 1;
			number [4] = 5; 
			System.out.println("Output: " +number [4]);
			
 		} catch (Exception e) {
			// TODO: handle exception
 			e.printStackTrace();
		}
		
	}

}
