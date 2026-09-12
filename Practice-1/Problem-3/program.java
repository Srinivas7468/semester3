```java
import java.util.Scanner;

public class LongestSignalStreak {

    // Method to find the longest streak
    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0) {
            System.out.println("Signal log is empty.");
            return;
        }

        char currentColor = signalLog.charAt(0);
        char longestColor = currentColor;

        int currentStreak = 1;
        int longestStreak = 1;

        // Scan the signal log
        for (int i = 1; i < signalLog.length(); i++) {

            // If current color is same as previous color
            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {

                // Start a new streak
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }

            // Check if current streak is the longest
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = currentColor;
            }
        }

        // Display result
        System.out.println("\n========== TRAFFIC SIGNAL REPORT ==========");
        System.out.println("Signal Log: " + signalLog);
        System.out.println("Longest Streak Color : " + longestColor);
        System.out.println("Longest Streak Length: " + longestStreak);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept signal log
        System.out.print("Enter signal log (R/Y/G): ");
        String signalLog = sc.nextLine().toUpperCase();

        // Check valid input
        boolean valid = true;

        for (int i = 0; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);

            if (c != 'R' && c != 'Y' && c != 'G') {
                valid = false;
                break;
            }
        }

        if (valid) {
            findLongestStreak(signalLog);
        } else {
            System.out.println("Invalid input. Use only R, Y, and G.");
        }

        sc.close();
    }
}
```
