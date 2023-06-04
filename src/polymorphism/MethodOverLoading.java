package polymorphism;

public class MethodOverLoading {

	/*
	  Polymorphism: many shape --> 1. Method Overloading       |     2. Method Overriding
	  
	  Person: Husband, Father, Work , Student
	 */
	
	public static int a1(int x, int y) {
		return x * y; 
	}
	
	
	public static int a1(int x, int y, int z) {
		return x * y * z; 
	}
	
	public static double a1(double x, double y) {
		return x + y ; 
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Result Multipication: " +a1(2, 2));
		System.out.println("Result Multipication: " +a1(2, 2, 2));
		
		System.out.println("Result Addition: " +a1(5.5, 2.5));
	}
}
