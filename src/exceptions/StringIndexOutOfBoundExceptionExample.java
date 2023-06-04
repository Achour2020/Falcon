package exceptions;

public class StringIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		// String --> index 
		
				try {
					//             0123456
					String name = "TEKDojo";
					System.out.println("Length: " +name.length());
					
					char c = name.charAt(50); 
					System.out.println("Index 0: " +c);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					//System.out.println(e.getMessage());
					//System.out.println("You have requested an out of range character! ");
				}

	}

}
