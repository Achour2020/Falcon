package basic;

public class ClassLoops {

	public static void main(String[] args) {
		/*
		 *  Control Flow: control a set instructions/ functions
		 	while loop
		 	increment ++     0, 1, 2, .. . 5 
		 	decrement --     5, 4, 3 ... . 0 
		 */
		// increment
		int i = 0; 
		while(i <= 5) {
			System.out.println("Count... " + i);
			i++; 
		}
		
		// new line 
		System.out.println();
		// decrement
		
		int j = 5; 
		while (j >= 0) {
			System.out.println("Count... " + j);
			j--;
		}
		
		// avoid always the infinity loop --> error 
		
//		int x = 0; // 0, -1, -2, -3 
//		while (true) {
//			System.out.println(x);
//			x--;
//		}
		
		// new line 
		System.out.println();
		
		// do while 
		
		int k = 0; 
		do { // statement: execute no matter whatever happens --> false: once   true: condition
			System.out.println("K Count... " + k);
			k++; 
		} while (k <= 5);
		
		// new line 
		System.out.println();
		
		// decrement
		
		int number = 5; 
		do {
			System.out.println("Count number... " + number);
			number--;
		} while (number >= 0); 


	}

}
