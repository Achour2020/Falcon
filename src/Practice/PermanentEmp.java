package Practice;

public class PermanentEmp extends Employee {

	
	
	double hike = 0.5;
	void incrementSalary() {
		System.out.println("The permanent employee incremented salary is :"+(salary+(salary * hike)));
	}
}
