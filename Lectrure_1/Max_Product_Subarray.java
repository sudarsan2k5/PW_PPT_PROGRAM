import java.util.Scanner;

public class Max_Product_Subarray {
    public static int solution(int[] arr){
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(solution(arr));
    }
}
