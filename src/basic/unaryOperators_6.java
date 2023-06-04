package basic;

public class unaryOperators_6 {

	public static void main(String[] args) {
		/* Unary Operator :
		 ++ increment : increase the value
		 -- decrement : decrease the value
		 */
		// ++ increment
		int x = 10;
		x++; // x + 1
		x++; // 11 + 1
		System.out.println("x:"+x);
		
		// -- decrement
		int i = 5;
		i--; // 5-1;
		i--; // 4-1;
		System.out.println("i:"+i);
		
		// print 1 to 5
		for (int num =1; num <=5; num++) 
        System.out.println("Number:"+num);
        
		for (int number =5; number >=1; number --)
			System.out.println("Number:"+number);
		
		// post increment 
		int a = 12;
		int result = ++a;
	 // System.err.println("a:"+a);	
		System.out.println("result :"+result);
		
		// post decrement : 
		int y = 5;
		//System.err.println("y:"+y);
		int value = --y;
		System.out.println("Value:"+value);
			
	}

}
