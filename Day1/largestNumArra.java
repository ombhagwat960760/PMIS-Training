package rushomya;

public class largestNumArra {

	public static void main(String[] args) {
		 int arr[] = {10, 40, 25, 60};

	        int max = arr[0];

	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Largest: " + max);

	}

}
