/* Question --> Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping
intervals, and return an array of the non-overlapping intervals that cover all the intervals
in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

The name of this question in LeetCode is "Contiguous Array."
*/
import java.util.HashMap;
import java.util.Scanner;

public class Q_4_Contiguous_Array {
    public static int contiguous(int[] arr){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                sum += -1;
            }else if(arr[i] == 1){
                sum += +1;
            }
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int len = i - idx;
                if(len > ans){
                    ans = len;
                }else{
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(contiguous(arr));
    }
}
