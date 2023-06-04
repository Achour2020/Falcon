package exceptions;

public class WrapperClassConversion {

	public static void main(String[] args) {
		// Conversion of data type
		
				int i =10; 
				
				float f = 10.9f; 
				
				double d = 9.99; 
				
				byte b = 1; 
				
				
				// creating instance of the object 
				//Integer objInt = new Integer(i);
				Integer objInt = i; 
				System.out.println("ObjeInt: " +objInt);
				
				//Float objF = new Float(f);
				Float objF = f; 
				System.out.println("OjbF: " +objF);
				
				Double objD = d; 
				System.out.println("ObjD: " +objD);


	}

}
