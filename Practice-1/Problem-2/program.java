```java
import java.util.Scanner;

public class TypingAccuracyChecker {

    // Method to check typing accuracy
    static void checkTypingAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int firstMismatch = -1;

        // Compare characters one by one
        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        // Calculate accuracy
        double accuracy = ((double) matchedCharacters / original.length()) * 100;

        // Display results
        System.out.println("\n========== TYPING ACCURACY ==========");
        System.out.println("Original Text : " + original);
        System.out.println("Typed Text    : " + typed);
        System.out.println("Matched Characters : " + matchedCharacters);
        System.out.printf("Accuracy : %.2f%%%n", accuracy);

        // Display first mismatch
        if (firstMismatch == -1) {
            System.out.println("No mismatches found. Perfect typing!");
        } else {
            System.out.println("First mismatch position : " + (firstMismatch + 1));
            System.out.println("Original character      : " 
                               + original.charAt(firstMismatch));
            System.out.println("Typed character         : " 
                               + typed.charAt(firstMismatch));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept original passage
        System.out.print("Enter original passage: ");
        String original = sc.nextLine();

        // Accept user's typed text
        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        // Check if both strings have equal length
        if (original.length() != typed.length()) {
            System.out.println("Error: Both texts must have equal length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}
```
