package interfaceTopic;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestA implements A {

	// implement methods of interface --> get the copy of interface method in my implementor class
	
		public void display1() {
			System.out.println("\nHere I am displaying ");
			
			for(char c='A'; c<= 'Z'; c++) {
				System.out.print("  "+c);
			}
		}
		
		// display2
		public void display2() {
			
			Queue <Integer> q = new PriorityQueue<Integer>(); 
			q.add(1);
			q.add(2);
			q.add(3);
			
			// print 
			while (!q.isEmpty()) {
				System.out.println("Number: " +q.poll());
			}
		}
		
		// display3
		public void display3() {
			System.out.println("\n Displaying Z to A character");
			
			for(char ch ='Z'; ch >='A'; ch--) {
				System.out.print("  " +ch);
			}
		}
		

		public static void main(String[] args) {
			/*
			  
			 */
			// x1 = 50; // can not re-initialize the field A interface
			
			TestA obj = new TestA (); 
			System.out.println("x1: " +obj.x1);
			System.out.println("x2: " +obj.x2);
			
			System.out.println("Name: " +obj.name);
			
			// call method name
			obj.display1();
			
			System.out.println("\n Polling the objects from Queue");
			obj.display2();
			
			// dispaly3
			obj.display3();

	}

}
