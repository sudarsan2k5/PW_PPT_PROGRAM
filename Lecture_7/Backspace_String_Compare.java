import java.util.Stack;
public class Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stackS.push(c);
            } else if (!stackS.isEmpty()) {
                stackS.pop();
            }
        }

        for (char c : t.toCharArray()) {
            if (c != '#') {
                stackT.push(c);
            } else if (!stackT.isEmpty()) {
                stackT.pop();
            }
        }

        if (stackS.size() != stackT.size()) {
            return false;
        }

        while (!stackS.isEmpty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t)); // Output: true
    }
}
