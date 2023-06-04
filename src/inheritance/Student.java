package inheritance;

public class Student extends Person{

	// Inheritance: extends (single inheritance)
	
		int marks = 78;
		
		public void marks() {
			System.out.println("Marks: " +marks);
		}
		
		@Override
		public void a() {
			System.out.println("implemeting in my way!");
		}
}
