package abstraction;

public class Dog extends Animal {

	@Override // implements: must be implemented
	public void sound() {
		System.out.println("A dog have a different sound like: bark bark");
	}

	// has the method --> copy here

	@Override // overrides
	public void sleep() {

	}

	// can not override the final method into child class
//	public  static void run() {
//		System.out.println("Any animal can run");
//	}

//	// Constructor 
//		Dog(){
//			System.out.println("This is a non-args constructor from Dog class");
//		}

	// main method
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}
