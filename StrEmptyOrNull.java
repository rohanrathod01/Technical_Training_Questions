import java.util.Scanner;

public class StrEmptyOrNull {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        if (str == null || str.isEmpty()) {
            System.out.println("String is null or empty");
        } else {
            System.out.println("String has value");
        }
    }
}
