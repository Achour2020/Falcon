package encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		

	// Creating an object
	Student s1 = new Student();
	
	// Set the data --> object container
	
	s1.setName("Falcon SDET Class");
	s1.setNumber(15);
	s1.setFee(350);
	
	// get the data 
	System.out.println("Name: "+s1.getName()+"\nNumber: "+s1.getNumber()+"\nFee: "+s1.getFee());
	
	// Another object
	Student s2 = new Student ();
	
	// set the data --> object container
	s2.setName("Rainbnow SDET Clas");
	s2.setNumber(15);
	s2.setFee(350);
	
	// get the data
	System.out.println("\nName: " + s2.getName() + "\nNumber: " + s2.getNumber() + "\nFee: " + s2.getFee());
	}
}
