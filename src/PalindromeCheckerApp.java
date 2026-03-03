import java.util.Stack;

public class PalindromeCheckerApp {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Compare popped characters with original
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "level";

        // Create instance of PalindromeChecker
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(word);

        System.out.println("Original String : " + word);

        if (result) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}