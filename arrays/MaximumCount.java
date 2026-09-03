package arrays;

/**
 * LeetCode 2529: Maximum Count of Positive Integer and Negative Integer
 *
 * Pattern: Binary Search
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class MaximumCount {
    public static int maximumCount(int [] nums) {
        int n = nums.length;

        //for the first positive element
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        int positiveCount = n - low;

        //for the first negative element
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        int negativeCount = high + 1;

        return Math.max(positiveCount, negativeCount );
    }
    public static void main(String[] args) {
        
        int [] nums = {-2, -1, -1, 1, 2, 3, 3};
        int result = (maximumCount(nums));
        
        System.out.println("Maximum Count: " + result);
    }
}
