import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Enter Divisor : ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient : " + quotient);
        System.out.println("The Remainder : " + remainder);
    }
}
