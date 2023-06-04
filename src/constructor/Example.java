package constructor;

public class Example {

	// Constructor: special code block with the same name of the class - Upper case naming convention
		// method: code block that modify a task - lower case case naming convention (void, return)
		// main method: execute your actual program 

		Example() {

			System.out.println("This is a constructor: means a block of the code with same name of the class");
		}

		// Parameterized Constructor
		String language;

		Example(String lang) {
			this.language = lang;
			System.out.println("This is a Parameterized Constructor: Printing: " + language);
		}
		
		// overloaded constructor 
		String c; 
		Example(String lang, String falcon) {
			this.language = lang;
			this.c = falcon;
			System.out.println("This is an overlaoded Parameterized Constructor: Printing: " + language + "   class: " +c);
		}

		// main method: execute the program
		public static void main(String[] args) {
			// object of the class
			Example obj1 = new Example();
			 obj1 = new Example();
			
			// object for parameterized constructor
			Example obj2 = new Example("Java Language");
			obj2 = new Example("Java Language");
			obj2 = new Example("Java Language");
			obj2 = new Example("Java Language");
			
			// another actual object 
			Example obj3 = new Example("React Lanaguage");
			
			Example obj4 = new Example("React Lanaguage", "Falcon");
			

		}
}
