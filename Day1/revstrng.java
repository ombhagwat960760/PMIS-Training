package rushomya;

public class revstrng {

	public static void main(String[] args) {
		String a="RUSH";
		String rev="";
		for(int i=a.length()-1 ; i>=0 ; i--) {
			rev = rev+a.charAt(i);
		}
		System.out.println("Before : " + a);
		System.out.println("After : " + rev);

	}

}
