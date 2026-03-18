import java.util.Arrays;

public class LexicographicalOrder {
    public static void main(String[] args) {

        String[] words = {"banana", "apple", "mango", "grape"};

        Arrays.sort(words);

        System.out.println("Sorted order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}