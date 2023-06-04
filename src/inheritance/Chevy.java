package inheritance;

public class Chevy extends Vehicle {

	public void carInfo() {
		name = "Chev Car";
		price = 41000; 
		System.out.println("\nCar information");
		System.out.println("Name: " +name + "\nPrice: " +price);
	}
}
