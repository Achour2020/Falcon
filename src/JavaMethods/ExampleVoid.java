package JavaMethods;

public class ExampleVoid {

	public static void lastName(String fName, int age) {
		System.out.println(fName + "Khan" + " is " + age);
	}
	
	// main method
	public static void main(String [] args) {
		lastName("Shahrukh ", 55); 
		lastName("Salman ", 55);
		lastName("Aamir ", 60);
		lastName("Salman ", 55);
	}
	
}
