package basic;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 Do while : integrative approach
		 Do : statement --> executed no matter whatever happens 
		 while : condition --> true / false 
		 */
		
		// statement 
		do {
			System.out.println("Statement  executed no matter happens");
		} while (false);
		
		//
		System.out.println("\n Another Example");
		int number = 1;
		do {
			System.out.println("Number:"+number);
			// increment 
			number ++;
		} while (number >= 5);
		
		// 
		System.out.println("\n  Another Example : Decrement");
		int x = 5;
		do {
			System.out.println("X:"+x);
			x --;
		} while (x >= 1);
		
	}

}
