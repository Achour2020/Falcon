package basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime_11 {

	public static void main(String[] args) {
		/*
		 1. use new keyword to create an object of the class 
		    object : state, behavior 
		 2. To get the JRE system: import the appropriate class for that topic
		 3. the class Date and Time is coming from java.utils class
		 */
     
		// Create the Object class 
		Date date = new Date ();
		System.out.println("Date:"+date);
		
		// local date and time
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Local Date & Time:"+ldt);
		
		// custom Date : import the class of LocalDate from java.util
		LocalDate ld = LocalDate.of(2020, 9, 01);
		System.out.println("Local Date:"+ld);

	}

}
