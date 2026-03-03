public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "A man, a plan, a canal, Panama";

        // Normalize: lowercase and remove non-alphanumeric characters
        String normalized = original.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Original String : " + original);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}