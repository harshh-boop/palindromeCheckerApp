public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: single character or crossed indices
        if (start >= end) {
            return true;
        }

        // If mismatch, return false
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
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