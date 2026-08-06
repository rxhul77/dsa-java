package arrays;

import java.util.Arrays;

/**
 * LeetCode 167: Two Sum II - Input Array Is Sorted
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // LeetCode requires 1-based indexes.
                return new int[]{left + 1, right + 1};
            }

            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}