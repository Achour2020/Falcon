package constructor;

public class TestRunner {

	public static void main(String[]args) {
		
		// creating an object
		Employee e1 = new Employee (102, "Ahmad", "Manager", "Aetna Health Insurance" , "Washington DC", 95000);
				System.out.println(" Employee1 Information" );
				System.out.println(" ____________________");
				System.out.println("\nID: " +e1.id + "\nName: " +e1.name + "\nPosition: " +e1.position + "\nEmployer: " +e1.employer
								+ "\nLocation: " +e1.location + "\nSalary: " +e1.salary);
				
				
				System.out.println("\n Employee1 Responsibilities ");
				System.out.println(" _________________________");
				
				System.out.println("\n1.: " +e1.r1() + "\n2.: "+ e1.r2() + "\n3.: " +e1.r3() + "\n4.: " +e1.r4());
				

	}
}
