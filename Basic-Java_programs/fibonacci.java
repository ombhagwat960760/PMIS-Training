package day4;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}