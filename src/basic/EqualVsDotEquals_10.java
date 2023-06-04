package basic;

public class EqualVsDotEquals_10 {

	public static void main(String[] args) {
		/*
		 
		 =  assignment operator: initialize   x = 3
		 == comparison operator:  relation    x == 3
		 .equals String methods
		 
		 
		 ==   vs   .equalsTo()
		 
		 */
		
		int x = 2; 
		int y = 2; 
		System.out.println("x == y :   " + (x == y));  // true
		
		
		String text1 = "hello";
		String text2 = "hello";
		// new keyword --> object
		String text3 = new String ("hello");
		System.out.println("text1 == text3 : " + (text1 == text3)); // false
		
		// .equalsTo()
		System.out.println("text3 .equals text2 : "+ text3.equals(text2)); // true 
		
		
		// 
		System.out.println("\nAnother Example    ");
		
		String class1 = "Java"; 
		String class2 = "Java";
		String class3 = new String("Java");
		
		// .equals 
		System.out.println(class1.equals(class2)); // true
		System.out.println(class1.equals(class3));  // true
		
		
		System.out.println("\nKahoot Question");
		
		int num = 100; 
		// NOT PEMDAS  | concatenation
		System.out.println("num: " + (num + num)    ); // 100 + 100  --> 200
		
		boolean b = true; 
		b = false; // ?  
		System.out.println("b: " +b); // false
		
		
		// PEMDAS
		
		// 				10 + 	6
		int equation = 10 + 5 * 4 / 3; 
		
		System.out.println(equation);

	}

}
