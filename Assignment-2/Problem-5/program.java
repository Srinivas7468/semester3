import java.util.*;

public class StopWordFilteredWordFrequency {

    void printFilteredWordFrequency(String feedback) {

        // Stop words
        Set<String> stopWords = new HashSet<>(
                Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );

        // Convert to lowercase
        String text = feedback.toLowerCase();

        // Remove punctuation
        text = text.replace(".", "");
        text = text.replace(",", "");

        // Split into words
        String[] words = text.split("\\s+");

        // HashMap to store word frequency
        HashMap<String, Integer> frequency = new HashMap<>();

        // Count words
        for (String word : words) {

            // Skip stop words
            if (stopWords.contains(word)) {
                continue;
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        // Sort entries by count in descending order
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        // Print result
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();

        StopWordFilteredWordFrequency obj =
                new StopWordFilteredWordFrequency();

        obj.printFilteredWordFrequency(feedback);

        sc.close();
    }
}
