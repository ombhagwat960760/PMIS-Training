package oops;
class intrest{
	double principle;
	double rate;
	int time;
	double cal;
	
	intrest(double principle ,double rate ,int time ){
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}
	
	void calIntrest() {
		cal=(principle*rate*time)/100;
		System.out.println("Intrest = " + cal);
	}
}

public class nineth_C {

	public static void main(String[] args) {
		intrest a =new intrest(10000,5,2);
		a.calIntrest();

	}

}
