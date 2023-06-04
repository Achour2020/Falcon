package polymorphism;

public class Animal {

	/*
	  Method Overridden: A copy of the parents method to the child 
	 */
	
	public void sound() {
		System.out.println("Any animal is making a sound");
	}
	
	public String name () {
		String name = "Animal's name";
		return name; 
	}
}
