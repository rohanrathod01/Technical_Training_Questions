import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        System.out.println("Number of digits: " + num.length());
    }
}