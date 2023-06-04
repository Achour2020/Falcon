package JavaMethods;

public class MethodRevision {

	// void
		public static void voidMethod() {
			System.out.println("This is a void display method");
		}
		
		/*
		   return --> data type 
		   MethodOverloading 
		 */
		double division(double x) {
			return x / 2; 
		}
		
		// main 
		public static void main (String [] args) {
			MethodRevision obj = new MethodRevision();
			//voidMethod();
			obj.voidMethod();
			
			System.out.println("Output: " +obj.division(25));
		}
}
