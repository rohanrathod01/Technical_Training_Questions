import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;

        int[] result = new int[n];
        int[] stack = new int[n]; // store indices
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {

            // remove smaller elements
            while (top >= 0 && arr[stack[top]] <= arr[i]) {
                top--;
            }

            // assign result
            if (top == -1) {
                result[i] = -1;
            } else {
                result[i] = arr[stack[top]];
            }

            // push current index
            stack[++top] = i;
        }

        System.out.println(Arrays.toString(result));
    }
}