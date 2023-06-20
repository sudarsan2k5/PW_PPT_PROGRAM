import java.util.Scanner;

public class Move_Zeroes {
    public static void Move_Zeroes(int[] arr){
        int insertPosition = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){
                arr[insertPosition] = arr[i];
                insertPosition++;
            }
        }
        while(insertPosition < arr.length){
            arr[insertPosition++] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
}
