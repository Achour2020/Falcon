package exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		/*
		  Multiple catch block
		 */
		
	
		try { // try block
			System.out.println("Division: " + (10 / 0));
			//int number = Integer.parseInt("TEK Dojo");
			
		} catch (ArithmeticException e) { // catch block
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try { // try block
			//System.out.println("Division: " + (10 / 0));
			int number = Integer.parseInt("TEK Dojo");
			
		}
		
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("This is a finally block --> executed no matter whatever happens!");
		
		
	}


	}

}
