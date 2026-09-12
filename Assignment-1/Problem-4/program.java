```java
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    static char findFirstNonRepeatingChar(String text) {

        // Check frequency of each character
        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            int count = 0;

            // Count how many times the character appears
            for (int j = 0; j < text.length(); j++) {

                if (currentChar == text.charAt(j)) {
                    count++;
                }
            }

            // If character appears only once
            if (count == 1) {
                return currentChar;
            }
        }

        // Return '\0' if no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a word or sentence: ");
        String text = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingChar(text);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character exists.");
        }

        sc.close();
    }
}
```
