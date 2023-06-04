package encapsulation;

public class Student {

	// Encapsulation: data hiding --> private access modifier
		private String name;
		private int number;
		private double fee;

		// name
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// number
		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		// fee
		public double getFee() {
			return fee;
		}

		public void setFee(double fee) {
			this.fee = fee;
		}
		
		
}
