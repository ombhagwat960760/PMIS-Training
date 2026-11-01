package day4;
import java.util.*;

public class count_of_po_ng_zeors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int num;

        System.out.println("Enter 1 to continue and 0 to stop:");
        int choice = sc.nextInt();

        while (choice == 1) {

            System.out.println("Enter number:");
            num = sc.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;

            System.out.println("Enter 1 to continue and 0 to stop:");
            choice = sc.nextInt();
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}