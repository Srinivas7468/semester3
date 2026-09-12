```java
import java.util.Scanner;

public class WordReversalEncoder {

    // Method to reverse every word
    static String reverseEachWord(String sentence) {

        // Split sentence into words
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        // Reverse each word
        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            word.reverse();

            result.append(word);

            // Add space between words
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call the method
        String reversedSentence = reverseEachWord(sentence);

        // Display result
        System.out.println("Reversed sentence: " + reversedSentence);

        sc.close();
    }
}
```
