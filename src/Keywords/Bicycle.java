package Keywords;

public class Bicycle {

	// Parents class of Bicycle
	
	int gear;
	int speed;
	
	// Constructor
	Bicycle(int gear, int speed){
		// this keyword only reference the class data
		this.gear=gear;
		this.speed=speed;
	}
	// method
	int decrement = 10;
	public void brake(int decrement) {
		speed -= decrement;
		System.out.println("Decrease the Speed: "+speed);
	}
	int increase = 10;
	public void speedUp(int increase) {
		speed += increase;
		System.out.println("speed Up: "+speed);
	}
	// toString() : is a Method to print the information of my instances
	
	public String toString () {
		return("# of Gear: "+gear+"\nSpeed of Bicycle: "+speed);
	}
}
