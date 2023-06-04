package encapsulation;

public class Employee {

	// instances
	
		private int ssn; 
		private String name;
		private int age; 
		
		// Methods for each instance: 
		// 1. getter method
		public int getSSN() {
			return ssn; 
		}
		
		// 2. setter method
		public void setSSN(int ssnValue) {
			ssn = ssnValue; 
		}
		
		// name
		public String getName() {
			return name; 
		}
		public void setName(String nameValue) {
			name = nameValue; 
		}
		
		// age 
		public int getAge() {
			return age;
		}
		
		public void setAge(int ageValue) {
			age = ageValue;
		}

		// main method
	    public static void main(String[] args) {
			Student obj =new Student(); 
			obj.setName("Eagle");
					
			System.out.println("Name: " +obj.getName());
		}
}
