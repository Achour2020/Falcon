package JavaMethods;

public class Example1 {

	// condition
		public static int getMax(int x, int y) {
			if ( x > y) {
				return x; 
			} else {
				return y;
			}
		}
		
		public static void main(String[] args) {
			int max1 = getMax(15, 10);
			System.out.println("Out of the 15 and 10, " + max1 + " is greater");
			
			int max2 = getMax(1, 10);
			System.out.println("Out of the 1 and 10, " + max2 + " is greater");

		}
}
