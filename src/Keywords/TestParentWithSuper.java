package Keywords;

public class TestParentWithSuper {

	// Test runner method --> main method 
	
	public static void main(String[] args) {
		
		// Create an object the parents class
		
		Parents p = new Parents();
		System.out.println("Number in Parents: "+p.number);
		
		// object for childA
		
		ChildA a = new ChildA();
		System.out.println("Copy of Number in ChildA: "+a.number);
		a.myMethod();

	}

}
