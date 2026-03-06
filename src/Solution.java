import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is any input to read
        if (!sc.hasNextLine()) {
            return;
        }

        // 1. Read the entire line of text
        String line = sc.nextLine();
        
        // 2. Split the line into individual words based on spaces
        String[] words = line.split("\\s+");

        // 3. Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // If the word is empty (could happen with extra spaces), skip it
            if (word.isEmpty()) continue;

            // 4. Update the count in the map
            // getOrDefault returns the current count or 0 if it's the first time seeing the word
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 5. Print the unique words and their counts
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}