import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Target: ");
        int num = scn.nextInt();
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == num){
                    int a[] = {i, j};
                    for(int k = 0; k < a.length; k++){
                        System.out.print(k + ",");
                    }
                }
            }
        }
    }
}
