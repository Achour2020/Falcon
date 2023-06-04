package exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			String name = null; 
			System.out.println("Name: " +name.toUpperCase());
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			System.out.println("You variable should be initialized to Null Values!");
		}

	}

}
