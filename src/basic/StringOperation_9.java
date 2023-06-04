package basic;

public class StringOperation_9 {

	public static void main(String[] args) {
		/*
		 string : non-primitive / Reference data type 
		 to store anything in a string " "
		 */

		// 1. string literal : can be created by using double quotes " "
		String name = "Sara Valencia";
		System.out.println("Name:"+ name);
		// 2. using a new keyword : created an object
		String fullname = new String ( "Sara Valencia");
		System.out.println("Full Name:"+fullname);
		
		// Displaying String 
		String message = "hello";
		
		// \n --> next line
		//System.out.println("\nMessage:"+message);
		
		// \t --> tab
		//System.out.println("\tMessage:"+message);
		
		// print in one line
		System.out.print("\tMessage:"+message);
		
		//Methods : pre made task
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Letters:"+letters);
		
		// toUpperCase ();
		System.out.println("Upercase:"+ letters.toUpperCase());
		
		// toLowerCase ():
		System.out.println("Lowercase:"+ letters.toLowerCase());
		
		// string length --> size | space counts in programming
		System.out.println("Size:"+letters.length());
		
		// .indexOf (); --> return position | 0123.....25
		System.out.println("posion A:"+letters.indexOf("A"));
		System.out.println("posion B:"+letters.indexOf("B"));
		System.out.println("posion Z:"+letters.indexOf("Z"));
		
		// Trimming : remove the spaces
		String language = "    Java";
		System.out.println("Language:"+language);
		System.out.println("Language:"+language.trim());
		
		// Compare String
		String text1= "hello";
		String text2= "hello";
		
		//.equals : Compare string
		System.out.println(text1.equals(text2));
		
		if (text1.equals(text2)) {// true
			System.out.println("Both texts are written equal");
		} 
		{ // false 
			 System.out.println("Both texts are not written equal");}
		}
		
		
	}


