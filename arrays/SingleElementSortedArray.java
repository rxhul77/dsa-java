package arrays;

/**
 * LeetCode 540: Single Element in a Sorted Array
 *
 * Pattern: Binary Search
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class SingleElementSortedArray {
    public static int sortedNonDuplicate(int [] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // make mid even
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                // pair is correct , single element is on the right
                low = mid + 2;
            }
            else {
                // pair is broken , single element is on the left
                high = mid;
            }
        }return arr[low];
    }

    public static void main(String [] args) {
        int [] arr = {1 , 1 , 2 , 3 , 3 , 4 , 4 , 8 , 8};
        int result = sortedNonDuplicate(arr);
        
        System.out.println("Single Element: " + result);
    }
}
