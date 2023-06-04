package basic;

public class IfElseIfStatement_15 {

	public static void main(String[] args) {
		// if, else if statement

		double gpa = 89;

		// if (gpa >= 95 ) {
//					System.out.println("GPA: A+ Grade");
//				}  else if (gpa >= 90) {
//					System.out.println("GPA: A Grade");
//				} else if (gpa >= 80) {
//					System.out.println("GPA: B Grade");
//				} else if (gpa >= 70) {
//					System.out.println("GPA: C Grade");
//				} else if (gpa >= 60) {
//					System.out.println("GPA: D Grade");
//				} else {
//					System.out.println("You have failed!");
//				}

		// && AND Both --> true || OR One --> true

		if (gpa <= 100 && gpa >= 90) {
			System.out.println("GPA: A Grade");
		} else if (gpa < 90 && gpa >= 80) {
			System.out.println("GPA: B Grade");
		} else if (gpa < 80 && gpa >= 70) {
			System.out.println("GPA: C Grade");
		} else if (gpa < 70 && gpa >= 60) {
			System.out.println("GPA: D Grade");
		} else {
			System.out.println("You have failed!");
		}

	}

}
