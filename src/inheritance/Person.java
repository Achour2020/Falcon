package inheritance;

public class Person {

	// Parents / Base/ main/ super class
	
		// variables/ fields / attribute 
		String name = "Susan"; 
		int age = 21; 
		String city = "Falls Church"; 
		
		// method 
		public void show1() {
			System.out.println("Person's information");
		}
		
		
		// instance --> encapsulation
		private int ssn;
		
		public int getSSN() {
			return ssn; 
		}
		public void setSSN(int s) {
			this.ssn = s; 
		}
		
		// Override method: a have in parents class --> give a copy to child class
		public void a() {
			System.out.println("A copy of the parents to the child");
		}
	
	
}
