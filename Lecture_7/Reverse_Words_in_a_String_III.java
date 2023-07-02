public class Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
        // Split the string into an array of words
        String[] words = s.split(" ");

        // Reverse the characters in each word
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversed.append(reversedWord.reverse()).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
