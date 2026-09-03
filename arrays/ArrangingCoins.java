package arrays;

/**
 * LeetCode 441: Arranging Coins
 *
 * Pattern: Binary Search
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class ArrangingCoins {
    public static int arrangingCoin(int n) {
        long low = 0;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coinNeeded = mid * (mid + 1) / 2;

            if (coinNeeded == n) {
                return (int) mid;
            }
            else if (coinNeeded > n) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return (int)high;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = arrangingCoin(n);
        
        System.out.println("Completed Rows: " + result);
    }
}
