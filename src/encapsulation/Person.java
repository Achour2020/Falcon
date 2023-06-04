package encapsulation;

public class Person {

	/*
	  Class: design/ sketch 
	  Object: is an instance of the class
	  		Instance variable : state 
	  		Instance methods  : behavior 
	  		
	  Encapsulation: data hiding 
	  				private: access modifier
	  				implement two other methods of getter & setter for the each instances 
	  				
	  				this --> is a keyword and use to point on instance variable (reference point)
	  				          is not usable with static keyword
	  				
	  Camel Case name convention: variable & methods firstSecondThirdFourth
	 */
	
	private static String name; 
	private static int age; 
	
	// name
	
	public static String getName() {
		return name; 
	}
	
	public static void setName(String newName) {
		name = newName; 
	}
	
	// age 
	static int getAge() {
		return age; 
	}
	 static void setAge(int newAge) {
		age = newAge; 
	}
	
	// main method 
	public static void main(String [] args) {
		// create an object 
		//Person p4 = new Person(); 
//		p4.setName("Dhruv Patel");
//		p4.setAge(27);
		
//		System.out.println("Name: " +p4.getName());
//		System.out.println("Age: " +p4.getAge());
		
		setName("Rene Valencia");
		setAge(35);
		System.out.println("Name: " +getName());
		System.out.println("Age: " + getAge());
	}
}
