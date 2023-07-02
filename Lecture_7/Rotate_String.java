public class Rotate_String {
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String s2 = s + s;
        return s2.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShift(s, goal)); // Output: true
    }
}
