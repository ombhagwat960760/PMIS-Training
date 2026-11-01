package oops;
class rectangle{
	int length;
	int width;
	int results;
	
	rectangle(int length , int width){
		this.length=length;
		this.width=width;
	}
		
		void calculateArea(){
			results = length*width;
			System.out.println("Area = " + results);
		}
	}


public class fifth_C {

	public static void main(String[] args) {
		rectangle a= new rectangle(10 ,20);
		a.calculateArea();
		

	}

}
