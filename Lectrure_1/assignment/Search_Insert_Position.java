import java.util.Scanner;

public class Search_Insert_Position {
    public static int solution(int []arr, int trg){
        int st = 0;
        int end = arr.length - 1;
        while(st <= end){
            int mid = (st + end) / 2;
            if(arr[mid] == trg){
                return mid;
            }
            else if(arr[mid] > trg){
                    end = mid - 1;
            }
            else{
                    end = mid + 1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter Target: ");
//        int trg = scn.nextInt();
//        System.out.print("Enter Array Length: ");
//        int n  = scn.nextInt();
//        int []arr = new int[n];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
        int arr[] = {3, 2, 2, 3};
        int trg = 3;
        System.out.print(solution(arr, trg));

    }
}
