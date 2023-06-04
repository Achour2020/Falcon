package basic;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 while --> reserved key word
		 while is a an iterative approach to check a condition
		    condition is true --> statement
		    condition is false --> no statement
		    
		    increment variable ++
		    decrement variable --
		 */
		int number = 1;
        while (number <= 5) {
        	System.out.println("Number:"+ number);
        	number ++;
        }
        // decrement logic with while
        
        int x = 5;
        while (x >= 1) {
        	System.out.println("x:"+x);
        	x --;
        }
	}

}
