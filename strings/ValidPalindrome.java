package strings;

/**
 * 
 * LeetCode 125: Valid Palindrome
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from the left.
            while (
                left < right &&
                !Character.isLetterOrDigit(s.charAt(left))
            ) {
                left++;
            }

            // Skip non-alphanumeric characters from the right.
            while (
                left < right &&
                !Character.isLetterOrDigit(s.charAt(right))
            ) {
                right--;
            }

            // Convert both characters to lowercase.
            char leftCharacter =
                Character.toLowerCase(s.charAt(left));

            char rightCharacter =
                Character.toLowerCase(s.charAt(right));

            // If characters are different, it is not a palindrome.
            if (leftCharacter != rightCharacter) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);

        System.out.println(result);
    }
}