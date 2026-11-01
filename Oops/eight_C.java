package oops;
class rectanglee{
	int length;
	int width;
	int calc;
	
	 rectanglee(int length , int width) {
		this.length=length;
		this.width=width;
	}
	void calculatePerimeter(){
		calc=2*(length+width);
		System.out.println(calc);
	}
}

public class eight_C {

	public static void main(String[] args) {
		rectanglee a=new rectanglee(20,34);
		a.calculatePerimeter();

	}

}
