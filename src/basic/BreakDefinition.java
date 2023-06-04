package basic;

public class BreakDefinition {

	public static void main(String[] args) {
		/*
		 break : reserved key --> use to terminate the loop if the condition is true for break execution
		 */
		
		// switch , case , break , default 
		
		int number = 2;
				switch(number) {
				
				case 1:
					System.out.println("This is number 1");
					break;
				case 2:
					System.out.println("This is number 2");
					break;
				case 3:
					System.out.println("This is number 3");
					break;
					default:
					System.out.println("this not a number");
				    break;
				}

	}

}
