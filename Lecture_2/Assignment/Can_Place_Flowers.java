import java.util.Scanner;
public class Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] arr, int n){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 &&
                    (i == 0 || arr[i - 1] == 0) &&
                    (i == arr.length - 1 || arr[i + 1] == 0)) {
                arr[i] = 1;
                count++;
            }
        }

        return count >= n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = scn.nextInt();
        System.out.print("Enter Array Size: ");
        int a = scn.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        boolean canPlant = canPlaceFlowers(arr, n);
        System.out.println(canPlant);
    }
}
