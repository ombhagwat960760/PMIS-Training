package oops;
class Student{
	String Name;
	static String collage="ABC Collage";
}

public class ninteen_Static {

	public static void main(String[] args) {
		
		Student Om= new Student();
		Student Janhvai= new Student();
		Student Kaushik=new Student();
		
		Om.Name="Om";
		Janhvai.Name="Janhvai";
		Kaushik.Name="Kaushik";
		
		System.out.println(Om.Name);
		System.out.println(Student.collage);
		System.out.println(Janhvai.Name);
		System.out.println(Student.collage);
		System.out.println(Kaushik.Name);
		System.out.println(Student.collage);

	}

}
