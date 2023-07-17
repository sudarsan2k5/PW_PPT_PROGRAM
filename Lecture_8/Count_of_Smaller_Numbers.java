public class Count_of_Smaller_Numbers {
    public static int mergeSortAndCountInversions(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;
        int count = 0;

        count += mergeSortAndCountInversions(arr, start, mid);
        count += mergeSortAndCountInversions(arr, mid + 1, end);
        count += mergeAndCountInversions(arr, start, mid, end);

        return count;
    }

    public static int mergeAndCountInversions(int[] arr, int start, int mid, int end) {
        int count = 0;
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[start + i];
        }

        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (mid - start + 1) - i;
            }
        }

        while (i < leftSize) {
            arr[k++] = left[i++];
        }

        while (j < rightSize) {
            arr[k++] = right[j++];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int count = mergeSortAndCountInversions(arr, 0, arr.length - 1);

        // Printing the result
        System.out.println(count); // Output: 3
    }
}
