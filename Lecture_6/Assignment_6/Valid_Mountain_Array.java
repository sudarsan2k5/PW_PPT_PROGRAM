public class Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;

        // Check if the array length is less than 3
        if (n < 3) {
            return false;
        }

        int i = 0;

        // Traverse up the mountain
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check if the peak is not at the first or last index
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Traverse down the mountain
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Check if all elements after the peak are decreasing
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        boolean isValidMountain = validMountainArray(arr);
        System.out.println(isValidMountain);
    }
}
