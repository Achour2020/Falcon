package basic;

public class ComparisonOperator_7 {

	public static void main(String[] args) {
		/*
		 Comparison/relational Operators : returns boolean (false, true)
		 Operator           definition         Example
		 
		 ==                 is equal to        4==5       returns false
		 !=                 not equal to       4!=5       returns true
		 >                  greater than       4> 5       returns false 
		 <                  less than          4< 5       returns true
		 >=                 greater or equal   4>=5       returns false
		 <=                 less than or equal 4<=5       returns true
		 */

		int a = 4;
		int b = 5;
		System.out.println("a:"+a); //4
		System.out.println("b:"+b); //5
		
		// comparison / relational operators
		System.out.println(a==b);
		System.out.println("== is equal to :"+(a==b));
		System.out.println("!= Not equal to: " + (a != b));
		System.out.println("> Greater than: " + (a > b));
		System.out.println("< Less than: " + (a < b));
		System.out.println(" >= Greater than or eqaul to: " + (a >= b));
		System.out.println(" <= Less than or eqaul to: " + (a <= b));
		
		// for loop 
		System.out.println("\n");
		for (int x = 1; x <= 5; x++) {
			System.out.println("x: " +x);
		}
		
		
		System.out.println("\n Another Example  ");
		// why we use = initialization/ assignment       x = 3;        |    box = 3; 
		
		// Why we use  == is equal to                    left operand == right operand    --> result: true/false
		
		int box = 3; 
		System.out.println(box == 3); // true
		System.out.println(box > 17); // false
		System.out.println(box < 17); // true
	}

}
