import java.util.ArrayList;
import java.util.List;

public class Intersection_of_Three_Sorted_Arrays {
    public static List<Integer> findComElements(int[] arr1, int[] arr2, int[] arr3) {
        int p1 = 0, p2 = 0, p3 = 0;
        List<Integer> result = new ArrayList<>();

        while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
            if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                result.add(arr1[p1]);
                p1++;
                p2++;
                p3++;
            } else {
                int minValue = Math.min(Math.min(arr1[p1], arr2[p2]), arr3[p3]);
                if (arr1[p1] == minValue) {
                    p1++;
                }
                if (arr2[p2] == minValue) {
                    p2++;
                }
                if (arr3[p3] == minValue) {
                    p3++;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        List<Integer> result = findComElements(arr1, arr2, arr3);
        System.out.println(result);
    }
    }
