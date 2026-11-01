package oops;
class EmployeeBonus{
	String name;
	int salary;
	int cal;
	
	EmployeeBonus(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	void calculateBonus() {
		if(salary>=50000) {
			cal= salary*10/100;
			System.out.println("Name = " + name);
			System.out.println("Bonus =" +  cal);
		}else {
			cal= salary*5/100;
			System.out.println("Name = " + name);
			System.out.println("Bonus =" + cal);
		}
	}
	
}

public class fourty_C {

	public static void main(String[] args) {
		EmployeeBonus a = new EmployeeBonus("Om" , 70000);
		a.calculateBonus();

	}

}
