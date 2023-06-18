import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Target: ");
        int trg = scn.nextInt();
        System.out.print("Enter Array Length: ");
        int n  = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == trg){
                System.out.print(i);
            }
        }
    }
}
