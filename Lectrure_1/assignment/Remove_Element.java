import java.util.Scanner;

public class Remove_Element {
    public static int solution(int [] arr, int val){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Val: ");
        int val = scn.nextInt();
        System.out.print("Enter Array Size: ");
        int ar = scn.nextInt();
        int arr[] = new int[ar];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(solution(arr, val));
    }
}
