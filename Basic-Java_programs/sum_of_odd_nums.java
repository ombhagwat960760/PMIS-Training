package day4;
import java.util.*;

public class sum_of_odd_nums {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a n : ");
		int n = sc.nextInt();
		
		int sum=0;
		for(int a =1 ; a<=n ; a++) {
			if(a%2 != 0) {
				sum =sum+a;
			}
		}
		System.out.println("sum of odd numbers : " +sum);
		
		

	}

}
