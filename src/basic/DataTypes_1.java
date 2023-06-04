package basic;

public class DataTypes_1{

	public static void main(String[] args) {
     /*
      java is an object-oriented programming language
      Data Type: modify/specify the different sizes and values that can be stored in a container/variable/placeholder.
     1. primitive data type: 8 reserved keywords/ written in lower- case : talking about the reserved primitive type in terms size and definitions.
       Numeric numbers:--> byte, short, int, long something like ( 1, 12734, 22345678, 7832564856755234)
       Fractional numbers / decimal numbers:--> float, double something like ( 1.12345684, 1.23654865124457)
       A letter / character: --> char (a, A) when store a char value --> 'a' :
       A flag/ is Student: boolean--> store/ return either ( true or false)
       
     2. Non- primitive data type/ reference data type: that include the String, Class, Arrays, Interface 
       String: to store sequential characters/ collections of letters --> "hello": 
       Container/ Variable: place holder--> x = 3 . (X) is a container/ placeholder and (3) the value (=) assignment operator (;) semicolon end the line of code
         
      variable_nnaming_ convention: starts with lower-case | two/more words: --> camelCase type | camel_case|
      */
      
      // byte: store whole numbers from (-128 to 127) | 1 byte = 8 bit(binary digits) 0s & 1s
		
		byte myByte = 127;
		System.out.println("byte:" + myByte);
		
      // short: store whole numbers from (-32,768 to 32,767) | 2 bytes = 16 bits
		
		short myShort = -32768;
		System.out.println("short:"+ myShort);
		
	  // int : store whole numbers | 4 bytes = 32 bits 
		
		int myInt = 235465945;
		System.out.println("int:"+ myInt);
		
	  //long: 8 bytes = 64 bits | --> add lower-case/ upper-case l, L
		
		long myLong = 546287515548L;
		System.out.println("long:"+ myLong);
		
	  // float: 4 bytes = 32 bits stores fractional numbers (6 to 7) decimal digits | --> add lower-case/ upper-case f, F
		
		float myFloat = 1.123456F;
		System.out.println("float:"+ myFloat);
		
	  // double: 8 bytes = 64 bits stores fractional numbers 15 decimal digits
		
		double myDouble = 1.123546875125468;
		System.out.println("double:"+ myDouble);
		
	 // char: means single character/ letter (a, b, B, A)--> use single quotation '
		
		char myChar='A';
		System.out.println("char:"+ myChar);
		
    // boolean: size 1 bit--> stores (true or false) reserved keywords values
		
		boolean myboolean = true;
		System.out.println("boolean:"+ myboolean);
		
	//2. Non primitive data type string: sequential letters --> store values inside the double quotation " " like --> name = Ahmad 
		
		String name = "John";
		System.out.println("Name:"+name);
		
		String lastName = "Duo";
		System.out.println("Last name:"+ lastName);
		
   // + concatenation when it is used with string: connecting the data/ description/ variable: containers
		System.out.println("full Name:"+ name +" "+ lastName);
		
		
		
	
	
		
		
         

         
       

       
       
      
	}

}
