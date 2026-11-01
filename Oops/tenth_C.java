package oops;
class student{
	String name;
	int marks;
	
	student(String name ,int marks ){
		this.name=name;
		this.marks=marks;
	}
	void displayResult() {
		System.out.println("Name = " + name);
		System.out.println("Marks = " + marks);
		if(marks>=35) {
			System.out.println("Result = Pass");
		}else {
			System.out.println("Result = Fail");
		}
		
	}
}

public class tenth_C {

	public static void main(String[] args) {
		student a = new student("om" , 37);
		a.displayResult();

	}

}
