import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter A NUm: ");
        int n = scn.nextInt();
        System.out.print(fact(n));
    }
}
