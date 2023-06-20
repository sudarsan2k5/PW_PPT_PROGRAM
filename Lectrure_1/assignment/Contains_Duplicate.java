import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Contains_Duplicate {
    public static boolean contains_Duplicate(int[] arr){
        Set<Integer> intSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(intSet.contains(arr[i])){
                return true;
            }else{
                intSet.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(contains_Duplicate(arr));
    }
}
