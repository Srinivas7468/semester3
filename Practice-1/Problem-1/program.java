```java
import java.util.Scanner;

public class DuplicateSeatChecker {

    // Method to check duplicate seat numbers
    static void checkDuplicateSeats(int[] seatNumbers) {

        boolean duplicateFound = false;

        System.out.println("\nDuplicate Seat Numbers:");

        // Compare every seat with every other seat
        for (int i = 0; i < seatNumbers.length; i++) {

            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println(seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        // Display confirmation if no duplicates exist
        if (!duplicateFound) {
            System.out.println("No duplicate seat numbers found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
```
