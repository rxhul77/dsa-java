package arrays;

/**
 * LeetCode 1: Two Sum
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[][] nums = new int[arr.length][2];

        // Store value and original index
        for (int i = 0; i < arr.length; i++) {
            nums[i][0] = arr[i];  // value
            nums[i][1] = i;       // original index
        }

        // Sort according to value
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left][0] + nums[right][0];

            if (sum == target) {

                System.out.println("Indexes: " + nums[left][1] + ", " + nums[right][1]);

                System.out.println("Values: " + nums[left][0] + ", " + nums[right][0]);

                return;
            }
            else if (sum > target) {
                right--;
            }
            else {
                left++;
            }
        }

        System.out.println("No pair found.");
    }
}