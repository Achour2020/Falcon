package methodesPractice;

public class UserDefinedMethodVoid {

	// User defined code block : a specific task
	
		/*
		  void: does not return any type value (primitive type value)
		  
		  Signature: name of the method with function -- > void display() 
		  
		  static: not changing / not dynamic 
		  
		  Object: means(sample) instance of the class  --> new 
		  
		 */
		
		static void display1() {
			System.out.println("Display1: Java is easy to learn");
		}
		
		void display2 () {
			System.out.println("Display2: JavaScript is easy to learn");
		}
		
		// access modifier: public, default (not written in code), private, protected
		public void display3() {
			System.out.println("Display3: React is not easy to learn");
		}
		
		public static void display4() {
			System.out.println("Display4: Python is easy to learn");
		}
		
		// main method 
		public static void main (String [] args) {
			// call the method 
			display1();
			
			// calling display4 in a static type
			display4();
			
			
			// creating an object of the class to call the void and static method 
			UserDefinedMethodVoid obj = new UserDefinedMethodVoid();
			obj.display2();
			obj.display1();
			
			// calling display3
			obj.display3();
			
			// calling the in a static type --> display4
			obj.display4();
			
			// another object : instance
			UserDefinedMethodVoid example = new UserDefinedMethodVoid();
			example.display1();
			example.display2();
		}

}
