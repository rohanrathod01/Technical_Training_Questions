public class RemoveDuplicates {
    public static void main(String[] args) {

        String s = "abbaca";

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            int len = sb.length();

            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1); // remove pair
            } else {
                sb.append(ch); // push
            }
        }

        System.out.println("Output = " + sb.toString());
    }
}