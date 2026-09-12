import java.util.Scanner;

public class LibraryISBNNormalizer {

    // Method to normalize the code
    String normalizeCode(String raw) {
        raw = raw.trim();

        if (raw.length() < 3) {
            return raw.toUpperCase();
        }

        String publisher = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);

        return publisher + remaining;
    }

    // Method to validate and format the code
    String validateAndFormat(String code) {

        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code";
            }
        }

        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        // Extract publisher, year and catalog number
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        // Build formatted output using StringBuilder
        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(publisher)
              .append("] YEAR: ")
              .append(year)
              .append(" | CATALOG: ")
              .append(catalog);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String rawCode = sc.nextLine();

        LibraryISBNNormalizer obj = new LibraryISBNNormalizer();

        String normalizedCode = obj.normalizeCode(rawCode);

        String result = obj.validateAndFormat(normalizedCode);

        System.out.println(result);

        sc.close();
    }
}
