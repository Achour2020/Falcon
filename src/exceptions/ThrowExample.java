package exceptions;

public class ThrowExample {

	public static void main(String[] args) {
		/*
		  
		  throw: block of the code
		  
		  throws: method signature 
		
		 */
		// object of the class
		ThrowExample obj = new ThrowExample();
		
		try { 
		obj.checkingAge(14);
		}
		 catch (Exception e) {
			// e.printStackTrace();
			 //System.out.println(e.toString());
			 System.out.println(e.getMessage());
		 }
		
	}
	
	// method 
	public void checkingAge(int age) throws Exception {
		if (age < 18) {
			throw new NullPointerException ("The customer is under age of 18! ");
		} else {
			throw new Exception("The customer is eligible to drive!");
		}

	}

}
