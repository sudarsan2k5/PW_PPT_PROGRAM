public class Arranging_Coins {
    public static int arrangeCoins(int n) {
        int row = 0;
        while (n >= row + 1) {
            row++;
            n -= row;
        }
        return row;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);  // Output: 2
    }
}
