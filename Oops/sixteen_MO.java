package oops;
class student1{
	String name;
	int age;
	
	student1(String name , int age){
		this.name=name;
		this.age=age;
	}
	
    student1(String name){
		this.name=name;
		age=18;
	}
    
    void display() {
    	System.out.println("Name = " +name);
    	System.out.println("Age = " +age);
    }
}
public class sixteen_MO {

	public static void main(String[] args) {
		student1 a = new student1("om" , 22);
		a.display();
		student1 b = new student1("om");
		b.display();
	}
}
