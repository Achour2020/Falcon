package basic;

public class SwitchOperators {

	public static void main(String[] args) {
		/*
		  number = 2; 
		  
		   number * 5 + number = 10
		   number * 5 + number = 20
		   number * 5 + number = 40
		    number * 5 + number = 60
		    
		 */
		int number = 25; 
		System.out.println("Result: " + (number * 5 + number));
		
		switch (number * 5 + number) {
		
		case 10: 
			System.out.println("Result is matching with case 10 ");
			break; 
			
		case 20:
			System.out.println("Result is matching with case 20");
			break; 
			
		case 30:
			System.out.println("Result is matching with case 30");
			break; 
			
		case 40:
			System.out.println("Result is matching with case 40");
			break; 
			
		case 50:
			System.out.println("Result is matching with case 50");
			break; 
			
		case 60:
			System.out.println("Result is matching with case 60");
			break; 
			
			default:
				System.out.println("Arithmatic operation result is NOT matching with the Expression OR any cases");
		}

	}

}
