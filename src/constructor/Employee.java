package constructor;

public class Employee {

	public int id; 
	public String name; 
	public String position; 
	public String employer; 
	public String location; 
	public double salary; 
	
	Employee (){
	
	}
	
	public Employee (int employeeID, String employeeName, String employeePosition, String employeeEmployer,
			 String employeeLocation, double employeeSalary){
		
		id = employeeID;
		name = employeeName; 
		position = employeePosition;
		employer = employeeEmployer;
		location = employeeLocation;
		salary = employeeSalary;
	}
	
	// behavior --> method (action) 
	public String r1() {
		return "Overseeing daily business operations"; 
	}
	public String r2() {
		return "Developing and implementing growth strategies"; 
	}
	public String r3() {
		return "Creating and managing budgets"; 
	}
	public String r4() {
		return "Improving revenue and recruting new employees"; 
	}
	
	// main method
	public static void main(String[] args) {
		Employee e1 = new Employee (102, "Ahmad", "Manager", "Aetna Health Insurance" , "Washington DC", 95000);
		System.out.println(" Employee1 Information" );
		System.out.println(" ____________________");
		System.out.println("\nID: " +e1.id + "\nName: " +e1.name + "\nPosition: " +e1.position + "\nEmployer: " +e1.employer
						+ "\nLocation: " +e1.location + "\nSalary: " +e1.salary);
		
		
		System.out.println("\n Employee1 Responsibilities ");
		System.out.println(" _________________________");
		
		System.out.println("\n1.: " +e1.r1() + "\n2.: "+ e1.r2() + "\n3.: " +e1.r3() + "\n4.: " +e1.r4());
		
		
		// e2
		Employee  e2 = new Employee (105, "Rene", "Manager", "Aetna Health Insurance" , "Washington DC", 95000);
		System.out.println("\n Employee2 Information" );
		System.out.println(" ____________________");
		System.out.println("\nID: " +e2.id + "\nName: " +e2.name + "\nPosition: " +e2.position + "\nEmployer: " +e2.employer
						+ "\nLocation: " +e2.location + "\nSalary: " +e2.salary);
		
	}
}
