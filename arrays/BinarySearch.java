package arrays;

/**
 * LeetCode 704: Binary Search
 *
 * Pattern: Binary Search
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class BinarySearch {
    public static int search(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}