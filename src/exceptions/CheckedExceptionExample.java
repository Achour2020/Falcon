package exceptions;

import java.util.Scanner;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		/*
		 * Checked Exception:
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println(" Type some value ");

		// checked --> ioExcetpion

		try {
			System.out.println("Return: " + scan.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}

		scan.close();

	}

}
