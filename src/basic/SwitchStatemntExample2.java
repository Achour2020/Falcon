package basic;

public class SwitchStatemntExample2 {

	public static void main(String[] args) {
		// switch --> char 
		
				/*
				  A  --> Excellent 
				  B  --> Good
				  C -->  Fair 
				  D  --> Satisfactory 
				  E  --> Need improvement 
				 */
				
				char grade = 'C';
				
				switch (grade) {
				
				// Is condition matching the expression? 
				case 'A': 
					System.out.println(grade + " Excellent");
					break; 
					
				case 'B': 
					System.out.println(grade + " Good");
					break;
					
				case 'C': 
					System.out.println(grade + " Fair");
					break;
					
				case 'D':
					System.out.println(grade + " Satisfactory");
					break; 
					
				case 'E':
					System.out.println(grade + " Need improvement");
					break; 
					
					default:
						System.out.println(" Expression is not matching the condition ");
				
				}


	}

}
