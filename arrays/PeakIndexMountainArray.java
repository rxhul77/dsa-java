package arrays;

/**
 * LeetCode 852: Peak Index in a Mountain Array
 *
 * Pattern: Binary Search
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PeakIndexMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid - 1;
        }
        return 123123;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 3, 1};

        int result = peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + result);
        System.out.println("Peak element: " + arr[result]);
    }
}