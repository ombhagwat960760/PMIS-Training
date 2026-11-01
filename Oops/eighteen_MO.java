package oops;
class book{
	String title;
	String author;
	int price;
	
	book(String title){
		this.title=title;
		author = "Unknown";
		price = 0;
		
	}
    book(String title,String author,int price){
	this.title=title;
	this.author=author;
	this.price=price;
	
	
	}
    void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}

public class eighteen_MO {

	public static void main(String[] args) {
		book b1 = new book("chava");
        b1.display();
	}

}
