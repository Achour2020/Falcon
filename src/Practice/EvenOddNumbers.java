package Practice;

public class EvenOddNumbers {

	public static void main(String[] args) {
		/*
		  Odd: 1 3 5 7 9 11
		  Even: 2 4 6 8 10
		 */
		
		int number = 20; 
		for (int i=0; i<= number; i++) {
			/*
			  i % 2 == 0 even number
			  i % 2 != 0 odd number
			 */
			if(i % 2 != 0) {
				System.out.print(" " + i);
			}
		}

	}

}
