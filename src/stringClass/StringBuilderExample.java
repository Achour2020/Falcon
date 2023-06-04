package stringClass;

public class StringBuilderExample {

	public static void main(String[] args) {
		/*
		 * StringBuffer --> is part of String Class in Java and this mutable
		 * (changeable)
		 */

		// Create StringBuffer --> new keyword
		StringBuffer str = new StringBuffer();
		System.out.println("Capcity: " + str.capacity()); // fixed capacity for StringBuffer is 16

		StringBuffer buffer = new StringBuffer("hello");
		System.out.println("Buffer: " + buffer);
		System.out.println("Length: " + buffer.length());

		// append --> concatenation String --> +

		buffer.append(" world");
		System.out.println("Buffer: " + buffer);

		// insert()
		// 01234567
		StringBuffer name = new StringBuffer("John Duo");
		System.out.println("\nLength: " + name.length());
		name.insert(8, " is");
		System.out.println("Name: " + name);

		// Reverse a String --> StringBuffer
		StringBuffer sb = new StringBuffer("TEK Dojo");
		System.out.println("\nOriginal: " + sb);
		sb.reverse();
		System.out.println("Reversed: " + sb);

		// .delete() 01234
		StringBuffer s1 = new StringBuffer("helloTEK Dojo");
		System.out.println("\nBefore delete: " + s1);
		s1.delete(0, 5);
		System.out.println("After delete: " + s1);

		// deleteChart(); 01234567
		StringBuffer s2 = new StringBuffer("Welecome");
		System.out.println("\nOriginal: " + s2);
		s2.deleteCharAt(1);
		System.out.println("After another delete: " + s2);
		s2.insert(1, "E");
		System.out.println("Inserted space: " + s2);

		// replace() 0123
		StringBuffer s3 = new StringBuffer("Java");
		System.out.println("\nOriginal: " + s3);
		s3.replace(0, 1, "A");
		System.out.println("Replaced: " + s3);

	}

}
