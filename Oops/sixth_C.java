package oops;
class square{
	int side;
	int sum;
	
	square(int side){
		this.side=side;
	}
	
	void calculateArea(){
		sum=side*side;
		System.out.println("Area of squre = " + sum);
	}
}

public class sixth_C {

	public static void main(String[] args) {
		square a = new square(10);
		a.calculateArea();
	}

}
