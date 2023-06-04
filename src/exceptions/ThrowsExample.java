package exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		// object 
		
		// throw
			ThrowsExample obj = new ThrowsExample();
			
			 try { 
			       throw new Exception("Result: " + obj.division(10, 0));
			 } 
			 
			  catch (Exception e) {
				  //e.printStackTrace();
				  System.out.println(e.getMessage());
			  }
			 
			 finally {
				 System.out.println("\n End of the program! ");
			 }

		}

		/*
		 * throws: Signature of a method is declared
		 */
		// Method

		public int division(int x, int y) throws ArithmeticException {
			int result = x / y;
			return result;

	}

}
