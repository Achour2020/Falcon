package interfaceTopic;

public class TestInterface implements InterfaceExample1 {

	/*
	  implements:  the interface into the class TestInterface 
	 */

	// copy of the interface methods
	
	public void method1() {
		System.out.println("I am implementing the idea of Method1");
	}
	
	public void method2() {
		System.out.println("I am implementing the idea of Method2");
	}
	
	// main
	
	public static void main(String[] args) {
		InterfaceExample1 obj = new TestInterface();
		
		obj.method1();
		obj.method2();
		
		System.out.println(obj.x);
	}
}
