package enumTopic;

public class TestDirections {

	public static void main(String[] args) {
		// create the object of the enums in this class
		
				Directions d = Directions.SOUTH; 
				
				//System.out.println("Direction: " +d);
				
				if (d == Directions.EAST) {
					System.out.println("Direction is: " +d);
				} else if (d == Directions.WEST) {
					System.out.println("Direction is: " +d);
				} else if (d == Directions.SOUTH) {
					System.out.println("Direction is: " +d);
				} else {
					System.out.println("Direction is: " +d);
				}
				
				// methods of the enum
				
				System.out.println("\nNORTH: " + Directions.NORTH);
				System.out.println("EAST: " + Directions.valueOf("EAST"));
				System.out.println("Index of EAST: " +Directions.valueOf("EAST").ordinal());
		

	}

}
