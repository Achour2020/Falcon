package Array;

public class SumArray {

	public static void main(String[] args) {
		/*
		 1 2 3 4 5 6 7 8 9
		 */
		
		int[]number = {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<number.length; i++) {
			System.out.println(" "+number[i]);
		}
		
		// finding the total of the elements
		
		int sum =0;
		for(int i=0; i<number.length; i++) {
			sum += number[i];
		}
		// print the sum / total
		System.out.println("Sum:"+sum);

	}

}
