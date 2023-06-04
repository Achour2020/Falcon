package exceptions;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		try {
			int number = Integer.parseInt("TEK Dojo"); 
			System.out.println("Number: " +number);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.toString());
			System.out.println("Number Format Exception Occured. You have to change the value with a whole number!");
		}

	}

}
