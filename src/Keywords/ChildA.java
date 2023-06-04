package Keywords;

public class ChildA extends Parents {

	int number =15;
	public void printNumber() {
		// you want to call your data from parents to child:--> super
		
		System.out.println("Original Number : "+super.number);
	}
	public void myMethod() {
		super.display();
	}
}
