import java.util.Arrays;
import java.util.Scanner;

public class Convert_1D_Array_Into_2D_Array {
    public static int[][] convert_2d(int[] arr, int r, int c){
        if(arr.length != r * c) return new int[0][0];
        int ans[][] = new int[r][c];
        for(int i = 0; i < arr.length; i++){
            int numOfRow = i / c;
            int numOfClm = i % c;
            ans[numOfRow][numOfClm] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Num of Rows: ");
        int r = scn.nextInt();
        System.out.print("Number Of Colms: ");
        int c = scn.nextInt();
        System.out.print("Enter Array Size: ");

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[][] result = convert_2d(arr, r, c);
        System.out.print(Arrays.deepToString(result));
//        for(int i = 0; i < result.length; i++){
//            for(int j = 0; j < result[i].length; j++){
//                System.out.print(result[i][j] + " ");
//            }
//        }
    }
}
