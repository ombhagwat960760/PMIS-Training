package oops;
class Calculator{
	
	
	public void add(int a, int b){
		System.out.println("Sum of two integer is = " + (a+b));
	}
	public void add(int a, int b , int c){
		System.out.println("Sum of three integer is = " + (a+b+c));
	}
	public void add(double a, double b) {
		System.out.println("Sum of decimals = " + (a+b));
	}
}

public class seventeen_MO {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		a.add(10 ,20);
		a.add(10, 40,33);
		a.add(11.2, 22.2);
		

	}

}
