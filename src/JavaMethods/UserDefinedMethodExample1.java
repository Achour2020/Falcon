package JavaMethods;

public class UserDefinedMethodExample1 {

	public static void main(String[] args) {
		// creating object 
		/*
		  class: prototype/ design/ sketch/ map
		  object: is an instance(sample) of the class --> 
		  		state (variable, container), 
		  		behavior (method)
		  
		  Storing the objects
		 */
		UserDefinedMethodExample1 object = new UserDefinedMethodExample1();
		// call the method 
		//printAlphabet(); 
		//printAlphabet(); 
//		printAlphabet(); 
//		printAlphabet(); 
//		printAlphabet(); 
		object.printAlphabet();
		object.printAlphabet();
		String name = "John Duo" ; 
		//System.out.println(name);

	}
	
	
	// user defined method 
	 static void printAlphabet() {
		for(char c='A'; c<='Z'; c++) {
			System.out.print(" " +c);
		}
		System.out.println();
		
	}
}
