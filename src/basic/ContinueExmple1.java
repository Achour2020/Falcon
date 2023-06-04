package basic;

public class ContinueExmple1 {

	public static void main(String[] args) {
		/*
		 continue in a for loop keep the iteration / force to execute
		 && and --> both
		 || or --> one
		 */
		for(int i=0; i<=15; i++) {
		
			//check condition for continue
			if(i==2 || i==3) {
				// skip the execution either i ==8 or i ==13
				continue; // jump
			}
			System.out.println("Step..."+i);
		}
        System.out.println("\ncontinue keyword in a while loop");
		
		int number = 1;
		while (number <= 15) {

			// check condition for continue in a while
			if (number == 2 || number == 3) {
				// Stop either i == 2 OR i == 3
				continue; // jump
			}
			System.out.println("Step... " + number);
			number++;
			// to terminate the loop from running
			break;
		}
		
		System.out.println("End the while loop!");
	}

}
