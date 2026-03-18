import java.util.Scanner;

public class RoundDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.print("Enter decimal places: ");
        int n = sc.nextInt();

        double scale = Math.pow(10, n);
        double result = Math.round(num * scale) / scale;

        System.out.println("Rounded value: " + result);
    }
}