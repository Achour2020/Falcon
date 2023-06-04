package constructor;

public class NoArgsConstructor_2 {

	// Constructor --> special method
	// Constructor --> same name of the class

	int x;
	int y;

	// 1. Non argument constructor : does not take parameters (arguments / values)
	NoArgsConstructor_2() {
		x = 5;
		y = 10;
	}

	// method
	void display() {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

	// main method
	public static void main(String[] args) {
		// create an object
		NoArgsConstructor_2 obj = new NoArgsConstructor_2();
		// printing via object refer to constructor

		System.out.println("X: " + obj.x);
		System.out.println("Y: " + obj.y);

		System.out.println();
		// calling via method
		obj.display();

	}
}
