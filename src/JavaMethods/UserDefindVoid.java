package JavaMethods;

public class UserDefindVoid {

	// user defined task
	// usage void: does't not return any type value --> without static keyword
	
	 void method1() {
		System.out.println("Here I am traying to access the method1");
	}
	 static void method2() {
		 System.out.println("Here I am traying to access the method2");
	 }
	 public void method3() {
		 System.out.println("Here I am traying to access the method3");
	 }
	 public static void method4() {
		 System.out.println("Here I am traying to access the method4");
	 }
	// main method : to display / execute
	public static void main(String[]args) {
		// calling the methods without static keyword: must create an object the class
		UserDefindVoid obj = new UserDefindVoid();// object of the class 
		obj.method1();
		
		// without static calling the method2
		obj.method2();
		obj.method3();
		
		//with static calling the method4
		obj.method4();
	}
}
