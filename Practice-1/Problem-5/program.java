```java
import java.util.Scanner;

public class WordLengthClassifier {

    // Method to classify word lengths
    static void classifyWordLengths(String review) {

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        // Split the review into words
        String[] words = review.trim().split("\\s+");

        // Check each word
        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } 
            else if (length >= 5 && length <= 8) {
                mediumWords++;
            } 
            else if (length >= 9) {
                longWords++;
            }
        }

        // Display the result
        System.out.println("\n========== WORD LENGTH REPORT ==========");
        System.out.println("Short Words  (1-4 letters) : " + shortWords);
        System.out.println("Medium Words (5-8 letters) : " + mediumWords);
        System.out.println("Long Words   (9+ letters)  : " + longWords);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept movie review
        System.out.print("Enter your movie review: ");
        String review = sc.nextLine();

        // Call the method
        classifyWordLengths(review);

        sc.close();
    }
}
```
