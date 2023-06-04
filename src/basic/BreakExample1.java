package basic;

public class BreakExample1 {

	public static void main(String[] args) {
		/*
		 break : reserved key --> use to terminate the loop
		 */
		
		for (int i=1; i<=10; i++) {
			// terminate the count ...5
			if (i == 5) 
				break;// terminated the loop
			System.out.println("Count .."+i);
			
		}
		System.out.println("Count is ended");

	}

}
