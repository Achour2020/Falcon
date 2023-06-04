package JavaMethods;

public class CreatingMethod {
         
	// Here to write a method
		// creating a method
		/*
		 * Access modifiers: public, default, private, protected 
		 * static: stable, not changeable 
		 * void : does not return any type value 
		 * Name of the method: starting with lower case
		 */
		 protected static void dislay() {
			System.out.println("Here it is a static method example calling protected access modifiers" );
		}

		// special method --> main method --> execute or display the result
		public static void main(String[] args) {
			// creating object the class
			CreatingMethod o = new CreatingMethod();
			// calling method
			//Display();
			o.dislay();

		}

		// Here to write a method

	

}
