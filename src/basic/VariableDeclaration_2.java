package basic;

public class VariableDeclaration_2{

	public static void main(String[] args) {
		// primitive: byte, short, int, long, float, double, char, boolean
		// non-primitive : string
		/*
		 variable declaration: syntax--> data_type variable_ declaration 
		 Initialization : assignment operator initializing value
		 */
		// whole numbers
		byte b=1; // 1byte
		short s=2; // 2bytes
		int i=3; // 4bytes
		long l=4l; // 8bytes
		
		// Fractional/decimal value
		float f=5.1f;
		double d=5.2;	
		
		// Variable name convention: how do you name your variables?
		// Variable: placeholder/ box
		//start with lower-case : 
		int X = 3;
		// CamelCase
		String fullname = "Rena Valencia";
		System.out.println("Full Name:"+fullname);
		// Underscore_
		int age_student = 18;
		// Initialization
		int a = 1;
		//Re-initialization //re-assignment
		    a=7;
		    a=9;
		    a=178;
		System.out.println("a:"+a);
		
		

	}

}
