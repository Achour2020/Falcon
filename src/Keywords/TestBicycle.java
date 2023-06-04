package Keywords;

public class TestBicycle {

	public static void main(String[] args) {
		
		// Create an object parents class
		
		Bicycle b = new Bicycle (4,50);
		System.out.println(b.toString());
		
		b.brake(10);
		b.speedUp(10);
		
		// Child object
		SportBicycle sb = new SportBicycle(4,50);
		System.out.println(sb.toString());
		
		sb.brake(10);
		sb.speedUp(10);

	}

}
