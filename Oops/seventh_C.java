package oops;
class circle{
	double radious;
	double calculation;
	
	circle(double radious){
		this.radious=radious;
	}
	
	void calculate() {
		calculation=2*3.14*radious;
		System.out.println("circumference =" + calculation);
	}
}

public class seventh_C {

	public static void main(String[] args) {
		circle a = new circle(44);
		a.calculate();

	}

}
