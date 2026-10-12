package rushomya;
import java.util.*;
public class LanguageEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("you know python: please enter y or n");
		String a = sc.next();
		System.out.println("you know frentch: please enter y or n");
		String b = sc.next();
		
		if(a=="y"&& b=="y") {
			System.out.println("you can apply");
		}else if(a=="n"&& b=="y"){
			System.out.println("you need to learn python");
			
		}else if(a=="y"&& b=="n"){
			System.out.println("you need to learn frentch");
			
		}
		else {
			System.out.println("you are not eligible or learn both language");
		}

	}

}
