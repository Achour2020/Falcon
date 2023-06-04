package inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		// Create an object for Animal Class
		
				Animal a = new Animal();
				a.display();
				//System.out.println("Name: " +a.name);
				a.displayAge();// 5
				a.eat();
				
				// create an object for Dog Class
				Dog d = new Dog();
				d.display(); // just call the method name to display the value
				//System.out.println("Name: " +d.name);
				
				d.displayAge(); // 3
				
				//d.eat();
				
				// create an object 
				Cat c = new Cat();
				c.display();
				c.displayAge();
				//c.eat();
				
				

			

	}

}
