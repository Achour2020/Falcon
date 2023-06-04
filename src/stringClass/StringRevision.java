package stringClass;

public class StringRevision {

	public static void main(String[] args) {
		/*
		 * String is a reference class/ non primitive data type String is immutable -->
		 * not changeable (we have to go with its method)
		 */

		// 1 Create String

		String name1 = "Rene Valencia";
		String name2 = "Rene Valencia";
		System.out.println("Name1: " + name1.length());
		System.out.println("Name1: " + name1.toUpperCase());
		System.out.println("Name1: " + name1.indexOf("a"));

		for (int i = 0; i < name1.length(); i++) {
			char c = name1.charAt(i);
			System.out.println("Character at " + i + " Position " + c);
		}
		// equality operator --> return boolean (false/true)
		System.out.println("\nName1 is eqaul to Name2: " + (name1 == name2));

		// 2. Create String --> new keyword
		String t1 = new String("Hello");
		String t2 = new String("Hello");

		System.out.println("\nt1: " + t1);
		System.out.println("t1: " + t1.toUpperCase());
		System.out.println("t1 is eqaul to t2: " + (t1 == t2)); // equality operator == return is false always

		// checking any object to be equal --> .equal() // return type boolean (compare)
		System.out.println("t1 is equal to t2: " + t1.equals(t2));

		// 01234
		String text = "hello";
		System.out.println("\ntext in SubString: " + text.substring(0));
		System.out.println("Text in Index: " + text.indexOf("o"));
		
		// we using . equal when we created a new keyword because the equality operator == return false always .
	}

}
