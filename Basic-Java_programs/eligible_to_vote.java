package day4;
import java.util.*;

public class eligible_to_vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int a= sc.nextInt();
		
		if(a>=18) {
			System.out.println("You Are Eligible To Vote");
		}
		else {
			System.out.println("You Are Not Eligible To Vote");
		}

	}

}
