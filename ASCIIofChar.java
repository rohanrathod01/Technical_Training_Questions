import java.util.Scanner;

public class ASCIIofChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = sc.nextLine().charAt(0);

        int asciiValue1 = ch;

        int asciiValue2 = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' (Method 1) is: " + asciiValue1);
        System.out.println("The ASCII value of '" + ch + "' (Method 2) is: " + asciiValue2);

    }
}
