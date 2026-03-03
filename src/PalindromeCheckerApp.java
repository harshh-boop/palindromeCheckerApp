public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: single char or crossed indices
        if (start >= end) {
            return true;
        }

        // If mismatch, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for next indices
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "racecar";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        System.out.println("Original String : " + word);

        if (result) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}