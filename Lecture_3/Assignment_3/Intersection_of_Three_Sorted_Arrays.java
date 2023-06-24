import java.util.ArrayList;
import java.util.List;
public class Intersection_of_Three_Sorted_Arrays {
    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int ptr1 = 0;
        int ptr2 = 0;
        int ptr3 = 0;

        List<Integer> result = new ArrayList<>();

        while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
            if (arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) {
                result.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
                ptr3++;
            } else if (arr1[ptr1] < arr2[ptr2]) {
                ptr1++;
            } else if (arr2[ptr2] < arr3[ptr3]) {
                ptr2++;
            } else {
                ptr3++;
            }
        }

        int[] commonElements = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            commonElements[i] = result.get(i);
        }

        return commonElements;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] commonElements = findCommonElements(arr1, arr2, arr3);

        for (int element : commonElements) {
            System.out.print(element + " ");
        }
        // Output: 1 5
    }
}
