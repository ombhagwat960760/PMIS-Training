package oops;
class Employee1{
	static String company="TCS";
	String name;
}

public class twenty_S {

	public static void main(String[] args) {
		Employee1 e1= new Employee1();
		e1.name="Om";
		System.out.println(e1.name);
		System.out.println(Employee1.company);
		Employee1 e2= new Employee1();
		e2.name="Rahul";
		System.out.println(e2.name);
		System.out.println(Employee1.company);
		
		Employee1.company = "Infosys";
		System.out.println(Employee1.company);

	}

}
