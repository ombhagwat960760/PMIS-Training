package ifelse;

public class five5 {

	public static void main(String[] args) {
		int y=2024;
		
		if(y%400==0 || y%4==0 && y%100!=0) {
			System.out.println("Year is a Leap year");
		}
		else {
			System.out.println("Year is not a Leap year");
		}

	}

}
