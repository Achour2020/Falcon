package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// Creating an object for Person class (base class)
				System.out.println("Person class (base class)");
				Person p = new Person();
				System.out.println("Name: " +p.name + "\nAge: " +p.age + "\nCity: "+p.city);
				p.show1();
				p.setSSN(1234567899);
				System.out.println("SSN: " +p.getSSN());
				
				// we can not get the instances of the child in a parents class
				// p.marks();
				
				// accessing the override method via single inheritance from parents
				p.a();
				
				
			
				// creating an object for the Student class (child class)
				System.out.println("\nStudent class (child class)");
				Student s = new Student();
				
				System.out.println("Name: " +s.name);
				System.out.println("Age: " +s.age);
				System.out.println("City: " +s.city);
				s.show1();
				s.setSSN(789456321);
				System.out.println("SSN: " +s.getSSN());
				s.marks();
				//System.out.println("Marks: " +s.marks);
				
				// accessing the override method via single inheritance
				s.a();

			}

}
