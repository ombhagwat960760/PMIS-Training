package oops;
class ElectricityBill{
	String name;
	int unit;
	
	ElectricityBill(String name , int unit){
		this.name=name;
		this.unit=unit;
	}
	void calculateBill() {
		if(unit>100) {
			System.out.println("Name = " + name);
			System.out.println("Total bill = " + unit*8);
		}else {
			System.out.println("Name = " + name);
			System.out.println("Total bill = " + unit*5);
		}
	}
}

public class fiftheen_C {

	public static void main(String[] args) {
		ElectricityBill a = new ElectricityBill("Om",150);
		a.calculateBill();

	}

}
