import java.util.Arrays;
import java.util.Scanner;

public class Plus_One {
    public static int[] solution(int arr[]){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int new_Num[] = new int[arr.length + 1];
        new_Num[0] = 1;
        return new_Num;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}
