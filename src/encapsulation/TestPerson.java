package encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		/*
		  Create an object for the actual design
		  
		  Create an object of the class--> new with the name of the design
		 */

		Person p1 = new Person();
		
		// To set the instance data
		p1.setName("John Duo");
		p1.setAge(25);
		// To get the name
		System.out.println("Name: " +p1.getName());
		System.out.println("Age: " +p1.getAge());
		
		// Create a new object 
		Person p2 = new Person();
		p2.setName("Susan");
		p2.setAge(23);
		System.out.println("\nName: " +p2.getName());
		System.out.println("Age: " +p2.getAge());
		
		// Create a new object 
				Person p3 = new Person();
				p3.setName("Jim Walker");
				p3.setAge(45);
				System.out.println("\nName: " +p3.getName());
				System.out.println("Age: " +p3.getAge());
	}

}
