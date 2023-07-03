public class Valid_Parenthesis_String {
    public static boolean isValid(String s) {
        return isValidHelper(s, 0, 0);
    }

    private static boolean isValidHelper(String s, int i, int openCount) {
        if (i == s.length()) {
            return openCount == 0;
        }

        char c = s.charAt(i);
        if (c == '*') {
            return isValidHelper(s, i + 1, openCount) ||
                    isValidHelper(s, i + 1, openCount + 1) ||
                    (openCount > 0 && isValidHelper(s, i + 1, openCount - 1));
        } else if (c == '(') {
            return isValidHelper(s, i + 1, openCount + 1);
        } else if (c == ')') {
            return openCount > 0 && isValidHelper(s, i + 1, openCount - 1);
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        boolean result = isValid(s);
        System.out.println(result);  // Output: true
    }
}
