package day4;
import java.util.*;

public class greater_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a + " Is the Greater Number");
		}else if(b>a) {
			System.out.println(b + " Is the Greater Number");
		}else {
			System.out.println("Both Are Equal");
		}
	
	}

}
