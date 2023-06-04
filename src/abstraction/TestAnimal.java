package abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		// can not instantiate (create) the object of the abstract class
		// Animal a = new Animal();

		// 1. to instantiate the object of the class
		Animal a = new Dog();
//				a.sound();
//				a.sleep();
		a.eat();
		a.run();

		// 2. to instantiate the object of the class
		// Dog d = new Dog();
//				d.sound();
//				d.sleep();
		

		// System.out.println(d);
	}

}
