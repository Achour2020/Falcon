package Practice;

public class TemporaryEmp extends Employee {

	double hike =0.35;
	void incrementsalary() {
		System.out.println("The temporary employee incremented salary is :"+(salary + (salary*hike)));
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		PermanentEmp p = new PermanentEmp();
		TemporaryEmp t = new TemporaryEmp();
		e.incrementSalary();
		p.incrementSalary();
		t.incrementsalary();

		
	}

}
