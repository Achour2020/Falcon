package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		// creating an object of the class
				Employee e1 = new Employee();
				e1.setSSN(123456789);
				e1.setName("Liya");
				e1.setAge(24);
				
				System.out.println("SSN: " +e1.getSSN());
				System.out.println("Name: " + e1.getName());
				System.out.println("Age: " +e1.getAge());
				
				// another employee
				Employee e2 = new Employee();
				e1.setSSN(21374673);
				e1.setName("Rene");
				e1.setAge(28);
				
				System.out.println("\nSSN: " +e1.getSSN());
				System.out.println("Name: " + e1.getName());
				System.out.println("Age: " +e1.getAge());

	}

}
