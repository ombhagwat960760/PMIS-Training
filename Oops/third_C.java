package oops;
class Employee{
	String name;
	double salary;
	
	Employee(String name , double salary){
		this.name=name;
		this.salary=salary;
		
	}
}


public class third_C {

	public static void main(String[] args) {
		Employee a= new Employee("omya", 4444.77);
		System.out.println("Name= "+a.name);
		System.out.println("salary= "+a.salary);

	}

}
