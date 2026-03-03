import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < word.length(); i++) {

            char poppedChar = stack.pop();

            if (word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Original String : " + word);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}