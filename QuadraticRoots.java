import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots: " + r1 + " , " + r2);
        } else if (D == 0) {
            double r = -b / (2 * a);
            System.out.println("Equal Roots: " + r);
        } else {
            System.out.println("Complex roots (not real)");
        }
    }
}
