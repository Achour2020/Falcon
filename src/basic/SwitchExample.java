package basic;

public class SwitchExample {

	public static void main(String[] args) {
		// switch, case, break, default: keywords 
				// to control the selection statement

				// 7 days: week
				int day = 5;

				// condition
				switch (day) {
				case 1:
					System.out.println("Today is Monday!");
					// break: go out of the case condition
					break;

				case 2:
					System.out.println("Today is Tuesday!");
					break;

				case 3:
					System.out.println("Today is Wednesday!");
					break;

				case 4:
					System.out.println("Today is Thursday!");
					break;

				case 5:
					System.out.println("Today is Friday!");
					break;

				case 6:
					System.out.println("It is weekend!");
					break;

				// else condition / otherwise
				default:
					System.out.println("You've inserted a wrong number into the application");
					break;

				}


	}

}
