package basic;

public class CountnuekeyWord {

	public static void main(String[] args) {
		//Continue : jump and force to execute the loop iteration in a for loop iterative approach
		System.out.println("Continue in a for loop execution");
		for (int i=1; i<=5; i++) {
			// if statement --> condition
			if (i==5) {
				// continue the iteration loop
				continue;	
			}
			System.out.println("Step..."+i);
		}
       // continue: control immediately jumps to the boolean expression
		System.out.println("\nContinue in a while-do while execution ");
		
		int number =2;
		while (number <=5) {
			// condition + continue key word
			if (number ==2) { // boolean : true / false 
				//jump the execution and exit the 
			}
			System.out.println("Step.."+number);
			number ++;
		}
	}

}
