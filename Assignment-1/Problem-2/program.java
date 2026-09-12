```java
import java.util.Scanner;

public class PalindromeChecker {

    // 1. Iterative method
    static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 2. Recursive method
    static boolean isPalindromeRecursive(String text) {

        // Base case
        if (text.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        // Remove first and last characters
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    // 3. Array reversal method
    static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();

        char[] reversed = new char[original.length];

        // Reverse the array
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {

            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a word or text: ");
        String text = sc.nextLine();

        // Call all three methods
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text);
        boolean arrayResult = isPalindromeArrayReversal(text);

        // Display results
        System.out.println("\n========== PALINDROME CHECK ==========");

        System.out.println("Input Text: " + text);

        System.out.println("Iterative Method       : " + iterativeResult);
        System.out.println("Recursive Method       : " + recursiveResult);
        System.out.println("Array Reversal Method  : " + arrayResult);

        // Check whether all three agree
        if (iterativeResult == recursiveResult &&
            recursiveResult == arrayResult) {

            System.out.println("\nAll three methods agree.");
        } else {

            System.out.println("\nMethods do not agree.");
        }

        sc.close();
    }
}
```
