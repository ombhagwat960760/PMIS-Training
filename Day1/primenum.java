package rushomya;

public class primenum {

	public static void main(String[] args) {
		int num=8;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Is a prime number");
		}else {
			System.out.println("Is not a prime number");
		}

	}

}
