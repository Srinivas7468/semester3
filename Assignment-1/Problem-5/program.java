```java
import java.util.Scanner;

public class ReverseCustomerName {

    // Method to reverse the customer name
    static String reverseCustomerName(String customerName) {

        String reversed = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed = reversed + customerName.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept customer name
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        // Call the method
        String reversedName = reverseCustomerName(customerName);

        // Display original and reversed names
        System.out.println("\nOriginal Name  : " + customerName);
        System.out.println("Reversed Name  : " + reversedName);

        sc.close();
    }
}
```
