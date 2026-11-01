package oops;
class StudentGrade{
	String name;
	int marks;
	
	StudentGrade(String name , int marks){
		this.name=name;
		this.marks=marks;	
	}
	void checkGrade() {
		if(marks>=90) {
			System.out.println("Student Name = " + name);
			System.out.println("Grade A");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("Student Name = " + name);
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<75) {
			System.out.println("Student Name = " + name);
			System.out.println("Grade C");
		}
		else {
			System.out.println("Student Name = " + name);
			System.out.println("Fail");
		}
	}
}

public class thirty_C {

	public static void main(String[] args) {
		StudentGrade a = new StudentGrade("om" , 66);
		a.checkGrade();
	}

}
