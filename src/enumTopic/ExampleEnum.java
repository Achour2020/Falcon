package enumTopic;

public class ExampleEnum {

	public enum Seasons{
		
		/*
		  enum: is reserved keyword
		        is a special class --> class is a design/sketch (it has objects) 
		  enum is representing a group of constants (variable) --> constants means final variables
		  1. They are constant --> fixed
		
		  
		  like, directions, days of the week, months of the year, seasons
		  
		  Enum --> SPRING, SUMMER, WINTER, FALL   
		  
		  Enums are created in Caps
		  
		 */
		
		
			SPRING, // 0   <-- index
			SUMMER, // 1
			WINTER, // 2
			FALL   // 3 
	}
	// main 
		public static void main(String[] args) {
			// execute 
			
			Seasons obj = Seasons.FALL; 
			System.out.println("Season: " +obj);
			
			System.out.println("Value: " +Seasons.WINTER);
			
			System.out.println();
			
			// iteration 
			for(Seasons s: Seasons.values()) {
				System.out.println("Season: " +s);
			}
			
			// methods 
			System.out.println("\nValue: " + Seasons.valueOf("WINTER"));
			System.out.println("Index: " + Seasons.valueOf("WINTER").ordinal());
			
			System.out.println("Index of FALL: " + Seasons.valueOf("FALL").ordinal());
			
			int x =3, y =4; 
			System.out.println("x" +x);
			System.out.println("y: " +y);
			
			for (int i =0; i<=5; i++) {
				i = i+2; 
				System.out.println("i: " +i);
			}
			
			String str = "TEK Dojo";
			
			System.out.println(str.length());
		}
}
