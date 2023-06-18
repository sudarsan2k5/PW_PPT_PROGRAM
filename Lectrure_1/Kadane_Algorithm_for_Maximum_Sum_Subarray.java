import java.util.Scanner;

public class Kadane_Algorithm_for_Maximum_Sum_Subarray {
    public static int solution(int[] arr){
        int csum = arr[0];
        int osum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(csum > 0){
                csum += arr[i];
            }else{
                csum = arr[i];
            }
            if(csum > osum){
                osum = csum;
            }
        }
        return osum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(solution(arr));
    }
}
