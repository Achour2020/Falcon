package polymorphism;

public class Dog extends Animal {

	// The tag of Overrides: Run Time method 

		@Override
		public void sound() {
			// implementation
			System.out.println("Dog is also making a sound");
		}
		
		public String name() {
			String name ="Dog's name";
			return name;
			
			
		}
}
