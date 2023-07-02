public class Reverse_String_II {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k)); // Output: "bacdfeg"
    }
}
