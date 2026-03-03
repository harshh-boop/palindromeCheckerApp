import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Stack-based approach
    public static boolean stackPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based approach
    public static boolean dequePalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer approach
    public static boolean twoPointerPalindrome(String word) {
        int start = 0, end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba"; // long test string

        // Stack approach timing
        long start = System.nanoTime();
        stackPalindrome(word);
        long end = System.nanoTime();
        System.out.println("Stack Approach : " + (end - start) + " ns");

        // Deque approach timing
        start = System.nanoTime();
        dequePalindrome(word);
        end = System.nanoTime();
        System.out.println("Deque Approach : " + (end - start) + " ns");

        // Two-pointer approach timing
        start = System.nanoTime();
        twoPointerPalindrome(word);
        end = System.nanoTime();
        System.out.println("Two-Pointer Approach : " + (end - start) + " ns");
    }
}