package oops;
class car{
	String brand;
	int year;
	
	car(String brand , int year){
		this.brand=brand;
		this.year=year;
	}
}



public class fourth_C {

	public static void main(String[] args) {
		car a = new car("BMW" , 2000);
		System.out.println("Brand name= " + a.brand);
		System.out.println("Year= " + a.year); 
		
	}

}
