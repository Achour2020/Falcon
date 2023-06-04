package abstraction;

public abstract class Animal {

	/*
	  Abstract: absolute/ full
	  Abstraction: the process of an idea (need implementor)
	  
	  abstract class: is a keyword --> need to use before class reserved keyword
	  
	  abstract method: abstract --> before the signature
	  abstract method: does not have body, but we have to ended with semicolon

		main method --> public static void main (String [] args) {}
		Concrete method --> void, return(primitive data type
		Constructor --> special method: it has the name of the class
		Abstract method --> abstract keyword
	 */
	

	// abstract method
	public abstract void sound();

	/*
	 * Concrete Method:(non abstract) void, return (a method with body { } )
	 */
	public void sleep() {
		System.out.println("An animal can sleep");
	}

	// Constructor
	Animal() {
		System.out.println("This is a non-args constructor from animal class");
	}

	public static void eat() {
		System.out.println("Any animal eat food");
	}

	public final static void run() {
		System.out.println("Any animal can run");
	}

	// main method
	public static void main(String[] args) {
		// Animal.eat();
		eat();
	}
}
