import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Distribute_Candies {
    public static int maxDifCandies(int[] candyType) {
        Set<Integer> unqTyp = new HashSet<>();

        for (int type : candyType) {
            unqTyp.add(type);
        }

        int maxTypes = Math.min(unqTyp.size(), candyType.length / 2);
        return maxTypes;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int maxTypes = maxDifCandies(arr);
        System.out.println(maxTypes);
    }
}
