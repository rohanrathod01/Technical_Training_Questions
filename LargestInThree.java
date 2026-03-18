import java.util.Scanner;

public class LargestInThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers Are Equal!");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest Number: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest Number: " + num2);
        } else {
            System.out.println("Largest Number: " + num3);
        }
    }
}