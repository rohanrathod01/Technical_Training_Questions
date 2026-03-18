import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alphabet : ");
        char x = sc.nextLine().charAt(0);

         if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println("Alphabet is Vowel !");
         }else{
            System.out.println("Alphabet is Consonent !");
         }
    }
}
