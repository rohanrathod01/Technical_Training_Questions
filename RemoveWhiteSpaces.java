import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter White Space Sting : ");
        String str = sc.nextLine();

        String newStr = str.replaceAll("\\s", "");

        System.out.println("White Space Removed : "+newStr);
    }
}
