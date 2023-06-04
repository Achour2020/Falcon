package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLiastExample4 {

	public static void main(String[] args) {
		// ArrayList --> Character
		
				ArrayList <Character> alphabet = new ArrayList<Character>();
				
				alphabet.add('A'); 
				alphabet.add('D'); 
				alphabet.add('B'); 
				alphabet.add('E'); 
				alphabet.add('C'); 
				alphabet.add('G'); 
				alphabet.add('F'); 
				
				System.out.println("Unsorted alphabet: " +alphabet);
				
				Collections.sort(alphabet);
				System.out.println("sorted alphabet:   " +alphabet);
				
				Collections.reverse(alphabet);
				System.out.println("Reversed alphabet: " +alphabet);
				
				// reverse in 2 arguments
			

				Collections.sort(alphabet, Collections.reverseOrder());
				System.out.println("\nReversed alphabet: " +alphabet);

	}

}
