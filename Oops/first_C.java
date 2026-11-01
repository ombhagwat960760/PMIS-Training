package oops;
class calc{
	int num1;
	int num2;
	int sum;
	
	void result() {
		sum=num1+num2;
	}
}

public class first_C {

	public static void main(String[] args) {
		calc obj = new calc();
		obj.num1=10;
		obj.num2=20;
		obj.result();
		System.out.println(obj.sum);
		

	}

}
