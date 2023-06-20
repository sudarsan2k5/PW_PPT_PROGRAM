import java.util.Scanner;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public static int[] Merge_Sorted_Array(int arr1[], int arr2[]){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr[k] = arr1[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Size For First Array: ");
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        System.out.print("Enter Size For Second Array: ");
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[2] = scn.nextInt();
        }
        System.out.print(Arrays.toString(arr1));
    }
}
