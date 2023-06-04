package constructor;

public class NoArgsExample_3 {

	// Constructor --> name of the class (special method)
	
		int num; 
		String name; 
		
//		// constructor --> Default Constructor
//		NoArgsExample2 (){
//			
//		}
	//	
		
		// Constructor --> no argument constructor 
		NoArgsExample_3 (){
			System.out.println(" Calling this no argument constructor");
			num = 50;
			name = "Falcon";
	 }
		
		// main method 
		public static void main(String[] args) {
			NoArgsExample_3 obj = new NoArgsExample_3(); 
			
			
			
			System.out.println("Number: " + obj.num);
			System.out.println("Name: " +obj.name);
	}
}
