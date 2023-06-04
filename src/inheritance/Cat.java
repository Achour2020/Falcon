package inheritance;

public class Cat extends Dog {

	@Override
	public void display() {
		name = "Cat Name" ;
		System.out.println("\nName: "+ name);
	}
	
	public void displayAge() {
		age = 4; 
		System.out.println("Age: " +age);
	}
}
